package co.com.ingjuanfg.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProceedCheckoutPage {
  public static final Target CHK_TERMS_CONDITIONS =
      Target.the("Check Terms and Conditions").located(By.id("cgv"));
  public static final Target BTN_PAY_BANK_WIRE =
      Target.the("Button to pay Bank Wire")
          .located(By.xpath("//a[@title='Pay by bank wire']/span"));
  public static final Target BTN_PAY_CHECK =
      Target.the("Button to pay Check").located(By.xpath("//a[@title='Pay by check.']/span"));
  public static final Target BTN_CONFIRM_ORDER =
      Target.the("Button to confirm order")
          .located(By.xpath("//span[contains(.,'I confirm my order')]"));
}
