import java.util.Scanner;//hago la importacion de Scanner

public class Aprobado{

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);//creando instancia de Scanner

        System.out.println("Da tu calificacion: ");
        int calificacion = sc.nextInt();

        if(calificacion >= 6){
            System.out.println("Haz aprobado");
        }
        if(calificacion < 6){
            System.out.println("NO haz aprobado");
        }
    }
}