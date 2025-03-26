package TrilhaJava;
public class NotalFinal {
    public static void main(String[] args) {
        
        int notaFinal = 6;

        if (notaFinal <= 5) {
            System.out.println("Reprovado");
        } else if (notaFinal == 6) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }

    }
}