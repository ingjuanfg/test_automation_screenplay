package co.com.ingjuanfg.tasks;

import co.com.ingjuanfg.interactions.SelectDateCalander;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.yecht.Data;

import static co.com.ingjuanfg.user_interfaces.FligthFormPage.TXT_FLYFROM;
import static co.com.ingjuanfg.user_interfaces.FligthFormPage.TXT_FLYTO;
import static co.com.ingjuanfg.utils.constants.TravelocityOptionsConstants.DEPARTING;
import static co.com.ingjuanfg.utils.constants.TravelocityOptionsConstants.RETURNING;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchFlight implements Task {
    private String   departingDate;
    private String   returningDate;
    private  String  flyingFrom;
    private String flyingto;

    public SearchFlight(String flyingFrom,String flyingto,String departingDate, String returningDate) {
        this.departingDate = departingDate;
        this.returningDate = returningDate;
        this.flyingFrom = flyingFrom;
        this.flyingto = flyingto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectDateCalander.selectDateFligth(DEPARTING,departingDate),
                SelectDateCalander.selectDateFligth(RETURNING,returningDate)
        );

    }

    public static Performable informationFlight(String flyingFrom, String flyingto, String departingDate,String returningDate){
        return instrumented(SearchFlight.class, flyingFrom,flyingto,departingDate,returningDate);
    }
}
