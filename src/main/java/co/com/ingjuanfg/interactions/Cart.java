package co.com.ingjuanfg.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.ingjuanfg.user_interfaces.HomeProductsPage.BTN_VIEW_MY_CART;
import static co.com.ingjuanfg.user_interfaces.HomeProductsPage.LBL_QUANTITY_PRODUCTS;
import static co.com.ingjuanfg.utils.date.SessionVariableConstant.QUANTITY_PRODUCTS_TO_BUY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Cart implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(QUANTITY_PRODUCTS_TO_BUY, LBL_QUANTITY_PRODUCTS.resolveFor(actor).getText());
        actor.attemptsTo(
                Click.on(BTN_VIEW_MY_CART)
        );
    }

    public static Performable viewMyShoppingCart(){
        return instrumented(Cart.class);
    }
}
