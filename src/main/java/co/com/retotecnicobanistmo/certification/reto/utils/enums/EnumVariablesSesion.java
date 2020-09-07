package co.com.retotecnicobanistmo.certification.reto.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumVariablesSesion {
  BONIFICACION_COMERCIAL_ASEGURADO("Bonificación comercial asegurado"),
  BONIFICACION_TECNICA_ASEGURADO("Bonificación técnica asegurado"),
  CHASIS("chasis"),
  COMISION_ASESOR("Comision Asesor"),
  CONSULTA_NUMERO_POLIZA_DB("Consulta Numero Poliza BD"),
  COSTO_TOTAL("Costo total"),
  DATOS_TOMADOR("Datos tomador"),
  FECHA_FIN_VIGENCIA("Fecha fin de vigencia"),
  FECHA_FIN_VIGENCIA_POLIZA("Fecha Fin Vigencia"),
  FECHA_INICIO_VIGENCIA("Fecha inicio vigencia"),
  FECHA_INICIO_VIGENCIA_POLIZA("Fecha inicio vigencia poliza"),
  MENSAJE_ERROR_CAMPOS_INCOMPLETOS("Campos incompletos"),
  MENSAJE_ERROR_NO_CALCULO_PRIMA("No calculo prima"),
  MODELO_ASEGURADO_CONSTRUIDO("Modelo de asegurado construido"),
  MODELO_BONIFICACION_CONSTRUIDO("Modelo de bonificación construido"),
  MODELO_INFO_VEHICULO_CONSTRUIDO("Modelo de InfoVehiculo construido"),
  MODELO_TOMADOR_CONSTRUIDO("Modelo de tomador construido"),
  MOTOR("motor"),
  NUMERO_COTIZACION("Número Cotización"),
  NUMERO_DOCUMENTO_ASEGURADO("numero documento asegurado"),
  NUMERO_POLIZA("Número de póliza"),
  NUMERO_POLIZA_CONSULTA_BD("Consulta Numero Poliza BD"),
  PLACA_ALEATORIA("Placa desde bonificación"),
  PLACA_EXPEDICION_EDGE("Placa expedición de poliza Edge"),
  PLACA_MODIFICACION("Placa vehículo posterior a la Modificación"),
  PRIMA_ANTERIOR("Prima Anterior"),
  PRIMA_TOTAL_ANTERIOR("Prima Anterior"),
  REQUEST_BONIFICACION("Request bonificación"),
  REQUEST_CONSULTA_POLIZA_POLICY("Request consulta poliza"),
  REQUEST_COTIZACION("Request cotizacion"),
  REQUEST_EXPEDICION("Request Expedicion"),
  REQUEST_EXPEDICION_EDGE("Request expedición EDGE"),
  REQUEST_MODIFICACION_OHS("Request modificacion OHS"),
  REQUEST_TARIFA("Request tarifa"),
  RESPONSE_BONIFICACION_ASEGURADO("Response bonificacion asegurado"),
  RESPONSE_COBERTURAS("Response coberturas"),
  RESPONSE_CONSULTA_POLIZA_POLICY("Response consulta policy"),
  RESPONSE_PLANES("Response planes"),
  RESPONSE_TARIFA("Response tarifa"),
  TOTAL_IMPUESTO("Total Impuesto"),
  VIGENCIA_POLIZA("Vigencia de la póliza");

  private final String variableSesion;
}
