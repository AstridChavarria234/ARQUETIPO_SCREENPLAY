package co.com.retotecnicobanistmo.certification.reto.interactions;

import co.com.retotecnicobanistmo.certification.reto.utils.enums.EnumCredenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ConsumirServicioGetSimple implements Interaction {

  private final String recurso;
  private final String usuario;
  private final String clave;

  public ConsumirServicioGetSimple(String recurso, EnumCredenciales enumCredenciales) {
    this.recurso = recurso;
    usuario = enumCredenciales.getUsuario();
    clave = enumCredenciales.getClave();
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Get.resource(recurso)
            .with(
                requestSpecification ->
                    requestSpecification.auth().preemptive().basic(usuario, clave)));
  }
}
