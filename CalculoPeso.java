import java.util.Scanner;

public class CalculoPeso{
    public static void main(String []args){

        Scanner teclado = new Scanner(System.in);
        double pesoIdeal, altura;


        System.out.println("Escolha seu sexo: 1- Masculino / 2- Feminino");
        int i = teclado.nextInt();

        switch(i){
            case 1:
                System.out.println("Informe o valor da sua altura: ");
                altura = teclado.nextDouble();
                pesoIdeal = (72.7 * altura) - 44.7;


                System.out.println("Homem: Seu peso ideal é de: " + pesoIdeal);
                break;
            case 2:
                System.out.println("Informe o valor da sua altura: ");
                altura = teclado.nextDouble();
                pesoIdeal = (62.1 * altura) - 58;

                System.out.println("Mulher: Seu peso ideal é de: " + pesoIdeal);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        teclado.close();
    }
}