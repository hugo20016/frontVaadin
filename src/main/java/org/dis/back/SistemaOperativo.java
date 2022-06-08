
package org.dis.back;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SistemaOperativo {

    @SerializedName("-nombre_SO")
    @Expose
    private String nombreSO;
    @SerializedName("-version_SO")
    @Expose
    private String versionSO;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SistemaOperativo() {
    }

    /**
     * 
     * @param versionSO
     * @param nombreSO
     */
    public SistemaOperativo(String nombreSO, String versionSO) {
        super();
        this.nombreSO = nombreSO;
        this.versionSO = versionSO;
    }

    public String getNombreSO() {
        return nombreSO;
    }

    public void setNombreSO(String nombreSO) {
        this.nombreSO = nombreSO;
    }

    public SistemaOperativo withNombreSO(String nombreSO) {
        this.nombreSO = nombreSO;
        return this;
    }

    public String getVersionSO() {
        return versionSO;
    }

    public void setVersionSO(String versionSO) {
        this.versionSO = versionSO;
    }

    public SistemaOperativo withVersionSO(String versionSO) {
        this.versionSO = versionSO;
        return this;
    }

}
