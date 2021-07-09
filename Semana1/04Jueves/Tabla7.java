public class Tabla7 {
    public static void main(String[] args){
        System.out.println("TABLA DEl 7");

        int tabla = 7;// declaro una variable la tabla
        
        for(int contador = 1; contador <= 10; contador++){
            int resultado = tabla * contador;
            System.out.printf("%d x %d = %d\n", tabla, contador, resultado);
        }
    }
}