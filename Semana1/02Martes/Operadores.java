public class Operadores {

    public static void println(String txt){
        System.out.print(txt);
    }

    public static void main(String[] patito){

        int suma = 6 + 9;
        int resta = 6 - 9;
        int mult = 6 * 9;
        double div = 6.0 / 9.0;//
        int residuo = 6 % 9;

        println("suma " + suma + "\n"); // esto es un comentario
        println("resta " + resta + "\n"); // esto es un comentario
        println("multi: " + mult + "\n"); // esto es un comentario
        println("div " + div + "\n"); // esto es un comentario
        println("resd " + residuo + "\n"); // esto es un comentario
    }
}