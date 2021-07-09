import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//el obejto que nos ayuda a leer datos de teclado
        double suma = 0;

        System.out.println("======================");
        System.out.println("Calculo de Media");
        System.out.println("======================");
        
        System.out.println("Cuantos valores tienes? ");
        int valores = sc.nextInt();
                
        for(int i = 0; i < valores; i++){
            System.out.printf("Dar el valor %d: ", (i+1) );
            double valor = sc.nextDouble();
            suma += valor;
        }

       // double media = suma / valores;

       // System.out.println("La media es: " + media);
    }
}