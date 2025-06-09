import java.util.Scanner;

public class MenuDoWhile {
    public static void main (String[]args){

        Scanner teclado = new Scanner (System.in);
        int opcao = 0;

        do{
            System.out.println("Digite o número correspondente a opção desejada:");
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Opção 3");
            System.out.println("0 - Sair");

            opcao = teclado.nextInt();

        } while(opcao != 0);
    }
}
