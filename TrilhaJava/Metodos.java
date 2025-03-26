package TrilhaJava;
public class Metodos {
    public static void main(String[] args) {
        String nome = "Gustavo";
        String sobrenome = "Fernandes";
        String nomeCompleto = metodo1(nome, sobrenome);

        System.out.println(nomeCompleto);
    }
        //Metodo que chama o nome e sobrenome.
    public static String metodo1(String nome, String sobrenome) {
        
        //Opção 1
        return nome.concat(" ").concat(sobrenome);

        //Opção 2
        //return nome + " " + sobrenome;
    }
}
