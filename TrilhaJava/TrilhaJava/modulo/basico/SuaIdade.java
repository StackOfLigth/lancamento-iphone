package TrilhaJava.modulo.basico;

import java.time.*;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class SuaIdade  {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);   //Instanciando objeto para entrada de dados

        //Entradas de dados
        System.out.println("Digite o ano do seu nascimento: ");
        int year = leitura.nextInt();
        System.out.println("Digite o mes do seu nascimento representado de 1 a 12: ");
        int month = leitura.nextInt();
        System.out.println("Digite o dia do seu nascimento: ");
        int day = leitura.nextInt();

        LocalDate nascimento = LocalDate.of(year, month, day);  //Setando as entrada de dados na variavel
        LocalDate hoje = LocalDate.now();   //Variavel que armazerada a data atual

        //Valida true or false para as informações de nascimento
        //Vou incluir um uma valdidação da entrada de dados
        System.out.printf("Igual? %b" + System.lineSeparator(),nascimento.isEqual(hoje));
        System.out.printf("Antes? %b"+ System.lineSeparator(),nascimento.isBefore(hoje));
        System.out.printf("Depois? %b" + System.lineSeparator(),nascimento.isAfter(hoje));


        Period periodo = Period.between(nascimento, hoje); // Valida diferença entre as variaveis nascimento e hoje
        LocalDateTime dataNascimento = nascimento.atStartOfDay();  // Data de nascimento com hora
        LocalDateTime dataAtual = hoje.atStartOfDay();  // Data atual com hora
        Duration duracao = Duration.between(dataNascimento, dataAtual);
        long minutos = duracao.toMinutes();


        // Para formatar e converter a quantidade de anos em minutos separados por milhar 1.000.000
        NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));
        String minutosFormatados = nf.format(minutos);

        System.out.println(
                "Voce tem extamente: "
                        + periodo.getYears() +
                        " Anos, " + periodo.getMonths() +
                        " Meses, " + periodo.getDays() + " dias"
        );
        System.out.printf("Ou seja voce ja viveu %s minutos", minutosFormatados);
    }
}
