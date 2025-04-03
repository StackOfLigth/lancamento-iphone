public class CriaPessoa {
    public static void main(String[] args) {
        ObjetoPessoa pessoa = new ObjetoPessoa();
        pessoa.nome = "Gustavo";
        pessoa.idade = 32;
        pessoa.sexo = "M";

        System.out.println(pessoa.nome + pessoa.idade + pessoa.sexo);
    }
}
