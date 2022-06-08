
package org.dis.back;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sw {

    @SerializedName("licenciaPago_sw")
    @Expose
    private LicenciaPagoSw licenciaPagoSw;
    @SerializedName("licenciaLibre_sw")
    @Expose
    private LicenciaLibreSw licenciaLibreSw;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sw() {
    }

    /**
     * 
     * @param licenciaLibreSw
     * @param licenciaPagoSw
     */
    public Sw(LicenciaPagoSw licenciaPagoSw, LicenciaLibreSw licenciaLibreSw) {
        super();
        this.licenciaPagoSw = licenciaPagoSw;
        this.licenciaLibreSw = licenciaLibreSw;
    }

    public LicenciaPagoSw getLicenciaPagoSw() {
        return licenciaPagoSw;
    }

    public void setLicenciaPagoSw(LicenciaPagoSw licenciaPagoSw) {
        this.licenciaPagoSw = licenciaPagoSw;
    }

    public Sw withLicenciaPagoSw(LicenciaPagoSw licenciaPagoSw) {
        this.licenciaPagoSw = licenciaPagoSw;
        return this;
    }

    public LicenciaLibreSw getLicenciaLibreSw() {
        return licenciaLibreSw;
    }

    public void setLicenciaLibreSw(LicenciaLibreSw licenciaLibreSw) {
        this.licenciaLibreSw = licenciaLibreSw;
    }

    public Sw withLicenciaLibreSw(LicenciaLibreSw licenciaLibreSw) {
        this.licenciaLibreSw = licenciaLibreSw;
        return this;
    }

}
