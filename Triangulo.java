package javaLista06;

public class Triangulo {
}
package lista06;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado A: ");
        int a = sc.nextInt();
        System.out.print("Lado B: ");
        int b = sc.nextInt();
        System.out.print("Lado C: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            int tipo = (a == b && b == c) ? 1 : (a == b || a == c || b == c) ? 2 : 3;
            switch (tipo) {
                case 1: System.out.println("Equilátero"); break;
                case 2: System.out.println("Isósceles"); break;
                case 3: System.out.println("Escaleno"); break;
            }
        } else {
            System.out.println("Não é um triângulo válido.");
        }
        sc.close();
    }
}
