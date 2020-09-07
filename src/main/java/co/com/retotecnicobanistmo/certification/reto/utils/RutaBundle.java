package co.com.retotecnicobanistmo.certification.reto.utils;

import static co.com.retotecnicobanistmo.certification.reto.utils.enums.EnumRutaBundle.RUTA_QUERY_CONSULTAR_REGISTRO;
import static co.com.retotecnicobanistmo.certification.reto.utils.enums.EnumSeparadores.SEPARADOR_BACKSLASH;
import static co.com.retotecnicobanistmo.certification.reto.utils.enums.EnumSeparadores.SEPARADOR_SLASH;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import lombok.SneakyThrows;

public abstract class RutaBundle {

  public static final Properties CONSULTAR_BASE_DATOS = getProperties();

  private RutaBundle() {}

  private static String rutaAbsoluta() {
    return System.getProperty("user.dir")
        .replace(SEPARADOR_BACKSLASH.getSeparador(), SEPARADOR_SLASH.getSeparador());
  }

  private static String rutaAbsolutaRecurso() {
    return rutaAbsoluta() + RUTA_QUERY_CONSULTAR_REGISTRO.getRuta();
  }

  @SneakyThrows
  private static Properties getProperties() {
    Properties properties = new Properties();
    InputStreamReader reader =
        new InputStreamReader(new FileInputStream(rutaAbsolutaRecurso()), StandardCharsets.UTF_8);
    properties.load(reader);
    reader.close();
    return properties;
  }
}
