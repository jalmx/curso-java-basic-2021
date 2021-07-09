import java.util.Scanner;

public class Infinito {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//el obejto que nos ayuda a leer datos de teclado
        double suma = 0;

        System.out.println("======================");
        System.out.println("Calculo de Media");
        System.out.println("======================");
        
        int contador = 1;
        
        for( ; ; ){// for infinito
            System.out.printf("Dar el valor %d: ", contador );
            double valor = sc.nextDouble();
            if(valor == -1) break;

            suma += valor;
            contador++;
        }

        double media =suma / (contador-1);

        System.out.println("La media es: " + media);
    }
}