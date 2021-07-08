import java.util.Scanner;

public class IgnorarPar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("IGNORA LOS PARES");

        for(int i = 0; i < 8; i++){//inicia el for
            System.out.println("Dar un valor " + (i+1));
            int valor = sc.nextInt();
            
            if(valor % 2 == 0) continue;

            System.out.println("Diste el valor " + valor);
        }//termina el for
    }//termian metodo main
}