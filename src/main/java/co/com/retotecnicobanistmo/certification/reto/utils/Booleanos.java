package co.com.retotecnicobanistmo.certification.reto.utils;

public final class Booleanos {

  private Booleanos() {}

  public static boolean transformarCadenaValorlogico(String parametro) {
    final String DATO_NO_ENCONTRADO = "Dato %s no encontrado";
    final String SI = "si";
    final String NO = "no";
    if (parametro == null || parametro.isEmpty()) {
      parametro = NO;
    }
    switch (parametro.toLowerCase()) {
      case SI:
        return true;
      case NO:
        return false;
      default:
        throw new IllegalArgumentException(String.format(DATO_NO_ENCONTRADO, parametro));
    }
  }
}
