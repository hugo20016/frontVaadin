
package org.dis.front;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Memoria {

    @SerializedName("-velocidad_memoria")
    @Expose
    private String velocidadMemoria;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Memoria() {
    }

    /**
     * 
     * @param velocidadMemoria
     */
    public Memoria(String velocidadMemoria) {
        super();
        this.velocidadMemoria = velocidadMemoria;
    }

    public String getVelocidadMemoria() {
        return velocidadMemoria;
    }

    public void setVelocidadMemoria(String velocidadMemoria) {
        this.velocidadMemoria = velocidadMemoria;
    }

    public Memoria withVelocidadMemoria(String velocidadMemoria) {
        this.velocidadMemoria = velocidadMemoria;
        return this;
    }

}
