package co.com.ingjuanfg.tasks;

import static co.com.ingjuanfg.userinterface.CreateAccountPage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FormRegisterString extends FillOut {
  private String title;
  private String firstName;
  private String lastName;
  private String password;
  private String dayBirth;
  private String monthBirth;
  private String yearBirth;
  private String company;
  private String address;
  private String city;
  private String state;
  private String postalCode;
  private String additionalInfo;
  private String homePhone;
  private String mobilePhone;
  private String alias;

  public FormRegisterString(
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
    this.title = title;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.dayBirth = dayBirth;
    this.monthBirth = monthBirth;
    this.yearBirth = yearBirth;
    this.company = company;
    this.address = address;
    this.city = city;
    this.state = state;
    this.postalCode = postalCode;
    this.additionalInfo = additionalInfo;
    this.homePhone = homePhone;
    this.mobilePhone = mobilePhone;
    this.alias = alias;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(OPT_TITLE.of(title)),
        Enter.theValue(firstName).into(TXT_FIRST_NAME_PI),
        Enter.theValue(lastName).into(TXT_LAST_NAME_PI),
        Enter.theValue(password).into(TXT_PASSWORD),
        SelectFromOptions.byValue(dayBirth).from(SLT_DAY_BIRTH),
        SelectFromOptions.byValue(monthBirth).from(SLT_MONTH_BIRTH),
        SelectFromOptions.byValue(yearBirth).from(SLT_YEAR_BIRTH),
        Enter.theValue(firstName).into(TXT_FIRST_NAME_YA),
        Enter.theValue(lastName).into(TXT_LAST_NAME_YA),
        Enter.theValue(company).into(TXT_COMPANY),
        Enter.theValue(address).into(TXT_ADDRESS),
        Enter.theValue(city).into(TXT_CITY),
        SelectFromOptions.byVisibleText(state).from(SLT_STATE),
        Enter.theValue(postalCode).into(TXT_POSTAL_CODE),
        Enter.theValue(additionalInfo).into(TXT_ADDITIONAL_INFORMATION),
        Enter.theValue(homePhone).into(TXT_HOME_PHONE),
        Enter.theValue(mobilePhone).into(TXT_MOBILE_PHONE),
        Enter.theValue(alias).into(TXT_ALIAS),
        Click.on(BTN_REGISTER));
  }
}
