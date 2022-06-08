
package org.dis.front;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class DiscoDuro {

    @SerializedName("-tipo_dd")
    @Expose
    private String tipoDd;
    @SerializedName("-capacidad_dd")
    @Expose
    private String capacidadDd;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DiscoDuro() {
    }

    /**
     * 
     * @param tipoDd
     * @param capacidadDd
     */
    public DiscoDuro(String tipoDd, String capacidadDd) {
        super();
        this.tipoDd = tipoDd;
        this.capacidadDd = capacidadDd;
    }

    public String getTipoDd() {
        return tipoDd;
    }

    public void setTipoDd(String tipoDd) {
        this.tipoDd = tipoDd;
    }

    public DiscoDuro withTipoDd(String tipoDd) {
        this.tipoDd = tipoDd;
        return this;
    }

    public String getCapacidadDd() {
        return capacidadDd;
    }

    public void setCapacidadDd(String capacidadDd) {
        this.capacidadDd = capacidadDd;
    }

    public DiscoDuro withCapacidadDd(String capacidadDd) {
        this.capacidadDd = capacidadDd;
        return this;
    }

}
