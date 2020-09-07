package co.com.retotecnicobanistmo.certification.reto.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumCredenciales {
  SERVICIOS_OHS("cotizadorlab", "cotizadorlab"),
  SERVICIO_CONSULTA_EDGE("userEdgeGC", "dXNlckVkZ2VHQw=="),
  COTIZADOR("carlpase", "carlpase"),
  SERVICIOS_PC("userEdgeCA", "userEdgeCA"),
  SERVICIOS_SOAP("coregw", "co8re951*G/650w*");

  private final String usuario;
  private final String clave;
}
