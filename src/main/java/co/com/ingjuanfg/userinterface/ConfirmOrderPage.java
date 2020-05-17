package co.com.ingjuanfg.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmOrderPage {
  public static final Target LBL_ORDER_CONFIRMATION =
      Target.the("Label confirmation message")
          .located(By.xpath("//p[@class='cheque-indent']//strong[@class='dark']"));
}
