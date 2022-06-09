
package org.dis.back;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id_equipo",
    "tipo",
    "marca",
    "uso",
    "hw",
    "sw",
    "SO"
})

public class Equipo {

    @JsonProperty("id_equipo")
    private String idEquipo;
    @JsonProperty("tipo")
    private String tipo;
    @JsonProperty("marca")
    private String marca;
    @JsonProperty("uso")
    private String uso;
    @JsonProperty("hw")
    private Hw hw;
    @JsonProperty("sw")
    private Sw sw;
    @JsonProperty("SO")
    private SistemaOperativo SO;


    /**
     * No args constructor for use in serialization
     * 
     */
    public Equipo() {
    }

    /**
     * 
     * @param uso
     * @param marca
     * @param idEquipo
     * @param tipo
     * @param sw
     * @param hw
     */
    public Equipo(String idEquipo, String tipo, String marca, String uso, Hw hw, Sw sw) {
        super();
        this.idEquipo = idEquipo;
        this.tipo = tipo;
        this.marca = marca;
        this.uso = uso;
        this.hw = hw;
        this.sw = sw;
    }

    @JsonProperty("id_equipo")
    public String getIdEquipo() {
        return idEquipo;
    }

    @JsonProperty("id_equipo")
    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Equipo withIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
        return this;
    }

    @JsonProperty("tipo")
    public String getTipo() {
        return tipo;
    }

    @JsonProperty("tipo")
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Equipo withTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    @JsonProperty("marca")
    public String getMarca() {
        return marca;
    }

    @JsonProperty("marca")
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Equipo withMarca(String marca) {
        this.marca = marca;
        return this;
    }

    @JsonProperty("uso")
    public String getUso() {
        return uso;
    }

    @JsonProperty("uso")
    public void setUso(String uso) {
        this.uso = uso;
    }

    public Equipo withUso(String uso) {
        this.uso = uso;
        return this;
    }

    @JsonProperty("hw")
    public Hw getHw() {
        return hw;
    }

    @JsonProperty("hw")
    public void setHw(Hw hw) {
        this.hw = hw;
    }

    public Equipo withHw(Hw hw) {
        this.hw = hw;
        return this;
    }

    @JsonProperty("sw")
    public Sw getSw() {
        return sw;
    }

    @JsonProperty("sw")
    public void setSw(Sw sw) {
        this.sw = sw;
    }

    public Equipo withSw(Sw sw) {
        this.sw = sw;
        return this;
    }

    @JsonProperty("SO")
    public SistemaOperativo getSO() {
        return SO;
    }
    @JsonProperty("SO")
    public void setSO(SistemaOperativo SO) {
        this.SO = SO;
    }
    public Equipo withSO(SistemaOperativo SO) {
        this.SO = SO;
        return this;
    }

    @JsonProperty("SO_nombre")
    public String getSO_nombre() {
        return SO.getNombreSO();
    }

    @JsonProperty("SO_nombre")
    public void setSO_nombre(String SO_nombre) {
        SO.setNombreSO(SO_nombre);
    }

    @JsonProperty("SO_version")
    public String getSO_version() {
        return SO.getVersionSO();
    }

    @JsonProperty("SO_version")
    public void setSO_version(String SO_version) {
        SO.setVersionSO(SO_version);
    }

    




}
