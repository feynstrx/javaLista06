package javaLista06;

public class EstacaoDoAno {
}
package lista06;

import java.util.Scanner;
package lista06;

import java.util.Scanner;

public class EstacaoDoAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número (1 a 4): ");
        int estacao = sc.nextInt();

        switch (estacao) {
            case 1:
                System.out.println("Primavera");
                break;
            case 2:
                System.out.println("Verão");
                break;
            case 3:
                System.out.println("Outono");
                break;
            case 4:
                System.out.println("Inverno");
                break;
            default:
                System.out.println("Número inválido.");
        }
        sc.close();
    }
}