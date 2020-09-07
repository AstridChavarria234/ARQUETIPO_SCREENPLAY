package co.com.retotecnicobanistmo.certification.reto.userinterface;

import static org.openqa.selenium.By.xpath;

import net.serenitybdd.screenplay.targets.Target;

public final class Targets {

  public static final Target CBX_TIPO_DOCUMENTO =
      Target.the("lista tipo de documento")
          .located(xpath(".//span[@class='mat-select-placeholder ng-tns-c17-3 ng-star-inserted']"));
}
