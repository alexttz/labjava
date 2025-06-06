import java.util.Scanner;

public class LoopComWhile {
    public static void main(String []args){

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o número desejado: ");
        int i = teclado.nextInt();

        while(i >= 0){
            System.out.println(i);
            i--;
        }

        teclado.close();
    }
}


/*Código básico que demonstra o uso de fluxos de repetição em java */