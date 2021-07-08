import java.util.Scanner;

public class TablaDinamica {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//creo una instancia de Scanner, para leer de teclado

        System.out.println("======================");
        System.out.println("TABLA DEl Dinamica");
        System.out.println("======================");
        
        System.out.print("Ingrese el valor de la tabla que quiere conocer: ");
        int tabla = sc.nextInt();//leo y guardo el valor que pasan por teclado
        System.out.print("Ingrese el valor maximo que desea visualizar: ");
        int tope = sc.nextInt();//leo y guardo el valor que pasan por teclado
        
        System.out.println("Generando la tabla del " + tabla);
        
        for(int contador = 1; contador <= tope; contador++){
            int resultado = tabla * contador;//multiplicamos y obtenemos el resultado
            System.out.printf("%d x %d = %d\n", tabla, contador, resultado);
        }
    }
}