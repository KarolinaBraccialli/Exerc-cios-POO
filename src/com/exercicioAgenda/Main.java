package com.exercicioAgenda;

public class Main {
    public static void main(String[] args) {

        Agenda novaAgenda = new Agenda();

        novaAgenda.armazenaPessoa("Karolina", 35, 170);
        novaAgenda.armazenaPessoa("Felipe", 33, 180);
        novaAgenda.armazenaPessoa("Raphael", 30, 175);
        novaAgenda.removePessoa("Felipe");
        novaAgenda.imprimePessoa(1);
        System.out.println(novaAgenda.buscarPessoa("Karolina"));
        novaAgenda.imprimeAgenda();
    }
}
