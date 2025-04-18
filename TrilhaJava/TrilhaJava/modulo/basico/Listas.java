package TrilhaJava.modulo.basico;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Gustavo");
        lista.add("Gabriel");
        lista.add("Giovanna");
        lista.add("Gulia");
        lista.add("Gustavo");

        System.out.println(lista.contains("Gustavo".indexOf(lista.get(0))));

    }

}
