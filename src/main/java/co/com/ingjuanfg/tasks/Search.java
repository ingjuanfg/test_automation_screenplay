package co.com.ingjuanfg.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Performable;

public class Search {

  public static Performable flight() {
    return instrumented(Flight.class);
  }

  public static Performable car() {
    return instrumented(Car.class);
  }
}
