package co.com.ingjuanfg.interactions;

import static co.com.ingjuanfg.userinterface.HomeProductsPage.BTN_VIEW_MY_CART;
import static co.com.ingjuanfg.userinterface.HomeProductsPage.LBL_QUANTITY_PRODUCTS;
import static co.com.ingjuanfg.utils.constants.SessionVariableConstant.QUANTITY_PRODUCTS_TO_BUY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

public class View implements Interaction {
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.remember(QUANTITY_PRODUCTS_TO_BUY, LBL_QUANTITY_PRODUCTS.resolveFor(actor).getText());
    actor.attemptsTo(Click.on(BTN_VIEW_MY_CART));
  }

  public static Performable myShoppingCart() {
    return instrumented(View.class);
  }
}
