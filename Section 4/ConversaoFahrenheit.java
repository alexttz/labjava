import java.util.Scanner;

public class ConversaoFahrenheit{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = ((9*celsius)/5) + 32;

        System.out.println("Temperatura em Farenheit: "+fahrenheit);
    }
}