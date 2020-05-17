package co.com.ingjuanfg.userinterface;

import static net.serenitybdd.screenplay.targets.Target.the;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeProductsPage extends PageObject {
  public static final Target LBL_PRODUCT_TO_BUY =
      the("Title of the product to buy")
          .locatedBy("//img[@class='replace-2x img-responsive']/parent::a[@title='{0}']");
  public static final Target BTN_ADD_TO_CART_PRODUCT_TO_BUY =
      the("Button of the product to buy")
          .locatedBy(
              "(//a[@title='{0}']/parent::h5/following-sibling::div[2]//a[contains(.,'Add to cart')])[1]");
  public static final Target BTN_CONTINUE_SHOPPING =
      the("Button to see my cart").located(By.xpath("//span[@title='Continue shopping']"));
  public static final Target BTN_VIEW_MY_CART =
      the("Button to see my cart").located(By.xpath("//a[@title='View my shopping cart']"));
  public static final Target LBL_QUANTITY_PRODUCTS =
      the("Label with the quantity of the products")
          .located(By.xpath("//b/following-sibling::span[contains(@class, 'quantity')]"));
}
