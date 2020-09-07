package co.com.retotecnicobanistmo.certification.reto.utils;

import java.util.Random;

public final class Aleatorios {

  private static final Random RANDOM = new Random();

  private Aleatorios() {
    super();
  }

  public static String generarPlacaAleatoria(int cantidadLetras, int cantidadNumeros) {
    return String.format(
        "%s%s", generarAleatoriosLetras(cantidadLetras), generarAleatoriosNumeros(cantidadNumeros));
  }

  public static String generarAleatoriosNumeros(int longitudSerie) {
    StringBuilder serieNumeros = new StringBuilder();
    RANDOM.ints(longitudSerie, 0, 9).forEach(numero -> serieNumeros.append(numero));
    return serieNumeros.toString();
  }

  public static String generarAleatoriosLetras(int longitudSerie) {
    StringBuilder serieLetras = new StringBuilder();
    RANDOM.ints(longitudSerie, 65, 90).forEach(numero -> serieLetras.append((char) numero));
    return serieLetras.toString();
  }

  public static String obtenerPlacaAleatoria(String placa) {
    if ("RANDOM".equals(placa)) {
      placa = Aleatorios.generarPlacaAleatoria(4, 3);
    }
    return placa;
  }
}
