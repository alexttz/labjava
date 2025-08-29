import java.util.Scanner;

public class MenuLanchonete {
    public static void main(String[] args) {
        System.out.println("Menu Lanchonete");

        Scanner teclado = new Scanner(System.in);
        int opcao;

    do {

        System.out.println("1 - Sair");
        System.out.println("2 - Cachorro Quente");
        System.out.println("3 - X-Salada");
        System.out.println("4 - X-Bacon");
        System.out.println("5 - Bauru");
        System.out.println("6 - Refrigerante");
        System.out.println("7 - Suco de Laranja");

        opcao = teclado.nextInt(); // Simulando a escolha do usuário

        switch(opcao) {
            case 1:
                System.out.println("Você escolheu sair");
                break;
            case 2:
                System.out.println("Você escolheu Cachorro Quente");
                break;
            case 3:
                System.out.println("Você escolheu X-Salada");
                break;
            case 4:
                System.out.println("Você escolheu X-Bacon");
                break;
            case 5:
                System.out.println("Você escolheu Bauru");
                break;
            case 6:
                System.out.println("Você escolheu Refrigerante");
                break;
            case 7:
                System.out.println("Você escolheu Suco de Laranja");
                break;
            default:
                System.out.println("Opção inválida");
        }

    } while (opcao != 1);

    }
}
