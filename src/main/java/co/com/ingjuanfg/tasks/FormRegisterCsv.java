package co.com.ingjuanfg.tasks;

import static co.com.devco.automation.externaldata.DataCSV.getDataCsv;
import static co.com.ingjuanfg.userinterface.CreateAccountPage.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FormRegisterCsv extends FillOut {
  private List<Map<String, String>> personalInformation;

  public FormRegisterCsv() throws IOException {
    personalInformation = getDataCsv("personal_information", "");
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(OPT_TITLE.of(personalInformation.get(0).get("title"))),
        Enter.theValue(personalInformation.get(0).get("firstName")).into(TXT_FIRST_NAME_PI),
        Enter.theValue(personalInformation.get(0).get("lastName")).into(TXT_LAST_NAME_PI),
        Enter.theValue(personalInformation.get(0).get("password")).into(TXT_PASSWORD),
        SelectFromOptions.byValue(personalInformation.get(0).get("dayBirth")).from(SLT_DAY_BIRTH),
        SelectFromOptions.byValue(personalInformation.get(0).get("monthBirth"))
            .from(SLT_MONTH_BIRTH),
        SelectFromOptions.byValue(personalInformation.get(0).get("yearBirth")).from(SLT_YEAR_BIRTH),
        Enter.theValue(personalInformation.get(0).get("firstName")).into(TXT_FIRST_NAME_YA),
        Enter.theValue(personalInformation.get(0).get("lastName")).into(TXT_LAST_NAME_YA),
        Enter.theValue(personalInformation.get(0).get("company")).into(TXT_COMPANY),
        Enter.theValue(personalInformation.get(0).get("address")).into(TXT_ADDRESS),
        Enter.theValue(personalInformation.get(0).get("city")).into(TXT_CITY),
        SelectFromOptions.byVisibleText(personalInformation.get(0).get("state")).from(SLT_STATE),
        Enter.theValue(personalInformation.get(0).get("postalCode")).into(TXT_POSTAL_CODE),
        Enter.theValue(personalInformation.get(0).get("additionalInfo"))
            .into(TXT_ADDITIONAL_INFORMATION),
        Enter.theValue(personalInformation.get(0).get("homePhone")).into(TXT_HOME_PHONE),
        Enter.theValue(personalInformation.get(0).get("mobilePhone")).into(TXT_MOBILE_PHONE),
        Enter.theValue(personalInformation.get(0).get("alias")).into(TXT_ALIAS),
        Click.on(BTN_REGISTER));
  }
}
