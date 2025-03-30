package TrilhaJava.modulo.basico;

import java.util.Random;
import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);//Instancia o objeto scanner, referenciado pela variavel leitura

        System.out.println("DIgite o nome do contato para inciar a ligação: ");
        String contato = leitura.nextLine();

        System.out.printf("Discando para %s...\n", contato);

        do {
            
            System.out.println("Telefone tocando");

        } 
        while (tocando());//validação do metodo

        System.out.printf("Alo, %s! Tudo bem?\n", contato);

        leitura.close();
    }

    //Metodo boleano
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.printf("Atendeu? %b%n ", atendeu);
        return ! atendeu;
    }
}
