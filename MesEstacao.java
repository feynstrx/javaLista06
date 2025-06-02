package javaLista06;

public class MesEstacao {
}
package lista06;

import java.util.Scanner;

public class MesEstacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o mês: ");
        int mes = sc.nextInt();
        String nomeMes = "";
        String estacao = "";

        switch (mes) {
            case 12: case 1: case 2:
                estacao = "Verão";
                break;
            case 3: case 4: case 5:
                estacao = "Outono";
                break;
            case 6: case 7: case 8:
                estacao = "Inverno";
                break;
            case 9: case 10: case 11:
                estacao = "Primavera";
                break;
            default:
                System.out.println("Mês inválido.");
                return;
        }

        switch (mes) {
            case 1: nomeMes = "Janeiro";
                break;
            case 2: nomeMes = "Fevereiro";
                break;
            case 3: nomeMes = "Março";
                break;
            case 4: nomeMes = "Abril";
                break;
            case 5: nomeMes = "Maio";
                break;
            case 6: nomeMes = "Junho";
                break;
            case 7: nomeMes = "Julho";
                break;
            case 8: nomeMes = "Agosto";
                break;
            case 9: nomeMes = "Setembro";
                break;
            case 10: nomeMes = "Outubro";
                break;
            case 11: nomeMes = "Novembro";
                break;
            case 12: nomeMes = "Dezembro";
                break;
        }

        System.out.println(nomeMes + " - " + estacao);
    }
}
