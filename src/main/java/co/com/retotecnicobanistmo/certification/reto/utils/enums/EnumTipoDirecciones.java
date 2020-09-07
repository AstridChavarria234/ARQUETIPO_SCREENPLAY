package co.com.retotecnicobanistmo.certification.reto.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumTipoDirecciones {
  HOME("RS", "Residencia"),
  WORK("TR", "Trabajo");

  private final String id;
  private final String descripcionid;

  public static String obtenerIdTipoDireccion(String tipoDireccion) {
    return EnumTipoDirecciones.valueOf(tipoDireccion).id;
  }

  public static String obtenerDescripcionIdTipoDireccion(String tipoDireccion) {
    return EnumTipoDirecciones.valueOf(tipoDireccion).descripcionid;
  }
}
