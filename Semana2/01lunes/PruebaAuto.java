public class PruebaAuto {
    public static void main(String[] args) {
        
        Auto.arrancar();
        Auto.acelerar();
        Auto.parar();

        System.out.println("El auto tiene " + Auto.llantas + " llantas");
        
        Auto.llantas = 3;//mala practica
        
        System.out.println("El auto tiene " + Auto.llantas + " llantas");

        Auto.acelerar(5.5);

        Auto.asignarVelocidad(10);//generar un metodo de asignacion
        Auto.acelerar();
    }
}
