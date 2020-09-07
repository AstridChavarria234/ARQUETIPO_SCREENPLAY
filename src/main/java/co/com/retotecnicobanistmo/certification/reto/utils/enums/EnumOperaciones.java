package co.com.retotecnicobanistmo.certification.reto.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumOperaciones {
  CAMBIO_ASEGURADO("Cambio asegurado"),
  CAMBIO_COBERTURAS("Cambio coberturas"),
  CAMBIO_PLANES("Cambio planes"),
  CAMBIO_VALOR_ASEGURADO("Cambio valor asegurado"),
  EXPEDICION("Expedición"),
  MODIFICACION("Modificación"),
  SUSTITUCION("Sustitución");

  private final String nombreOperacion;
}
