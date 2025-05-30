import java.util.Scanner;

public class ConversaoFarenheit{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();

        double farenheit = ((9*celsius)/5) + 32;

        System.out.println("Temperatura em Farenheit: "+farenheit);
    }
}