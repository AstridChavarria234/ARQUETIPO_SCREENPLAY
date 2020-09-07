package co.com.retotecnicobanistmo.certification.reto.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumRecursosServicios {
  BONIFICACION("/apigateway-ayv-autos/ohs-autos/command/calcularbonificacion"),
  COBERTURAS(
      "/apigateway-ayv-autos/ohs-autos/coberturas/plan/{plan}/clase/{claseVehiculo}/ciudad/{ciudadCirculacion}/modelo/{modelo}/feini/{fechaInicioVigencia}"),
  CONSULTA_POLIZA_POLICY("/cxf/PdnPolicySearchRestIntegration/retrievePolicy"),
  COTIZACION("/apigateway-ayv-autos/ayv-autos/command/guardarCotizacionLocal"),
  EXPEDICION("/pc/service/edge/policy/personalAuto"),
  EXPEDICION_COTIZADOR("/apigateway-ayv-autos/ayv-autos/command/expedirCotizacion"),
  EXPEDIR_MODIFICACION("/apigateway-ayv-autos/ayv-autos/command/expedirModificacion"),
  GUARDAR_COTIZACION("/apigateway-ayv-autos/ayv-autos/command/guardarCotizacionLocal"),
  PLANES("/apigateway-ayv-autos/ohs-autos/canal/TraditionalChannel/organizacion/Sura/planes"),
  RIESGOS_CONSULTABLES_SOAP("/ServiciosRiesgosConsultablesWS/services/IngresoRiesgosFacadeWSImpl"),
  TARIFA("/apigateway-ayv-autos/ohs-autos/command/tarifar");

  private final String recurso;
}
