package co.com.retotecnicobanistmo.certification.reto.stepdefinitions;

import io.cucumber.java.es.Dado;

public class PruebaStepDefinition {

  @Dado(
      "que un cliente desea realizar una expedicion de un {string} en el aplicativo SOAT por el canal {string}")
  public void queUnClienteDeseaRealizarUnaExpedicionDeUnEnElAplicativoSOATPorElCanal(
      String claseVehiculo, String canal) {}
}
