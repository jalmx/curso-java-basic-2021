import java.util.Scanner;

public class Sepso {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Que sexo eres?");
        System.out.print("1)Hombre\n2)Mujer\n");
        int opcion = sc.nextInt();
        
        if(opcion == 1)
            System.out.println("Eres un Macho-Alfa lomo plateado");
        if(opcion == 2)
            System.out.println("Eres una linda y delicada seniorita");
        else
            System.out.println("No definido");
    }
}