import java.util.Scanner;

public class Bot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola, me llamo JavaBot");
        System.out.println("Cual es tu nombre?");
        String name = sc.next();// leo el nombre del usuario
        System.out.printf("Orale!!! que bonito nombre tienes, yo tambien me llamo %s\n", name);
        
        System.out.println("Cuantos anios tienes?");
        int edad = sc.nextInt();// leo la edad del usuario
        System.out.printf("Yo tengo %d\n", (edad+2));
        
        System.out.println("Cual es tu hobby?");
        String hobby = sc.next();
        System.out.println("A mi tambien me gusta mucho " + hobby);
        
        System.out.println("Te gustaria ser mi amigo?\n(1-si)\n(2-no)");
        int respuesta = sc.nextInt();
        
        if(respuesta == 1){
            System.out.println("Seremos los mejores amigos!!!! \\o/");
        }
        if(respuesta == 2){
            System.out.println("Sere tu peor pesadilla!!! >:)");
        }
    }
}