package TrilhaJava.modulo.basico;

public class Veiculo {



        public void acelerar() {

            System.out.println("Veiculo acelerando");

        }




    public static class Carro extends Veiculo {



        public void acelerar() {

            System.out.println("Carro acelerando");

        }




            public static void main(String[] args) {

                Veiculo veiculo = new Carro();

                veiculo.acelerar();

            }}}