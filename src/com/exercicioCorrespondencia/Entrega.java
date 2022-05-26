package com.exercicioCorrespondencia;

import java.util.ArrayList;
import java.util.List;

public class Entrega {
    public static void main(String[] args) {
       List<Morador> moradores = new ArrayList<>();

       Morador morador1 = new Morador(131, false);
       Morador morador2 = new Morador(54, false);
       moradores.add(morador1);
       moradores.add(morador2);

       int quantidadeEntregas = 0;
        for (Morador morador:moradores) {
            if (!morador.getTemCachorro() && morador.getNumResidencia() %2  != 0){
                quantidadeEntregas++;
            }
        }

        System.out.println("Total de correspondências entregues em casas ímpares: " + quantidadeEntregas);

    }
}
