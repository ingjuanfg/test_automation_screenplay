package co.com.ingjuanfg.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectFlightsPage {
    public static final Target IMG_PROGRESS_BAR = Target.the("Loading progress bar").located(By.className("progress-bar"));
    public static final Target BTN_SELECT_FLIGHT_2 = Target.the("Button to select a flight").located(By.xpath("(//button[@data-test-id='select-button'])[2]"));
    public static final Target BTN_SELECT_FLIGHT = Target.the("Button to select a flight").located(By.xpath("(//button[@data-test-id='select-button'])[1]"));
    public static final Target BTN_SELECT_FARE_FLIGHT = Target.the("Button to select the fare flight").located(By.xpath("(//button[contains (.,'Select this fare')])[1]"));
    public static final Target BTN_SELECT_FARE_FLIGHT_2 = Target.the("Button to select the fare flight").located(By.xpath("(//button[contains (.,'Select this fare')])[2]"));
    public static final Target LNK_NO_THANKS = Target.the("Link to close publicity").located(By.xpath(".//span[@class='no-thanks-content']//a"));
}
