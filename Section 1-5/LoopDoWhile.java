import java.util.Scanner;

public class LoopDoWhile {
    public static void main (String []args){

        Scanner teclado = new Scanner(System.in);
        
        int numero = 0;

        do{
            System.out.println("Digite um número de 0 a 10: ");
            numero = teclado.nextInt();

        }while(numero < 0 || numero > 10);

        teclado.close();

    }
}
