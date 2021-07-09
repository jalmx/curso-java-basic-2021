import java.util.Scanner;
import java.lang.Math;

public class Estadistica {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("ESTADISTICA");
        System.out.println("Calculo de la Media y Desviacion Estandar");
        System.out.println("=========================");
        
        System.out.println("Ingresa cuantos valores tienes: ");
        int valorTotal = sc.nextInt();
        
        double valores[] = new double[valorTotal];//instanciando array double con el tamanio de la cantidad de los datos
        
        double suma =0;

        for(int x = 0;x < valores.length; x++){
            System.out.printf("Da el valor %d: ", (x+1));
            valores[x]=sc.nextDouble();//guardo el dato que recibo en el array
            suma += valores[x];//sumo el valor actual de la posicion del array con el valor que tenga suma
        }
        
        double media = suma / valores.length;
        
        double sumaDesviacion = 0;//guardar la sumatoria para la desviacion
        for(int x = 0; x< valores.length; x++){
            sumaDesviacion += Math.pow(valores[x]- media, 2);
        }

        double desviacion = Math.sqrt(sumaDesviacion / valorTotal);

        System.out.printf("El valor de la media es %.2f y con una desviacion estandar de %.2f\n", media, desviacion);
    }
}