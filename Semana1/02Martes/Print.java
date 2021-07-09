public class Print {
    public static void main(String[] a){
        String mensaje = "Hola";
        System.out.print(mensaje+ "\n");
        System.out.print(mensaje+ "\n\n\n\n");
        System.out.println(mensaje);
        
        int edad = 25;
        double altura = 1.8182323;
        String nombre = "Alejandro";

        // Mi nombre es Aleja... tengo 25 y mido 1.81cm
        System.out.printf("Mi nombre es %s tengo %d años y mido %.2f\n", nombre, edad, altura);
        
    }
}