package javaLista06;

public class CategoriaIdade {
}
package lista06;

import java.util.Scanner;

public class CategoriaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        String categoria = sc.toString();

        switch (idade / 10) {
            case 1: categoria = "Criança";
                break;
            case 2: categoria = "Adolescente";
                break;
            case 3: categoria = "Adulto";
                break;
            default: categoria = "Idoso";
        }

        System.out.println("Categoria: " + categoria);
    }
}
