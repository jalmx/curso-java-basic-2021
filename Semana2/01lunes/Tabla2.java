import java.util.Scanner;

public class Tabla2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el valor de la tabla que deseas conocer");
        int tabla = sc.nextInt();

        int contador = 1;

        do{
            int resultado = tabla * contador;
            System.out.println("El resultado es " + resultado);
            contador++;
        }while(contador <=10);
        
        sc.close();//es cerrar a scanner
    }

}
