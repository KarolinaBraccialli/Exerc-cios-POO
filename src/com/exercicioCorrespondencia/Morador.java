package com.exercicioCorrespondencia;

public class Morador {

    private long telefone;
    private int numResidencia;
    private boolean temCachorro;

    public Morador(int numResidencia, boolean temCachorro) {
        this.numResidencia = numResidencia;
        this.temCachorro = temCachorro;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public int getNumResidencia() {
        return numResidencia;
    }

    public void setNumResidencia(int numResidencia) {
        this.numResidencia = numResidencia;
    }

    public boolean getTemCachorro() {
        return temCachorro;
    }

    public void setTemCachorro(boolean temCachorro) {
        this.temCachorro = temCachorro;
    }


}
