package co.com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.ingjuanfg.user_interfaces.CreateAccountPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Create implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("a@asdasdadas.com").into(TXT_EMAIL_ADDRESS),
                Click.on(BTN_TO_CREATE_ACCOUNT),
                WaitUntil.the(FRM_CREATE_ACCOUNT, isPresent())
        );
    }

    public static Performable account(){
        return instrumented(Create.class);
    }
}
