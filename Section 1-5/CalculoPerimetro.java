import java.util.Scanner;

public class CalculoPerimetro{
    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da base do retangulo: ");
        double base = input.nextDouble();

        System.out.println("Digite o valor da altura do retângulo: ");
        double altura = input.nextDouble();

        double perimetro = 2 * (base + altura);

        System.out.println("Resultado do perímetro: " + perimetro);
    }
}