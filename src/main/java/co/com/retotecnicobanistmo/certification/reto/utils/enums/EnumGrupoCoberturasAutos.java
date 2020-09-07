package co.com.retotecnicobanistmo.certification.reto.utils.enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumGrupoCoberturasAutos {
  DANOS_TERCEROS("Daños a Terceros", "PADanosATerceros"),
  DANOS_CARRO("Daños al Carro", "PADanosAlCarroGrp"),
  HURTO_CARRO("Hurto al Carro", "PAHurtoAlCarroGrp"),
  CARRO_REEMPLAZO("Carro de Reemplazo", "PACarroDeReemplazo"),
  ACCIDENTES("Accidentes", "PAAccidentes"),
  LLAVES("Llaves", "PALlaves"),
  VIAJES("Viajes", "PAViajes"),
  ASISTENCIA("Asistencia", "PAAsistencia");

  private final String dsGrupoCobertura;
  private final String cdGrupoCobertura;
  private static final Map<String, String> mapGrupoCoberturas =
      Collections.unmodifiableMap(initializeMapping());

  public static String obtenerCodigoGrupoCobertura(String dsGrupoCobertura) {
    if (mapGrupoCoberturas.containsKey(dsGrupoCobertura)) {
      return mapGrupoCoberturas.get(dsGrupoCobertura);
    }
    return null;
  }

  private static Map<String, String> initializeMapping() {
    Map<String, String> mapGrupoCoberturas = new HashMap<>();
    for (EnumGrupoCoberturasAutos grupoCobertura : EnumGrupoCoberturasAutos.values()) {
      mapGrupoCoberturas.put(grupoCobertura.dsGrupoCobertura, grupoCobertura.cdGrupoCobertura);
    }
    return mapGrupoCoberturas;
  }
}
