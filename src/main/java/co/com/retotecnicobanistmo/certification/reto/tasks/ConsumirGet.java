package co.com.retotecnicobanistmo.certification.reto.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.retotecnicobanistmo.certification.reto.interactions.ConsumirServicio;
import co.com.retotecnicobanistmo.certification.reto.models.PlanSeleccionado;
import co.com.retotecnicobanistmo.certification.reto.utils.enums.EnumCredenciales;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class ConsumirGet implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        ConsumirServicio.getSimple(
            "/apigateway-ayv-autos/ohs-autos/canal/TraditionalChannel/organizacion/Sura/planes",
            EnumCredenciales.SERVICIOS_OHS));
    actor.remember("response_planes", SerenityRest.lastResponse().as(PlanSeleccionado[].class));

    PlanSeleccionado[] responsePlanes = actor.recall("response_planes");
    System.out.print("Codigo canal" + responsePlanes[0].getNombrePlan());
  }

  public static Performable conCredenciales() {
    return instrumented(ConsumirGet.class);
  }
}
