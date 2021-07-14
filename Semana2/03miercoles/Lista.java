import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        // <> operador diamante
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Double> dobles = new ArrayList<>();

        lista.add("Brenda");
        lista.add("Priscila");
        lista.add("Dania");

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println("====================");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("====================");

        for (String nombre : lista) {
            System.out.println(nombre);
        }
    }

}
