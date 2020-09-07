package co.com.retotecnicobanistmo.certification.reto.utils.enums;

public enum EnumRutaBundle {
  RUTA_QUERY_CONSULTAR_REGISTRO("/src/test/resources/queries/consultar_registro.properties");

  private final String ruta;

  EnumRutaBundle(String sentencia) {
    this.ruta = sentencia;
  }

  public String getRuta() {
    return ruta;
  }
}
