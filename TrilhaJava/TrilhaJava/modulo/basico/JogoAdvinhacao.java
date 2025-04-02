package TrilhaJava.modulo.basico;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numbSort = random.nextInt(10) + 1; // Sorteia um número de 1 a 10
        int numbTentativa;

        do {
            System.out.print("Tente adivinhar o número: ");
            numbTentativa = scanner.nextInt(); // Captura a tentativa do usuário

            if (numbTentativa == numbSort) {
                System.out.println("Parabéns, você acertou!");
            } else {
                System.out.println("Você não acertou, tente novamente!");
            }
        } while (numbTentativa != numbSort); // Continua até acertar

        scanner.close();
    }
}


