package co.com.ingjuanfg.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Performable;

public class Choose {

  public static Performable destinyFlight() {
    return instrumented(DestinyFlight.class);
  }

  public static Performable returningFlight() {
    return instrumented(ReturningFlight.class);
  }
}
