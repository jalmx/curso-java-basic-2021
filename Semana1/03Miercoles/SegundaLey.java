import java.util.Scanner;

public class SegundaLey {
    public static void main(String... a){
        Scanner sc = new Scanner(System.in);//se crea una instancia de Scanner para leer los datos de teclado

        System.out.println("=============================");
        System.out.println("Calculadora de Segunda Ley - Fuerza");
        System.out.println("=============================");
        
        System.out.println("Dar el valor de masa en Kg");
        double masa = sc.nextDouble();
        System.out.println("Dar el valor de aceleracion en m/s^2");
        double aceleracion = sc.nextDouble();

        double fuerza = masa * aceleracion;

        System.out.println("El resultado de la fuerza con masa de " +
                            masa + "Kg y con una aceleracion de " +
                            aceleracion + "m/s^2 es de " + fuerza + " Newtons");
    }
}