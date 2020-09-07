package co.com.retotecnicobanistmo.certification.reto.utils;

import static co.com.retotecnicobanistmo.certification.reto.utils.enums.EnumFormatosFechas.FORMATO_FECHA_YYYYMMDD;
import static java.time.temporal.ChronoUnit.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import lombok.SneakyThrows;
import org.joda.time.DateTime;

public final class Fechas {
  private Fechas() {}

  @SneakyThrows
  public static Long convertirFechaUnix(String fecha, String formato) {
    SimpleDateFormat formatoFecha = new SimpleDateFormat(formato);
    return formatoFecha.parse(fecha).getTime();
  }

  public static int calcularAntiguedadEntreFechas(
      String fechaInicio, String fechaFin, String unidadTiempo) {
    LocalDate dateBefore = LocalDate.parse(fechaInicio);
    LocalDate dateAfter = LocalDate.parse(fechaFin);
    long resultado = 0;
    switch (unidadTiempo) {
      case "anios":
        resultado = YEARS.between(dateBefore, dateAfter);
        break;
      case "dias":
        resultado = DAYS.between(dateBefore, dateAfter);
        break;
      case "meses":
        resultado = MONTHS.between(dateBefore, dateAfter);
        break;
      default:
        Logger.error(
            "calcularAntiguedadEntreFechas",
            "La unidad de tiempo no es valida para calcular la diferencia entre fechas");
    }
    return (int) resultado;
  }

  public static String convertirFormatoUnixAFecha(long fechaUnix) {
    long fecha = fechaUnix / 1000;
    final DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern(FORMATO_FECHA_YYYYMMDD.getFormato());
    return Instant.ofEpochSecond(fecha).atZone(ZoneId.of("GMT-5")).format(formatter);
  }

  public static Integer calcularEdad(String fechaNacimiento) {
    DateTimeFormatter fechaFormato =
        DateTimeFormatter.ofPattern(FORMATO_FECHA_YYYYMMDD.getFormato());
    LocalDate fechaNacimientoFormateada = LocalDate.parse(fechaNacimiento, fechaFormato);
    LocalDate fechaActual = LocalDate.now();
    Period periodo = Period.between(fechaNacimientoFormateada, fechaActual);
    return periodo.getYears();
  }

  public static String fechaActual() {
    return LocalDateTime.now().toString();
  }

  public static String agregarDiasAFecha(String fecha, int dias) {
    return LocalDateTime.parse(fecha).plusDays(dias).toString();
  }

  public static String agregarAnioFecha(String fecha, int cantidadAnios) {
    return DateTime.parse(fecha).plusYears(cantidadAnios).toString();
  }

  public static String obtenerFechaFormatoISO(String fecha) {
    String hora = new DateTime().toLocalTime().toString();
    return new DateTime(fecha + "T" + hora).toString();
  }

  public static String obtenerFechaInicioVigenciaSegunTerminoVencimientoAnual(
      String estadoPoliza, int cantidadDiasPoliza) {
    DateTime fechaInicio = new DateTime();
    switch (estadoPoliza) {
      case "vencerse":
        fechaInicio = fechaInicio.plusYears(-1).plusDays(cantidadDiasPoliza);
        break;
      case "vencida":
        fechaInicio = fechaInicio.plusYears(-1).minusDays(cantidadDiasPoliza);
        break;
      case "expedida":
        fechaInicio = fechaInicio.minusDays(cantidadDiasPoliza);
        break;
      default:
        return fechaInicio.toString();
    }
    return fechaInicio.toString();
  }

  public static String obtenerFechaFinVigencia(String fechaInicioVigencia, String tipoVigencia) {
    String fechaFinVigencia;
    DateTime fechaInicio = new DateTime(fechaInicioVigencia);
    switch (tipoVigencia.toLowerCase()) {
      case "anual":
        fechaFinVigencia = fechaInicio.plusYears(1).toString();
        break;
      case "semestral":
        fechaFinVigencia = fechaInicio.plusMonths(6).toString();
        break;
      default:
        throw new IllegalArgumentException(String.format("Dato %s no encontrado", tipoVigencia));
    }
    return fechaFinVigencia;
  }

  public static String fechaVigenciaExpedicion(String fechaVigencia) {
    final String RETROACTIVA = "retroactiva";
    final String ANTICIPADA = "anticipada";
    final String ACTUAL = "actual";
    if (fechaVigencia.contains(RETROACTIVA)) {
      return LocalDate.now()
          .minusMonths(Integer.parseInt(fechaVigencia.replaceAll("\\D+", "")))
          .toString();
    } else if (fechaVigencia.contains(ANTICIPADA)) {
      return LocalDate.now()
          .plusMonths(Integer.parseInt(fechaVigencia.replaceAll("\\D+", "")))
          .toString();
    } else if (fechaVigencia.contains(ACTUAL)) {
      return LocalDate.now().toString();
    } else {
      Logger.error("Fechas", "El inicio de fecha de vigencia no es correcto");
    }
    return fechaVigencia;
  }

  public static String obtenerVigencia(int cantidadDias) {
    String vigencia = "Otra";
    switch (cantidadDias) {
      case 365:
        vigencia = "Anual";
        break;
      case 180:
        vigencia = "6 Meses";
        break;
      default:
        return vigencia;
    }
    return vigencia;
  }

  public static String obtenerFechaConFormato(String fecha, String formato, String formatoInicial) {
    SimpleDateFormat parseador = new SimpleDateFormat(formatoInicial);
    SimpleDateFormat formateador = new SimpleDateFormat(formato);
    String fechaFormateada = "";
    try {
      Date date = parseador.parse(fecha);
      fechaFormateada = formateador.format(date);
    } catch (ParseException e) {
      Logger.info(
          "fechas",
          String.format("Excepción ocurrida obteniendo la fecha en el formato: %s", formato));
    }
    return fechaFormateada;
  }
}
