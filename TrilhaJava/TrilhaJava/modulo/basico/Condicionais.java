package TrilhaJava.modulo.basico;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = leitura.next();
        
        System.out.println("Digite o nome do aluno: ");
        int notaAluno = leitura.nextInt();

        if(notaAluno >= 7){
            System.out.printf("%s, está: APROVADO", nomeAluno);
        } else if(notaAluno >= 4 && notaAluno <=6){
            System.out.printf("%s, está: DE EXAME", nomeAluno);
        } else{
            System.out.printf("%s, está: REPROVADO", nomeAluno);
        }

        leitura.close();
    }
    
}
