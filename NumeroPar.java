import java.util.Scanner;

public class NumeroPar {
    public static void main(String []args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();

        while (numero >= 0){
           if(numero % 2 == 0){
                System.out.println(numero);
           }
           else{
            System.out.println("Opa, esse número é ímpar! ");
            break;
           }
           numero--;
        }

        teclado.close();
    }
}
