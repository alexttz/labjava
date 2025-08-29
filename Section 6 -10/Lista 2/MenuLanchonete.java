import java.util.Scanner;

public class MenuLanchonete {
    public static void main(String[] args) {
        System.out.println("Menu Lanchonete");

        Scanner teclado = new Scanner(System.in);
        int opcao;
        double valorTotal = 0.0;
        double preco = 0.0;

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
                preco = 24.50;
                valorTotal += preco;
                break;
            case 3:
                System.out.println("Você escolheu X-Salada");
                preco = 20.50;
                valorTotal += preco;
                break;
            case 4:
                System.out.println("Você escolheu X-Bacon");
                preco = 28.90;
                valorTotal += preco;
                break;
            case 5:
                System.out.println("Você escolheu Bauru");
                preco = 12.00;
                valorTotal += preco;
                break;
            case 6:
                System.out.println("Você escolheu Refrigerante");
                preco = 8.00;
                valorTotal += preco;
                break;
            case 7:
                System.out.println("Você escolheu Suco de Laranja");
                preco = 2.25;
                valorTotal += preco;
                break;
            default:
                System.out.println("Opção inválida");
        }

    } while (opcao != 1);

    System.out.println("Valor total a pagar: R$ " + valorTotal);

    }
}
