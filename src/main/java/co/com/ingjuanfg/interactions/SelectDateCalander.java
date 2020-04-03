package co.com.ingjuanfg.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;


import static co.com.ingjuanfg.user_interfaces.FligthFormPage.BTN_DATE_CALANDER;
import static co.com.ingjuanfg.user_interfaces.FligthFormPage.BTN_NEXT_MONTH;
import static co.com.ingjuanfg.user_interfaces.FligthFormPage.TXT_DATE_FORM_FLIGHT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.conditions.Check.*;

public class SelectDateCalander implements Interaction {
    private String  flightDate;
    private String   date;

    public  SelectDateCalander(String flightDate, String date){
        this.flightDate = flightDate;
        this.date = date;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(Click.on(TXT_DATE_FORM_FLIGHT.of(flightDate)));
     String[] dateSplit = date.split("/");
     int  month =  Integer.parseInt(dateSplit[1])- 1;
        for (int i = 0; i <=10 ; i++) {
            if(BTN_DATE_CALANDER.of(String.valueOf(month),dateSplit[0],dateSplit[2]).resolveFor(actor).isVisible()){
                actor.attemptsTo(
                        Click.on(BTN_DATE_CALANDER.of(String.valueOf(month),dateSplit[0],dateSplit[2]))
                );
                break;
            }else{
                actor.attemptsTo(
                        Click.on(BTN_NEXT_MONTH)
                );
            }
        }

           /* actor.attemptsTo(Check.whether(BTN_DATE_CALANDER.of(String.valueOf(month),dateSplit[0],dateSplit[2]).resolveFor(actor).isVisible())
            .andIfSo(Click.on(BTN_DATE_CALANDER.of(String.valueOf(month),dateSplit[0],dateSplit[2])))
                    .otherwise(Click.on(BTN_NEXT_MONTH)));
            }*/

    // actor.attemptsTo(Click.on(BTN_DATE_CALANDER.of(String.valueOf(month),dateSplit[0],dateSplit[2])));

    }

    public static Performable selectDateFligth(String departing, String flightDate) {
        return instrumented(SelectDateCalander.class, departing,flightDate);
    }
}
