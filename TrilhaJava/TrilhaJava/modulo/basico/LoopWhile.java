package TrilhaJava.modulo.basico;
import java.util.concurrent.ThreadLocalRandom;

public class LoopWhile {
    
    public static void main(String[] args) {
        Double mesada = 50.00;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            //if (valorDoce > mesada) {
               // valorDoce = mesada;
           //}
            System.out.printf("Doce do valor: R$ %.2f adicionado no carrinho \n", valorDoce);

            mesada = mesada - valorDoce;
        }
        System.out.printf("Mesada: R$ %.2f \n", mesada);
        System.out.println("Você gastou toda sua mesada '0'");

    }
    // Metodo que ira trazer um valor aleatório
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 10);
    }
}
