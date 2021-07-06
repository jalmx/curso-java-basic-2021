public class Fuerza {
    public static void main(String... a){
        double aceleracion1 = 10;
        double aceleracion2 = 12.6;
        double masa = 2.5;

        double fuerza1 = masa * aceleracion1;
        double fuerza2 = masa * aceleracion2;

        System.out.println("El resultado de la fuerza con masa de " + masa + " y con una aceleracion de " + aceleracion1 + " es de " + fuerza1);
        
        System.out.println("El resultado de la fuerza con masa de " + masa + " y con una aceleracion de " + aceleracion2 + " es de " + fuerza2);
    }
}