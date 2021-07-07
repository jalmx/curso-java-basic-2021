import java.util.Scanner;

public class Leyendo {
    
    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);//creamos una instancia de Scanner

        System.out.println("Da tu edad: ");
        int edad = leer.nextInt();//leyendo el dato que ingresa el usuario
        
        System.out.println("Wow tu edad es de " + edad);
    }
}