import java.lang.Math;

public class Matematicas {
    public static void main(String[] args){
        int numero = 25;

        double resultado = Math.sqrt(numero);

        System.out.printf("La raiz cuadrada de %d es %.2f\n",numero, resultado);
        
        int numero2 = 4;
        
        double potencia = Math.pow(numero2, 2);
        
        System.out.printf("%d elevado al cuadrado es %.2f\n",numero2, potencia);

        System.out.println(Math.sqrt( Math.abs(-5)));
    }
}