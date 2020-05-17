package co.com.ingjuanfg.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public abstract class FillOut implements Task {

  public static Performable form(Map<String, String> personalInformation) {
    return instrumented(FormRegisterMap.class, personalInformation);
  }

  public static Performable form() {
    return instrumented(FormRegisterCsv.class);
  }

  public static Performable form(List<Map<String, String>> personalInformation) {
    return instrumented(FormRegisterListMap.class, personalInformation);
  }

  public static Performable form(
      String title,
      String firstName,
      String lastName,
      String password,
      String dayBirth,
      String monthBirth,
      String yearBirth,
      String company,
      String address,
      String city,
      String state,
      String postalCode,
      String additionalInfo,
      String homePhone,
      String mobilePhone,
      String alias) {
    return instrumented(
        FormRegisterString.class,
        title,
        firstName,
        lastName,
        password,
        dayBirth,
        monthBirth,
        yearBirth,
        company,
        address,
        city,
        state,
        postalCode,
        additionalInfo,
        homePhone,
        mobilePhone,
        alias);
  }
}
