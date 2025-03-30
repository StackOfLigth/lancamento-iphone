package TrilhaJava.modulo.basico;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LoopWhile {
    
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);//instanciando objeto.

        System.out.println("Digite o valor da Mesada: ");
        Double mesada = leitura.nextDouble();//Entrada de input.

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();//Variavel para armazenar valor aleatorio
            System.out.printf("Você Possui: R$ %.2f \n", mesada);

            if (valorDoce > mesada) {//Validação para não utilizar além do saldo referenciado.
                valorDoce = mesada;
           }
            System.out.printf("Doce no de valor: R$ %.2f adicionado no carrinho \n", valorDoce);

            mesada = mesada - valorDoce;//atualiza o valor so saldo subtraindo pelo valor aleatorio do doce.
            
            leitura.close();
        }
        System.out.printf("Saldo Mesada: R$ %.2f \n", mesada);
        System.out.println("Você gastou toda sua mesada '0'");

    }
    // Metodo que ira trazer um valor aleatório
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 12);
    }
}
