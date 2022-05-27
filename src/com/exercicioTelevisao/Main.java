package com.exercicioTelevisao;

public class Main {
    public static void main(String[] args) {
        Televisao tv1 = new Televisao();
        ControleRemoto controletv1 = new ControleRemoto();

        controletv1.aumentarCanal(tv1);
        controletv1.aumentarVolume(tv1);
        controletv1.aumentarVolume(tv1);
        controletv1.aumentarVolume(tv1);
        controletv1.aumentarVolume(tv1);
        controletv1.aumentarVolume(tv1);
        controletv1.diminurVolume(tv1);
        controletv1.trocarCanal(tv1, 8);
        controletv1.diminuirCanal(tv1);
        controletv1.volume(tv1);
        controletv1.canal(tv1);

        System.out.println(tv1);
    }
}
