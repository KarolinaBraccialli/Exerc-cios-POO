package com.exercicioElevador;

public class Main {
    public static void main(String[] args) {
        Elevador elevador1 = new Elevador();
        elevador1.inicializar(2,2);
        elevador1.entrar();
        elevador1.sair();
        elevador1.subir(5);
        elevador1.descer(5);

        System.out.println(elevador1);
    }
}
