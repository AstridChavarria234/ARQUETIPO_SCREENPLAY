package co.com.retotecnicobanistmo.certification.reto.utils.enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumPlanes {
  PLAN_BASICO("autos básico", "1"),
  PLAN_BICISURA("bicisura", "4"),
  PLAN_CLASICO("autos clásico", "2"),
  PLAN_GLOBAL("autos global", "3"),
  PLAN_GLOBAL_CON_COBERTURAS_BASICAS("plan global con coberturas básicas", "3"),
  PLAN_MOTOS("motos", "7"),
  PLAN_SEGURO_POR_USO("autos seguro por uso", "52"),
  PLAN_UTILITARIOS_Y_PESADOS("utilitarios y pesados", "8");

  private final String dsPlan;
  private final String cdPlan;
  private static final Map<String, String> mapPlanes =
      Collections.unmodifiableMap(initializeMapping());

  public static String obtenerCodigoPlan(String dsPlan) {
    if (mapPlanes.containsKey(dsPlan)) {
      return mapPlanes.get(dsPlan);
    }
    return null;
  }

  private static Map<String, String> initializeMapping() {
    Map<String, String> mapPlanes = new HashMap<>();
    for (EnumPlanes plan : EnumPlanes.values()) {
      mapPlanes.put(plan.dsPlan, plan.cdPlan);
    }
    return mapPlanes;
  }
}
