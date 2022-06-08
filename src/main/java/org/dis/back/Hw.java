
package org.dis.back;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hw {

    @SerializedName("SistemaOperativo")
    @Expose
    private SistemaOperativo sistemaOperativo;
    @SerializedName("memoria")
    @Expose
    private Memoria memoria;
    @SerializedName("disco_duro")
    @Expose
    private DiscoDuro discoDuro;
    @SerializedName("pantalla")
    @Expose
    private Pantalla pantalla;
    @SerializedName("procesador")
    @Expose
    private String procesador;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hw() {
    }

    /**
     * 
     * @param pantalla
     * @param sistemaOperativo
     * @param memoria
     * @param discoDuro
     * @param procesador
     */
    public Hw(SistemaOperativo sistemaOperativo, Memoria memoria, DiscoDuro discoDuro, Pantalla pantalla, String procesador) {
        super();
        this.sistemaOperativo = sistemaOperativo;
        this.memoria = memoria;
        this.discoDuro = discoDuro;
        this.pantalla = pantalla;
        this.procesador = procesador;
    }

    public SistemaOperativo getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(SistemaOperativo sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public Hw withSistemaOperativo(SistemaOperativo sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
        return this;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public Hw withMemoria(Memoria memoria) {
        this.memoria = memoria;
        return this;
    }

    public DiscoDuro getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(DiscoDuro discoDuro) {
        this.discoDuro = discoDuro;
    }

    public Hw withDiscoDuro(DiscoDuro discoDuro) {
        this.discoDuro = discoDuro;
        return this;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Hw withPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
        return this;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Hw withProcesador(String procesador) {
        this.procesador = procesador;
        return this;
    }

}
