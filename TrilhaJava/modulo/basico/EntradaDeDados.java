package TrilhaJava.modulo.basico;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        
        // Criando novo objeto scanner para entrada de dados.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite Seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite Seu Sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite Seu Genero: ");
        String genero = scanner.next();

        System.out.println("Digite Sua Idade: ");
        Double idade = scanner.nextDouble();

        System.out.println("Compilando dados");

        System.out.println("Nome Completo: " + nome + " " + sobreNome);
        System.out.println("Sexo: " + genero);
        System.out.println("idade: " + idade);
        

        System.out.println("Fim");
    }
}
