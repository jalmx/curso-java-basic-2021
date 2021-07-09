import java.util.Scanner;

public class Calculadora {
    public static void main(String[] arfs){
        Scanner sc = new Scanner(System.in);//creamos una instancia de Scanner

        System.out.println("=======================================");
        System.out.println("1)Suma\n2)Resta\n3)Multiplicacion\n4)Division");
        System.out.println("=======================================");
        int opcion = sc.nextInt();

        System.out.println("Dar el primer valor");
        double valor1 = sc.nextDouble();
        System.out.println("Dar el segundo valor");
        double valor2 = sc.nextDouble();

        double resultado;

        switch(opcion){
            case 1:
                resultado = valor1 + valor2;
                break;
            case 2:
                resultado = valor1 - valor2;
                break;
            case 3:
                resultado = valor1 * valor2;
                break;
            case 4:
                resultado = valor1 / valor2;
                break;
            default:
                System.out.println("La opcion no existe");
                resultado = 0;
        }
        System.out.println("El resultado es " + resultado);
    }
}