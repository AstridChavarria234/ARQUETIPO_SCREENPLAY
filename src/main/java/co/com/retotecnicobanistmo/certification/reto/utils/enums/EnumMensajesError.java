package co.com.retotecnicobanistmo.certification.reto.utils.enums;

public enum EnumMensajesError {
  CLIENTE_NO_REGISTRADO_SARLAFT(
      "Debes ingresar los datos de estas personas en Sarlaft para continuar con el envío de la solicitud"),
  CLIENTE_RIESGO_CONSULTABLE_MORAL(
      "En estos momentos no es posible realizar la cotización, por favor valide este negocio con su director comercial."),
  NO_CALCULO_PRIMA_COTIZACION("No se ha calculado el valor de la prima"),
  CAMPOS_INCOMPLETOS_COTIZACION("Existen campos obligatorios sin diligenciar"),
  NUMERO_COTIZACION_NO_EXPEDIDA(
      "El número de cotización %s no pudo ser expedido o supero el tiempo máximo de respuesta"),
  TARIFA_NO_DISPONIBLE(
      "La tarifa se mostrará en esta sección cuando se haya diligenciado la información necesaria (Plan, información del vehículo y al menos una cobertura), y se recalculará conforme se hagan cambios.");

  private final String valorMensajeError;

  EnumMensajesError(String valorMensajeError) {
    this.valorMensajeError = valorMensajeError;
  }

  public String getMensajesError() {
    return valorMensajeError;
  }
}
