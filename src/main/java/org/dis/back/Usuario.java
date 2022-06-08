
package org.dis.back;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id_usuario",
    "nombre_usuario",
    "departamento_usuario",
    "telefono_usuario",
    "correo_usuario",
    "ubicacion_usuario"
})
public class Usuario {

    @JsonProperty("id_usuario")
    private String idUsuario;
    @JsonProperty("nombre_usuario")
    private String nombreUsuario;
    @JsonProperty("departamento_usuario")
    private String departamentoUsuario;
    @JsonProperty("telefono_usuario")
    private String telefonoUsuario;
    @JsonProperty("correo_usuario")
    private String correoUsuario;
    @JsonProperty("ubicacion_usuario")
    private String ubicacionUsuario;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Usuario() {
    }

    /**
     * 
     * @param departamentoUsuario
     * @param telefonoUsuario
     * @param correoUsuario
     * @param idUsuario
     * @param ubicacionUsuario
     * @param nombreUsuario
     */
    public Usuario(String idUsuario, String nombreUsuario, String departamentoUsuario, String telefonoUsuario, String correoUsuario, String ubicacionUsuario) {
        super();
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.departamentoUsuario = departamentoUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.correoUsuario = correoUsuario;
        this.ubicacionUsuario = ubicacionUsuario;
    }

    @JsonProperty("id_usuario")
    public String getIdUsuario() {
        return idUsuario;
    }

    @JsonProperty("id_usuario")
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario withIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    @JsonProperty("nombre_usuario")
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    @JsonProperty("nombre_usuario")
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Usuario withNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        return this;
    }

    @JsonProperty("departamento_usuario")
    public String getDepartamentoUsuario() {
        return departamentoUsuario;
    }

    @JsonProperty("departamento_usuario")
    public void setDepartamentoUsuario(String departamentoUsuario) {
        this.departamentoUsuario = departamentoUsuario;
    }

    public Usuario withDepartamentoUsuario(String departamentoUsuario) {
        this.departamentoUsuario = departamentoUsuario;
        return this;
    }

    @JsonProperty("telefono_usuario")
    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    @JsonProperty("telefono_usuario")
    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public Usuario withTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
        return this;
    }

    @JsonProperty("correo_usuario")
    public String getCorreoUsuario() {
        return correoUsuario;
    }

    @JsonProperty("correo_usuario")
    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public Usuario withCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
        return this;
    }

    @JsonProperty("ubicacion_usuario")
    public String getUbicacionUsuario() {
        return ubicacionUsuario;
    }

    @JsonProperty("ubicacion_usuario")
    public void setUbicacionUsuario(String ubicacionUsuario) {
        this.ubicacionUsuario = ubicacionUsuario;
    }

    public Usuario withUbicacionUsuario(String ubicacionUsuario) {
        this.ubicacionUsuario = ubicacionUsuario;
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

    public Usuario withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
