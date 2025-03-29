package TrilhaJava.modulo.basico;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = leitura.next();
        
        System.out.println("Digite o nome do aluno: ");
        int notaAluno = leitura.nextInt();

        //Com IF-ELSE

        if(notaAluno >= 7){
            System.out.printf("%s, está: APROVADO", nomeAluno);
        } else if(notaAluno >= 4 && notaAluno <=6){
            System.out.printf("%s, está: DE EXAME", nomeAluno);
        } else{
            System.out.printf("%s, está: REPROVADO", nomeAluno);
        }

        

                //Com Ternário

                String notaFinal = (notaAluno == 10) ? "TOP" : "Não Top";
                System.out.println(notaFinal);

                //Com SWICH-CASE

                switch (notaAluno) {
                    case 9:
                        System.out.println("deu certo");
                        break;
                
                    default: System.out.println("não deu certo");
                        break;
                }
        leitura.close();
    }



    
}
