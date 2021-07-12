import java.util.Random;
import java.util.Scanner;

public class Adivina2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int intentos = 0;
        int numeroAdivinar = random.nextInt(11);

        System.out.println("Adivina el numero!!! \\o/");

        while (true) {
            System.out.print("Ingresa el numero: ");
            int numero = sc.nextInt();

            if (numero == numeroAdivinar) {
                System.out.println("Felicidades, le atinaste!!!!!");
                break;
            } else if (numero > numeroAdivinar) {
                System.out.println("Es MENOR");
                intentos++;
            } else if (numero < numeroAdivinar) {
                System.out.println("Es MAYOR");
                intentos++;
            }

            if(intentos == 3){
                System.out.println("Lastima margarito, el valor era " + numeroAdivinar);
                break;
            }
        }//termina el while
    }//termina metodo main
}//termina la clase
