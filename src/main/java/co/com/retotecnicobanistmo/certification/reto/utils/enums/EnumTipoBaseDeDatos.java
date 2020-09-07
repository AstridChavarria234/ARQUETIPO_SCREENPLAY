package co.com.retotecnicobanistmo.certification.reto.utils.enums;

public enum EnumTipoBaseDeDatos {
  SQL_SERVER("org.hibernate.dialect.SQLServerDialect"),
  MYSQL("org.hibernate.dialect.MySQL57Dialect"),
  POSTGRESQL("org.hibernate.dialect.PostgreSQLDialect"),
  ORACLE("org.hibernate.dialect.OracleDialect");

  private String dialect;

  EnumTipoBaseDeDatos(String dialect) {
    this.dialect = dialect;
  }

  public String getDialect() {
    return dialect;
  }
}
