package co.com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.ingjuanfg.user_interfaces.ShoppingCartPage.BTN_PROCEED_TO_CHECKOUT;
import static co.com.ingjuanfg.user_interfaces.ShoppingCartPage.LBL_SUMMARY_QUANTITY_PRODUCTS;
import static co.com.ingjuanfg.utils.date.SessionVariableConstant.QUANTITY_PRODUCTS_TO_BUY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Buy implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String quantityProducts = actor.recall(QUANTITY_PRODUCTS_TO_BUY);
        actor.attemptsTo(
                Check.whether(LBL_SUMMARY_QUANTITY_PRODUCTS.resolveFor(actor).getText().contains(quantityProducts)).andIfSo(
                        Click.on(BTN_PROCEED_TO_CHECKOUT)
                )
        );
    }

    public static Performable proceedToCheckout() {
        return instrumented(Buy.class);
    }
}
