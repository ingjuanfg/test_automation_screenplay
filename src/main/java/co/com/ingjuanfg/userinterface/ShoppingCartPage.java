package co.com.ingjuanfg.userinterface;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage {
  public static final Target LBL_SUMMARY_QUANTITY_PRODUCTS =
      the("Label with the quantity of products").located(id("summary_products_quantity"));
  public static final Target BTN_PROCEED_TO_CHECKOUT =
      the("Button to continue buying")
          .located(xpath("(//span[contains(.,'Proceed to checkout')])[2]"));
}
