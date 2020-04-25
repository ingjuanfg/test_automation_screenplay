package co.com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Choose{

    public static Performable destinyFlight() {
        return instrumented(DestinyFlight.class);
    }

    public static Performable returningFlight() {
        return instrumented(ReturningFlight.class);
    }
}
