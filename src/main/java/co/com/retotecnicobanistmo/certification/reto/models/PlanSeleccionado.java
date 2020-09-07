package co.com.retotecnicobanistmo.certification.reto.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "codigoPlan",
  "nombrePlan",
  "codigoOrganizacionVentas",
  "codigoCanalVentas",
  "codigoPolizaVentas",
  "clases"
})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class PlanSeleccionado implements Serializable {
  @JsonProperty("codigoPlan")
  private String codigoPlan;

  @JsonProperty("nombrePlan")
  private String nombrePlan;

  @JsonProperty("codigoOrganizacionVentas")
  private String codigoOrganizacionVentas;

  @JsonProperty("codigoCanalVentas")
  private String codigoCanalVentas;

  @JsonProperty("codigoPolizaVentas")
  private String codigoPolizaVentas;

  @JsonProperty("clases")
  private List<Clase> lstClases;

  private static final long serialVersionUID = 1222066713773356822L;
}
