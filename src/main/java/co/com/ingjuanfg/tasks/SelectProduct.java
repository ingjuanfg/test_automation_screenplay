package co.com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static co.com.ingjuanfg.user_interfaces.HomeProductsPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProduct implements Task {
    private List<Map<String, String>> nameProduct;

    public SelectProduct(List<Map<String, String>> nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        IntStream.range(0, nameProduct.size()).forEach((product) ->
                actor.attemptsTo(
                        MoveMouse.to(LBL_PRODUCT_TO_BUY.of(nameProduct.get(product).get("popularClothes"))),
                        Click.on(BTN_ADD_TO_CART_PRODUCT_TO_BUY.of(nameProduct.get(product).get("popularClothes"))),
                        Click.on(BTN_CONTINUE_SHOPPING))
        );
    }

    public static Performable toBuy(List<Map<String, String>> nameProduct) {
        return instrumented(SelectProduct.class, nameProduct);
    }
}