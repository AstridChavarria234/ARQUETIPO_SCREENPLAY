package co.com.retotecnicobanistmo.certification.reto.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"codigo", "descripcion"})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Clase implements Serializable {
  @JsonProperty("codigo")
  private String codigo;

  @JsonProperty("descripcion")
  private String descripcion;

  private static final long serialVersionUID = 6020777733829140034L;
}
