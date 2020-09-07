package co.com.retotecnicobanistmo.certification.reto.utils.enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumCoberturasAutos {
  RESPONSABILIDAD_CIVIL("Responsabilidad Civil", "PARCCov"),
  DANOS("Daños", "PADanosCov"),
  HURTO("Hurto", "PAHurtoCov"),
  VEHICULO_REEMPLAZO("Vehículo de Reemplazo", "PACarroReCov"),
  ACCIDENTES_CONDUCTOR("Accidentes", "PAAccidCondCov"),
  PERDIDA_LLAVES("Pérdida de Llaves", "PAPerdLLaCov"),
  VIAJES("Viajes", "PAViajesCov"),
  ASISTENCIA_VIAJE("Asistencia en Viaje", "PAAsistenciaCov");

  private final String dsCobertura;
  private final String cdCobertura;
  private static final Map<String, String> mapCoberturas =
      Collections.unmodifiableMap(initializeMapping());

  public static String obtenerCodigoCobertura(String dsCobertura) {
    if (mapCoberturas.containsKey(dsCobertura)) {
      return mapCoberturas.get(dsCobertura);
    }
    return null;
  }

  private static Map<String, String> initializeMapping() {
    Map<String, String> mapCoberturas = new HashMap<>();
    for (EnumCoberturasAutos cobertura : EnumCoberturasAutos.values()) {
      mapCoberturas.put(cobertura.dsCobertura, cobertura.cdCobertura);
    }
    return mapCoberturas;
  }
}
