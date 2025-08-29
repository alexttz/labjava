public class ValoresPadrao {

    //Variável no escopo da classe ValoresPadrao
    static int numero;

    public static void main(String[] args) {
        
        System.out.println(numero);

        if (numero > 1) {
            int n1 = 2;
        }

        // System.out.println(n1); - Aqui não é possível imprimir pois a chamada está fora do escopo do if
    }
}
