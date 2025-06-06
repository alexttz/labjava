import java.util.Scanner;

public class MercadoMacas{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número de maçãs compradas: ");
        int quantidadeMacas = teclado.nextInt();
        double precoUnidade = 0;

        if(quantidadeMacas >= 12){
            precoUnidade = 0.25;
        }else{
            precoUnidade = 0.30;
        }

        double precoTotal = quantidadeMacas * precoUnidade;

        System.out.println("Valor total: " + precoTotal);
        teclado.close();
    }
}