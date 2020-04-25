package co.com.ingjuanfg.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectFlightsPage {
    public static final Target BTN_SELECT_FLIGHT = Target.the("Button to select a flight").located(By.xpath("(//button[@data-test-id='select-button'])[1]"));
    public static final Target BTN_SELECT_FARE_FLIGHT = Target.the("Button to select the fare flight").located(By.xpath("(//button[contains (.,'Select this fare')])[1]"));
    public static final Target LNK_NO_THANKS = Target.the("Link to close publicity").located(By.xpath(".//span[@class='no-thanks-content']//a"));
}
