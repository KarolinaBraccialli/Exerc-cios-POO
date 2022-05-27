package com.exercicioDesconto;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        double valorCompra = 200;
        double valorFinal = 0;
        int desconto = 0;

        System.out.println("------------------------------------------------------------");
        System.out.printf("%s\t\t %s\t\t %s", "Valor da Compra", "Desconto", "Valor Final");
        System.out.println();
        System.out.println("------------------------------------------------------------");


        for (int i = 0; i < 20; i++){
            valorCompra+= 100;
            desconto++;
            valorFinal = valorCompra - ((valorCompra * desconto)/100);
            System.out.printf("%.0f \t\t\t\t %2d \t\t\t %.0f \n", valorCompra, desconto, valorFinal);
        }

        System.out.println("------------------------------------------------------------");
    }


}
