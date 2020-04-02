package co.com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search {

    public static Performable flight() {
        return instrumented(Flight.class);
    }

    public static Performable car() {
        return instrumented(Car.class);
    }

}
