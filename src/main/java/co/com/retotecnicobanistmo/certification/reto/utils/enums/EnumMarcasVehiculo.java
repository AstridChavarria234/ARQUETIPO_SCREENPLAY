package co.com.retotecnicobanistmo.certification.reto.utils.enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumMarcasVehiculo {
  AUDI("AUDI", "006"),
  BMW("BMW", "008"),
  CHERY("CHERY", "106"),
  CHEVROLET("CHEVROLET", "016"),
  CITROEN("CITROEN", "018"),
  FIAT("FIAT", "028"),
  FORD("FORD", "030"),
  FOTON("FOTON", "189"),
  HYUNDAI("HYUNDAI", "032"),
  KIA("KIA", "046"),
  MAZDA("MAZDA", "056"),
  NISSAN("NISSAN", "064"),
  RENAULT("RENAULT", "080"),
  SUZUKI("SUZUKI", "088"),
  TOYOTA("TOYOTA", "090"),
  VOLKSWAGEN("VOLKSWAGEN", "092"),
  YAMAHA("YAMAHA", "098");

  private final String dsMarcaVehiculo;
  private final String cdMarcaVehiculo;
  private static final Map<String, String> mapMarcasVehiculo =
      Collections.unmodifiableMap(initializeMapping());

  public static String obtenerCodigoMarcaVehiculo(String dsMarcaVehiculo) {
    if (mapMarcasVehiculo.containsKey(dsMarcaVehiculo)) {
      return mapMarcasVehiculo.get(dsMarcaVehiculo);
    }
    return null;
  }

  private static Map<String, String> initializeMapping() {
    Map<String, String> mapMarcasVehiculo = new HashMap<>();
    for (EnumMarcasVehiculo marcaVehiculo : EnumMarcasVehiculo.values()) {
      mapMarcasVehiculo.put(marcaVehiculo.dsMarcaVehiculo, marcaVehiculo.cdMarcaVehiculo);
    }
    return mapMarcasVehiculo;
  }
}
