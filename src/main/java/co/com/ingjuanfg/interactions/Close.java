package co.com.ingjuanfg.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static co.com.ingjuanfg.user_interfaces.SelectFlightsPage.LNK_NO_THANKS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Close implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(LNK_NO_THANKS.resolveFor(actor).isClickable()).andIfSo(
                        Click.on(LNK_NO_THANKS)
                )
        );
/*        WebDriverWait wait = new WebDriverWait(getProxiedDriver(), 30000);
        try {
                if(LNK_NO_THANKS.resolveFor(actor).getSize().height != 0){
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//span[@class='no-thanks-content']//a")));
                    LNK_NO_THANKS.resolveFor(actor).click();
                }
            }catch (NoSuchElementException e){
            System.out.println(e);
            }*/
    }

    public static Performable popUps(){
        return instrumented(Close.class);
    }
}
