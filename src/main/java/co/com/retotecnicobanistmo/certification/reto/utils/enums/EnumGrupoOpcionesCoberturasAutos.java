package co.com.retotecnicobanistmo.certification.reto.utils.enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumGrupoOpcionesCoberturasAutos {
  ACCIDENTES_CONDUCTOR("Accidentes~Accidentes al Conductor", "PAAPLimite"),
  ACCIDENTE_AL_VIAJERO("Viajes~Accidentes al viajero", "PAViajesLimit"),
  ASISTENCIA_GLOBAL_VIAJERA("Asistencia en Viaje~Asistencia global viajera", "PAAsisViajeraLimit"),
  ASISTENCIA_VIAJE("Asistencia en Viaje~Asistencia", "PAAsisViaje"),
  DEDUCIBLE_RESPONSABILIDAD_CIVIL("Responsabilidad Civil~Deducible", "PARCDeduciblePorcMin"),
  EQUIPAJE_PROTEGIDO("Viajes~Equipaje protegido", "PAEquipajeLimit"),
  GASTOS_TRANSPORTE_DANOS("Daños~Gastos de Transporte", "PAGastTransporte"),
  GASTOS_TRANSPORTE_HURTO("Hurto~Gastos de Transporte", "PAGasTransHurto"),
  HURTO_DOCUMENTOS("Viajes~Hurto de documentos", "PAHurtDocLimit"),
  LIMITE_RESPONSABILIDAD_CIVIL("Responsabilidad Civil~Limite", "PARCLimite"),
  NUEVO_NUEVO_DANOS("Daños~Nuevo de Nuevo", "PASNDDeducible"),
  PERDIDA_LLAVES("Pérdida de Llaves~Pérdida de Llaves", "PAPerdLlaves"),
  PERDIDA_PARCIAL_DANOS("Daños~Pérdida Parcial", "PADanosPPDeduciblePorcMin"),
  PERDIDA_PARCIAL_HURTO("Hurto~Pérdida Parcial", "PAHurtoPPDeduciblePorcMin"),
  PERDIDA_PARCIAL_VEHICULO_REEMPLAZO("Vehículo de Reemplazo~Pérdida Parcial", "PAPPLimite"),
  PERDIDA_TOTAL_DANOS("Daños~Pérdida Total", "PADanosPTDeduciblePorcMin"),
  PERDIDA_TOTAL_HURTO("Hurto~Pérdida Total", "PAHurtoPTDeduciblePorcMin"),
  PERDIDA_TOTAL_VEHICULO_REEMPLAZO("Vehículo de Reemplazo~Pérdida Total", "PAPTLimite"),
  RENTA_POR_HOSPITALIZACION("Viajes~Renta por hospitalización", "PARentHosLimit");

  private final String dsGrupoOpcion;
  private final String cdGrupoOpcion;
  private static final Map<String, String> mapGrupoOpciones =
      Collections.unmodifiableMap(initializeMapping());

  public static String obtenerCodigoGrupoOpcion(String dsGrupoOpcion) {
    if (mapGrupoOpciones.containsKey(dsGrupoOpcion)) {
      return mapGrupoOpciones.get(dsGrupoOpcion);
    }
    return null;
  }

  private static Map<String, String> initializeMapping() {
    Map<String, String> mapGrupoOpciones = new HashMap<>();
    for (EnumGrupoOpcionesCoberturasAutos grupoOpcion : EnumGrupoOpcionesCoberturasAutos.values()) {
      mapGrupoOpciones.put(grupoOpcion.dsGrupoOpcion, grupoOpcion.cdGrupoOpcion);
    }
    return mapGrupoOpciones;
  }
}
