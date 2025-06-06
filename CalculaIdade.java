import java.util.Scanner;

public class CalculaIdade {
    public static void main (String []args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt();

        if(idade >= 18 && idade =< 60){
            System.out.println("Você já é maior de idade! ");
        }else if (idade >= 60 ){
            System.out.println("Você é idoso! ");
        }else{
            System.out.println("Você é menor de idade! ");
        }

        teclado.close();
    }
}
