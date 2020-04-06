package co.com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search {

    public static Performable flight(Map<String, String> detailsFlight) {
        return instrumented(Flight.class, detailsFlight);
    }

    public static Performable car() {
        return instrumented(Car.class);
    }

}
