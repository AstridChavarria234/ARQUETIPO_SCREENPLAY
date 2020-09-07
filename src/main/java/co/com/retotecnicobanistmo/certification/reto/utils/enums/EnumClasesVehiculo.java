package co.com.retotecnicobanistmo.certification.reto.utils.enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumClasesVehiculo {
  AUTOMOVIL("AUTOMOVIL", "1"),
  CAMPEROS_Y_PICKUPS("CAMPEROS Y PICKUPS", "2"),
  MOTOS_DE_0_A_125_CC("MOTOS 0 - 125 CC", "3"),
  MOTOS_DE_125_A_250_CC("MOTOS 125 - 250 CC", "4"),
  MOTOS_MAYORES_A_250_CC("MOTOS > 250 CC", "5"),
  MOTOCARRO("MOTOCARRO", "6"),
  REMOLQUES("REMOLQUES", "7"),
  UTILITARIOS("UTILITARIOS", "8"),
  CAMION_MEDIANO("CAMION MEDIANO", "9"),
  CAMION_PESADOS("CAMION PESADO", "10"),
  OTROS_PESADOS("OTROS PESADOS", "11"),
  TAXIS("TAXIS", "12"),
  BICICLETAS("BICICLETAS", "13");

  private final String dsClaseVehiculo;
  private final String cdClaseVehiculo;
  private static final Map<String, String> mapClasesVehiculo =
      Collections.unmodifiableMap(initializeMapping());

  public static String obtenerCodigoClaseVehiculo(String dsClaseVehiculo) {
    if (mapClasesVehiculo.containsKey(dsClaseVehiculo)) {
      return mapClasesVehiculo.get(dsClaseVehiculo);
    }
    return null;
  }

  private static Map<String, String> initializeMapping() {
    Map<String, String> mapClasesVehiculo = new HashMap<>();
    for (EnumClasesVehiculo claseVehiculo : EnumClasesVehiculo.values()) {
      mapClasesVehiculo.put(claseVehiculo.dsClaseVehiculo, claseVehiculo.cdClaseVehiculo);
    }
    return mapClasesVehiculo;
  }
}
