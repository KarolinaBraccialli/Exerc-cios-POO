package com.exercicioIMC;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu de opções");
        System.out.println("1. Idade");
        System.out.println("2. IMC");
        System.out.println("3. Sair");
        System.out.println("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Digite o ano de nascimento: ");
                int nascimento = scanner.nextInt();
                System.out.println("Digite o ano atual: ");
                int anoAtual = scanner.nextInt();
                System.out.println("A idade é: "+ (anoAtual-nascimento));
                break;
            case 2:
                System.out.println("Digite a altura: ");
                String altura = scanner.next();
                System.out.println("Digite o peso: ");
                String peso = scanner.next();
                double imc = Double.parseDouble(peso)/(Double.parseDouble(altura) * Double.parseDouble(altura));
                System.out.println("O IMC é: " + imc);
                break;
            case 3:
                scanner.close();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
