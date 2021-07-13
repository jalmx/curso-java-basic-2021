public class Saludo {
    
    private Saludo(){} //candado

    public static void saludar(){
        System.out.println("Hola a todos!!!");
    }

    public static void saludar(String nombre){
        String saludo = String.format("Hola %s, es un gusto", nombre);
        System.out.println(saludo);
    }
    
    public static void saludar(String nombre, String color){
        String saludo = String.format("Hola %s, a mi tambien me gusta el color %s", nombre, color);
        System.out.println(saludo);
    }

    /**
     * Este metodo calcula la edad, recibe
     * @param anioNacimiento anio en que naciste
     * @param anioActual el anio actual
     * @return int un entero con el valor de la edad
     */
    public static int calcularEdad(int anioNacimiento, int anioActual){
        int edad = anioActual - anioNacimiento;
        return edad;
    }

    public static void despedida(){
        System.out.println("Nos vemos la proxima!!! :D");
    }
}
