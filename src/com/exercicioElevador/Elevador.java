package com.exercicioElevador;

public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasPresentes;

    public Elevador() {

    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    void inicializar(int capacidadeElevador, int totalAndares){
        this.setAndarAtual(0);
        this.setPessoasPresentes(0);
        this.setCapacidadeElevador(capacidadeElevador);
        this.setTotalAndares(totalAndares);
    }

    void entrar(){
        if (this.getPessoasPresentes() == this.getCapacidadeElevador()){
            System.out.println("Capacidade máxima.");
        } else {
            this.setPessoasPresentes(this.getPessoasPresentes()+1);
        }
    }

    void sair(){
        if (this.getPessoasPresentes() == 0){
            System.out.println("Não há pessoas no elevador.");
        } else {
            this.setPessoasPresentes(this.getPessoasPresentes()-1);
        }
    }

    void subir(){
        int proximoAndar = this.getAndarAtual()+1;
        if (proximoAndar > this.getTotalAndares()){
            System.out.println("O elevador já está no último andar.");
        } else {
            this.setAndarAtual(proximoAndar);
        }
    }

    void subir(int qteAndares){
        for (int i = 0; i < qteAndares; i++){
            this.subir();
        }
    }

    void descer(){
        if (this.getAndarAtual() == 0){
            System.out.println("O elevador já está no térreo.");
        } else {
            this.setAndarAtual(this.getAndarAtual()-1);
        }
    }

    void descer(int qteAndares){
        for (int i = 0; i < qteAndares; i++){
            this.descer();
        }
    }


    @Override
    public String toString() {
        return "{" +
                "andarAtual=" + andarAtual +
                ", totalAndares=" + totalAndares +
                ", capacidadeElevador=" + capacidadeElevador +
                ", pessoasPresentes=" + pessoasPresentes +
                '}';
    }
}
