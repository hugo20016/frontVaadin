
package org.dis.back;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Pantalla {

    @SerializedName("-diagonal_pantalla")
    @Expose
    private String diagonalPantalla;
    @SerializedName("-resolucion_pantalla")
    @Expose
    private String resolucionPantalla;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pantalla() {
    }

    /**
     * 
     * @param diagonalPantalla
     * @param resolucionPantalla
     */
    public Pantalla(String diagonalPantalla, String resolucionPantalla) {
        super();
        this.diagonalPantalla = diagonalPantalla;
        this.resolucionPantalla = resolucionPantalla;
    }

    public String getDiagonalPantalla() {
        return diagonalPantalla;
    }

    public void setDiagonalPantalla(String diagonalPantalla) {
        this.diagonalPantalla = diagonalPantalla;
    }

    public Pantalla withDiagonalPantalla(String diagonalPantalla) {
        this.diagonalPantalla = diagonalPantalla;
        return this;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }

    public Pantalla withResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
        return this;
    }

}
