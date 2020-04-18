package co.com.ingjuanfg.utils.list;

import java.util.List;
import java.util.stream.Collectors;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

public class ListManager {

  public static List<String> getTargetTextList(Target target, Actor actor) {
    return target
        .resolveAllFor(actor)
        .stream()
        .map(WebElementFacade::getText)
        .collect(Collectors.toList());
  }
}
