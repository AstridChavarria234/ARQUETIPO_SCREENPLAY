package co.com.retotecnicobanistmo.certification.reto.utils;

public final class Numeros {

  private Numeros() {}

  public static int transformarCadenaEnteroCondicionado(String valor) {
    return Integer.parseInt(valor == null || valor.isEmpty() ? "0" : valor);
  }
}
