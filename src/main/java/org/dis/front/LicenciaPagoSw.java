
package org.dis.front;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class LicenciaPagoSw {

    @SerializedName("-nombre_LP")
    @Expose
    private String nombreLP;
    @SerializedName("-version_LP")
    @Expose
    private String versionLP;
    @SerializedName("-tipo_LP")
    @Expose
    private String tipoLP;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LicenciaPagoSw() {
    }

    /**
     * 
     * @param nombreLP
     * @param tipoLP
     * @param versionLP
     */
    public LicenciaPagoSw(String nombreLP, String versionLP, String tipoLP) {
        super();
        this.nombreLP = nombreLP;
        this.versionLP = versionLP;
        this.tipoLP = tipoLP;
    }

    public String getNombreLP() {
        return nombreLP;
    }

    public void setNombreLP(String nombreLP) {
        this.nombreLP = nombreLP;
    }

    public LicenciaPagoSw withNombreLP(String nombreLP) {
        this.nombreLP = nombreLP;
        return this;
    }

    public String getVersionLP() {
        return versionLP;
    }

    public void setVersionLP(String versionLP) {
        this.versionLP = versionLP;
    }

    public LicenciaPagoSw withVersionLP(String versionLP) {
        this.versionLP = versionLP;
        return this;
    }

    public String getTipoLP() {
        return tipoLP;
    }

    public void setTipoLP(String tipoLP) {
        this.tipoLP = tipoLP;
    }

    public LicenciaPagoSw withTipoLP(String tipoLP) {
        this.tipoLP = tipoLP;
        return this;
    }

}
