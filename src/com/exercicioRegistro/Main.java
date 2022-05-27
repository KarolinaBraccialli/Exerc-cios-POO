package com.exercicioRegistro;

public class Main {
    public static void main(String[] args) {
       Colaborador colaborador = new Colaborador();
       colaborador.setNomeColaborador("Karolina");
       colaborador.setMatricula("0001");

       ColaboradorEnsinoBasico colaboradorEnsinoBasico = new ColaboradorEnsinoBasico();
       colaboradorEnsinoBasico.setNomeColaborador("Felipe");
       colaboradorEnsinoBasico.setMatricula("0002");
       colaboradorEnsinoBasico.setEscola("ETEC");

       ColaboradorUniversidade colaboradorUniversidade = new ColaboradorUniversidade();
       colaboradorUniversidade.setNomeColaborador("Raphael");
       colaboradorUniversidade.setMatricula("0003");
       colaboradorUniversidade.setUniversidade("Fatec");
    }
}
