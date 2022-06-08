
package org.dis.front;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id_prestamo",
    "usuario_prestamo",
    "equipo_prestamo",
    "fechaInicio_prestamo",
    "fechaFin_prestamo",
    "fechaDevolucion_usuario"
})
@Generated("jsonschema2pojo")
public class Prestamo {

    @JsonProperty("id_prestamo")
    private String idPrestamo;
    @JsonProperty("usuario_prestamo")
    private String usuarioPrestamo;
    @JsonProperty("equipo_prestamo")
    private String equipoPrestamo;
    @JsonProperty("fechaInicio_prestamo")
    private String fechaInicioPrestamo;
    @JsonProperty("fechaFin_prestamo")
    private String fechaFinPrestamo;
    @JsonProperty("fechaDevolucion_usuario")
    private String fechaDevolucionUsuario;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Prestamo() {
    }

    /**
     * 
     * @param equipoPrestamo
     * @param fechaInicioPrestamo
     * @param fechaDevolucionUsuario
     * @param idPrestamo
     * @param fechaFinPrestamo
     * @param usuarioPrestamo
     */
    public Prestamo(String idPrestamo, String usuarioPrestamo, String equipoPrestamo, String fechaInicioPrestamo, String fechaFinPrestamo, String fechaDevolucionUsuario) {
        super();
        this.idPrestamo = idPrestamo;
        this.usuarioPrestamo = usuarioPrestamo;
        this.equipoPrestamo = equipoPrestamo;
        this.fechaInicioPrestamo = fechaInicioPrestamo;
        this.fechaFinPrestamo = fechaFinPrestamo;
        this.fechaDevolucionUsuario = fechaDevolucionUsuario;
    }

    @JsonProperty("id_prestamo")
    public String getIdPrestamo() {
        return idPrestamo;
    }

    @JsonProperty("id_prestamo")
    public void setIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Prestamo withIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
        return this;
    }

    @JsonProperty("usuario_prestamo")
    public String getUsuarioPrestamo() {
        return usuarioPrestamo;
    }

    @JsonProperty("usuario_prestamo")
    public void setUsuarioPrestamo(String usuarioPrestamo) {
        this.usuarioPrestamo = usuarioPrestamo;
    }

    public Prestamo withUsuarioPrestamo(String usuarioPrestamo) {
        this.usuarioPrestamo = usuarioPrestamo;
        return this;
    }

    @JsonProperty("equipo_prestamo")
    public String getEquipoPrestamo() {
        return equipoPrestamo;
    }

    @JsonProperty("equipo_prestamo")
    public void setEquipoPrestamo(String equipoPrestamo) {
        this.equipoPrestamo = equipoPrestamo;
    }

    public Prestamo withEquipoPrestamo(String equipoPrestamo) {
        this.equipoPrestamo = equipoPrestamo;
        return this;
    }

    @JsonProperty("fechaInicio_prestamo")
    public String getFechaInicioPrestamo() {
        return fechaInicioPrestamo;
    }

    @JsonProperty("fechaInicio_prestamo")
    public void setFechaInicioPrestamo(String fechaInicioPrestamo) {
        this.fechaInicioPrestamo = fechaInicioPrestamo;
    }

    public Prestamo withFechaInicioPrestamo(String fechaInicioPrestamo) {
        this.fechaInicioPrestamo = fechaInicioPrestamo;
        return this;
    }

    @JsonProperty("fechaFin_prestamo")
    public String getFechaFinPrestamo() {
        return fechaFinPrestamo;
    }

    @JsonProperty("fechaFin_prestamo")
    public void setFechaFinPrestamo(String fechaFinPrestamo) {
        this.fechaFinPrestamo = fechaFinPrestamo;
    }

    public Prestamo withFechaFinPrestamo(String fechaFinPrestamo) {
        this.fechaFinPrestamo = fechaFinPrestamo;
        return this;
    }

    @JsonProperty("fechaDevolucion_usuario")
    public String getFechaDevolucionUsuario() {
        return fechaDevolucionUsuario;
    }

    @JsonProperty("fechaDevolucion_usuario")
    public void setFechaDevolucionUsuario(String fechaDevolucionUsuario) {
        this.fechaDevolucionUsuario = fechaDevolucionUsuario;
    }

    public Prestamo withFechaDevolucionUsuario(String fechaDevolucionUsuario) {
        this.fechaDevolucionUsuario = fechaDevolucionUsuario;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Prestamo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
