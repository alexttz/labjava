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

            if(opcao == 0){
                System.out.println("Saindo do programa...");
            } else if(opcao == 1){
                System.out.println("Opção 1 selecionada!");
            } else if(opcao == 2){
                System.out.println("Opção 2 selecionada!");
            } else if(opcao == 3){
                System.out.println("Opção 3 selecionada!");
            } else{
                System.out.println("Opção inválida!");
            }    
        } while(opcao != 0);
    }
}
