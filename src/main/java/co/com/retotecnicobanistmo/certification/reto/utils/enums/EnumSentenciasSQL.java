package co.com.retotecnicobanistmo.certification.reto.utils.enums;

public enum EnumSentenciasSQL {
  CONSULTAR_CONTROLES_POLICY("SQL.CONSULTA.CONTROLES_POLICY"),
  CONSULTA_NUMERO_POLIZA("SQL.CONSULTA.NUMERO_POLIZA");

  private final String sentencia;

  EnumSentenciasSQL(String sentencia) {
    this.sentencia = sentencia;
  }

  public String getSentencia() {
    return sentencia;
  }
}
