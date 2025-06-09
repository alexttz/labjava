import java.util.Scanner;

public class LoopComFor {
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = teclado.nextInt();

        for(int i = 0; i <= numero; i++){
            System.out.println(i);
        }

        teclado.close();
    }
}
