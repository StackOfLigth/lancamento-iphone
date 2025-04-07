package TrilhaJava.modulo.basico;

import java.util.Scanner;

public class OpTernario {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Promoção do dia, a partir de 10 laranjas, cada uma sai a R$ 2,00" + System.lineSeparator());
        System.out.println("Pagando no PIX tem 10% de desconto!" + System.lineSeparator());

        System.out.println("Digite a quantidade de laranjas que voce quer comprar: ");
        var laranja = leitura.nextInt();

        leitura.nextLine();

        System.out.println("Pagamento no PIX? Digite Sim ou Não: ");

        String pix = leitura.nextLine();

        double venda = laranja < 10 ? 2.8 : 2;
        double desconto = pix.equals("Sim") ? .9 : 1;

        double pagamento = laranja *venda * desconto;
        System.out.printf("Total a pagar: R$ %.2f", pagamento);

        leitura.close();



    }
}
