package co.com.retotecnicobanistmo.certification.reto.interactions;

import co.com.retotecnicobanistmo.certification.reto.utils.enums.EnumCredenciales;

public final class ConsumirServicio {

  private ConsumirServicio() {}

  public static ConsumirServicioGetSimple getSimple(
      String recurso, EnumCredenciales enumCredenciales) {
    return new ConsumirServicioGetSimple(recurso, enumCredenciales);
  }

  public static ConsumirServicioPostSimple postSimple(
      String recurso, EnumCredenciales enumCredenciales, Object request) {
    return new ConsumirServicioPostSimple(recurso, enumCredenciales, request);
  }
}
