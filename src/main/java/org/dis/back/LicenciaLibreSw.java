
package org.dis.back;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LicenciaLibreSw {

    @SerializedName("-nombre_LL")
    @Expose
    private String nombreLL;
    @SerializedName("-version_LL")
    @Expose
    private String versionLL;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LicenciaLibreSw() {
    }

    /**
     * 
     * @param nombreLL
     * @param versionLL
     */
    public LicenciaLibreSw(String nombreLL, String versionLL) {
        super();
        this.nombreLL = nombreLL;
        this.versionLL = versionLL;
    }

    public String getNombreLL() {
        return nombreLL;
    }

    public void setNombreLL(String nombreLL) {
        this.nombreLL = nombreLL;
    }

    public LicenciaLibreSw withNombreLL(String nombreLL) {
        this.nombreLL = nombreLL;
        return this;
    }

    public String getVersionLL() {
        return versionLL;
    }

    public void setVersionLL(String versionLL) {
        this.versionLL = versionLL;
    }

    public LicenciaLibreSw withVersionLL(String versionLL) {
        this.versionLL = versionLL;
        return this;
    }

}
