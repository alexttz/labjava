import java.util.Scanner;

public class ex06{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int numero = teclado.nextInt();
        int soma = 0;
        int numeroOriginal = numero;

        while (numero > 0) {
            int digito = numero % 10;
            soma += digito;
            numero /= 10;

        }
    System.out.println("A soma dos digitos é: " + soma);
    teclado.close();
    }
}