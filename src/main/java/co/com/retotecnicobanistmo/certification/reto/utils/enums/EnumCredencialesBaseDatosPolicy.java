package co.com.retotecnicobanistmo.certification.reto.utils.enums;

public enum EnumCredencialesBaseDatosPolicy {
  BASE_DATOS_COTIZADOR("jdbc:oracle:thin:@10.207.24.240:1537/LABGWPC", "gw_conf", "cor3sur4");

  private final String urlBaseDatos;
  private final String usuario;
  private final String contrasena;

  EnumCredencialesBaseDatosPolicy(String urlBaseDatos, String usuario, String contrasena) {
    this.urlBaseDatos = urlBaseDatos;
    this.usuario = usuario;
    this.contrasena = contrasena;
  }

  public String getUrlBaseDatos() {
    return urlBaseDatos;
  }

  public String getUsuario() {
    return usuario;
  }

  public String getContrasena() {
    return contrasena;
  }
}
