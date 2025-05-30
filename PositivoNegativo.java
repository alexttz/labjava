import java.util.Scanner;

public class PositivoNegativo{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int numero = input.nextInt();

        if(numero < 0){
            System.out.println("O numero é negativo! ");
        }else if(numero > 0){
            System.out.println("O numero é positivo! ");
        }else{
            System.out.println("O numero é igual a zero. ");
        }
    }
}