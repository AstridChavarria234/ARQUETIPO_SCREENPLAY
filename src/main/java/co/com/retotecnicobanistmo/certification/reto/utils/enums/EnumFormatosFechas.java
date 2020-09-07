package co.com.retotecnicobanistmo.certification.reto.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumFormatosFechas {
  FORMATO_FECHA_DDMMYYYY("dd/MM/yyyy"),
  FORMATO_FECHA_YYYYMMDD("yyyy-MM-dd"),
  FORMATO_FECHA_YYYYMMDDTHHMMSSSSSXXX("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

  private final String formato;
}
