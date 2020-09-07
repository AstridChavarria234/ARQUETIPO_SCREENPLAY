package co.com.retotecnicobanistmo.certification.reto.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumVigencia {
  ANUAL("anual"),
  OTRA("otra"),
  SEMESTRAL("semestral");

  private final String tipoVigencia;
}
