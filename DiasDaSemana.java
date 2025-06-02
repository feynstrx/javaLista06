package javaLista06;

public class DiasDaSemana {
    public static class DiasDaSemana {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Escolha um dia: ");
            System.out.println("Dia 01");
            System.out.println("Dia 02");
            System.out.println("Dia 03");
            System.out.println("Dia 04");
            System.out.println("Dia 05");
            System.out.println("Dia 06");
            System.out.println("Dia 07");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda");
                    break;
                case 3:
                    System.out.println("Terça");
                    break;
                case 4:
                    System.out.println("Quarta");
                    break;
                case 5:
                    System.out.println("Quinta");
                    break;
                case 6:
                    System.out.println("Sexta");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            sc.close();
        }
    }
}
