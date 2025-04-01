package TrilhaJava.modulo.basico;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class JogoDoAcerto {
    
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Tente advinhar o número secreto!");

        int numbSort = leitura.nextInt();
       
        do {
            if(numbSort == numbRandom()){
               System.out.println("Parabens você acertou!");
            } else{
                System.out.println("Você não acertou, tente novamente");
            }
            
        } while (numbSort == numbRandom());

        System.out.println("O Numero correto é: " + numbRandom());

        leitura.close();
    }
    private static int numbRandom(){
        return ThreadLocalRandom.current().nextInt(2, 12);
    }

}
