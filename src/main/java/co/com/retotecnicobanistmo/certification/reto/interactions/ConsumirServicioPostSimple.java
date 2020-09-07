package co.com.retotecnicobanistmo.certification.reto.interactions;

import co.com.retotecnicobanistmo.certification.reto.utils.enums.EnumCredenciales;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class ConsumirServicioPostSimple implements Interaction {

  private final String recurso;
  private final String usuario;
  private final String clave;
  private final Object request;

  public ConsumirServicioPostSimple(
      String recurso, EnumCredenciales enumCredenciales, Object request) {
    this.recurso = recurso;
    usuario = enumCredenciales.getUsuario();
    clave = enumCredenciales.getClave();
    this.request = request;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Post.to(recurso)
            .with(
                requestSpecification ->
                    requestSpecification
                        .relaxedHTTPSValidation()
                        .auth()
                        .preemptive()
                        .basic(usuario, clave)
                        .contentType(ContentType.JSON)
                        .body(request)));
  }
}
