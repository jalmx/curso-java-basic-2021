public class PruebaSaludo {
    public static void main(String[] args) {
        
        Saludo.saludar();
        Saludo.despedida();

        Saludo.saludar("Panchito");
        Saludo.saludar("Priscila", "verde");

        int edad = Saludo.calcularEdad(1989, 2021);
        System.out.println(edad);
        System.out.println(Saludo.calcularEdad(2000, 2021));
    }
}
