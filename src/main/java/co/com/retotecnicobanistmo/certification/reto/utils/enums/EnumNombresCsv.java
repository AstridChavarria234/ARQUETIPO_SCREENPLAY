package co.com.retotecnicobanistmo.certification.reto.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumNombresCsv {
  ASEGURADO("asegurado"),
  ASESOR("asesor"),
  CIUDADES("ciudades"),
  COBERTURAS_AUTOS("coberturas_autos"),
  COTIZACION("cotizacion"),
  DICCIONARIO_COBERTURAS_AUTOS("diccionario_coberturas_autos"),
  TOMADOR("tomador"),
  VEHICULO("vehiculo");

  private final String nombre;
}
