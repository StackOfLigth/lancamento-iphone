package TrilhaJava.modulo.basico;
public class LoopFor {
    
    public static void main(String[] args) {

        //Loop FOR
        String nomesQualquer[] = {"Gustavo", "Maria Luiza", "Diana"};

        for(int xLista = 0; xLista < nomesQualquer.length; xLista++){

            System.out.println("O aluno no indice x= " + xLista + " é: " + nomesQualquer[xLista]);
        }

        System.out.println("Loop encerrado!");

        System.out.println("Usando forEach");
        //Usando forEach
        for(String nome : nomesQualquer)
        {
            System.out.println("Nome do aluno é: " + nome);
        }
        
        System.out.println("Usando o break");
        //Usando o break
        for(int x =1; x <= 10; x++){
            if(x == 5){
                break; //interrompe o fluxo quando atingir a condicional do if.
            }
            System.out.println(x);
        }

        System.out.println("Usando o continue");
        //Usando o continue
        for(int x =1; x <= 10; x++){
            if(x % 2 == 0){
                continue; //Não interrompe o fluxo quando atingir a condicional do if.
            }
            System.out.println(x);
        }
    }
    
}
