package co.com.retotecnicobanistmo.certification.reto.stepdefinitions.services;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.retotecnicobanistmo.certification.reto.tasks.ConsumirGet;
import io.cucumber.java.es.Dado;

public class PruebaServicesStepDefinition {

  @Dado("que un cliente desea realizar una expedicion")
  public void exception() {
    theActorInTheSpotlight().attemptsTo(ConsumirGet.conCredenciales());
  }
}
