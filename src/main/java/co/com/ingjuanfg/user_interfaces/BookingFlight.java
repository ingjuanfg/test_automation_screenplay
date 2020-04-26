package co.com.ingjuanfg.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookingFlight {
  public static final Target LBL_PAGE_TITLE_REVIEW =
      Target.the("Title of the review page").located(By.xpath("//h1"));
  public static final Target BTN_CONTINUE_BOOKING =
      Target.the("Title of the review page").located(By.id("bookButton"));
}
