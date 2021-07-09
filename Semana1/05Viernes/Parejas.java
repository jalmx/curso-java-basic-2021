import java.util.Random;

public class Parejas {
    public static void main(String[] args) {
        String datos[][] = {
            {"Priscila", "Brenda", "Kim"},
            {"rojo", "verde", "amarillo", "azul","rosa","morado","blanco","negro"}
            };

        for(int i =0; i < datos[0].length; i++){
            String nombre = datos[0][i];
            String color = datos[1][new Random().nextInt(datos[1].length)];
            System.out.printf("%s tiene el color  %s\n",nombre, color);
        }

    }//main
    
}
