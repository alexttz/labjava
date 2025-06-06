import java.util.Scanner;

public class CalculoTriangulo{
    public static void main (String []args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do lado 1: ");
        double lado1 = teclado.nextDouble();

        System.out.println("Digite o valor do lado 2");
        double lado2 = teclado.nextDouble();

        System.out.println("Digite o valor do lado 3: ");
        double lado3 = teclado.nextDouble();

        if(lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1){
            System.out.println("Valores inválidos! ");
        }
        else if(lado1 == lado2 && lado2==lado3){
            System.out.println("O triângulo é equilátero. ");
        }else if(lado1!= lado2 && lado2 != lado3 && lado1 != lado3){
            System.out.println("O triangulo é escaleno. ");
        }else{
            System.out.println("O triângulo é Isóceles. ");
        }
        teclado.close();
    }
}