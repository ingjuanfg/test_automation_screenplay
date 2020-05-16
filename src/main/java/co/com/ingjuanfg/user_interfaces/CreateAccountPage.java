package co.com.ingjuanfg.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class CreateAccountPage {
    public static final Target BTN_TO_CREATE_ACCOUNT = the("Button to create account").located(xpath("//span[contains(.,'Create an account')]"));
    public static final Target TXT_EMAIL_ADDRESS = the("Input to write the email").located(id("email_create"));
    public static final Target FRM_CREATE_ACCOUNT = Target.the("Account creation form").located(By.id("account-creation_form"));
}
