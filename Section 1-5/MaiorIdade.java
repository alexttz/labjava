import java.util.Scanner;

public class MaiorIdade{
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = teclado.nextInt();

        System.out.println("Agora digite o ano atual: ");
        int anoAtual = teclado.nextInt();

        int idade = anoAtual - anoNascimento;

        if(idade >= 18){
            System.out.println("Você tem maior idade e pode votar. ");
        }else if((idade >= 16 && idade < 18) || idade >= 70){
            System.out.println("Voto facultativo, se quiser pode votar. ");
        }else{
            System.out.println("Você não pode votar. ");
        }
    }    
}