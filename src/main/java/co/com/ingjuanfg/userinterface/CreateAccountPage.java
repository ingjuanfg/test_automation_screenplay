package co.com.ingjuanfg.userinterface;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateAccountPage {
  public static final Target BTN_TO_CREATE_ACCOUNT =
      the("Button to create account").located(xpath("//span[contains(.,'Create an account')]"));
  public static final Target TXT_EMAIL_ADDRESS =
      the("Input to write the email").located(id("email_create"));
  public static final Target FRM_CREATE_ACCOUNT =
      Target.the("Account creation form").located(By.id("account-creation_form"));
  public static final Target OPT_TITLE =
      Target.the("Check button to select gender")
          .locatedBy("//label[contains(.,'{0}')]/div//input");
  public static final Target TXT_FIRST_NAME_PI =
      Target.the("Input to write name").located(By.id("customer_firstname"));
  public static final Target TXT_LAST_NAME_PI =
      Target.the("Input to write last name").located(By.id("customer_lastname"));
  public static final Target TXT_PASSWORD =
      Target.the("Input to write password").located(By.id("passwd"));
  public static final Target SLT_DAY_BIRTH =
      Target.the("Day select option ").located(By.id("days"));
  public static final Target SLT_MONTH_BIRTH =
      Target.the("Month select option").located(By.id("months"));
  public static final Target SLT_YEAR_BIRTH =
      Target.the("Year select option").located(By.id("years"));
  public static final Target TXT_FIRST_NAME_YA =
      Target.the("Input to write name").located(By.id("firstname"));
  public static final Target TXT_LAST_NAME_YA =
      Target.the("Input to write last name").located(By.id("lastname"));
  public static final Target TXT_COMPANY =
      Target.the("Input to write the company name").located(By.id("company"));
  public static final Target TXT_ADDRESS =
      Target.the("Input to write the address").located(By.id("address1"));
  public static final Target TXT_CITY =
      Target.the("Input to write the city").located(By.id("city"));
  public static final Target SLT_STATE =
      Target.the("State select option").located(By.id("id_state"));
  public static final Target TXT_POSTAL_CODE =
      Target.the("Input to write the postal code").located(By.id("postcode"));
  public static final Target TXT_ADDITIONAL_INFORMATION =
      Target.the("Input to write additional info").located(By.id("other"));
  public static final Target TXT_HOME_PHONE =
      Target.the("Input to write phone").located(By.id("phone"));
  public static final Target TXT_MOBILE_PHONE =
      Target.the("Input to write mobile phone").located(By.id("phone_mobile"));
  public static final Target TXT_ALIAS = Target.the("Input to write write").located(By.id("alias"));
  public static final Target BTN_REGISTER =
      Target.the("Button to Register").located(By.xpath("//span[contains(.,'Register')]"));
}
