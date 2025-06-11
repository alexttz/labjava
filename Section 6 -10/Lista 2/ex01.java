import java.util.Scanner;

public class ex01{
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10:");
        int numero = teclado.nextInt();

        while(numero > 0){
            System.out.println(numero);
            numero--;        
        }
        teclado.close();
    }
}