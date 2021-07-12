public class Auto {//inicia mi clase

    private Auto(){}

    public static int llantas = 4;//campo = atributo
    public static double velocidad = 1;

    public static void acelerar(){ //metodo o comportamiento
        System.out.printf("Acelerando %.2f km/h!!!\n", Auto.velocidad);
    }

    public static void asignarVelocidad(double velocidad){
        Auto.velocidad = velocidad;
    }

    public static void acelerar(double velocidad){ //metodo o comportamiento
        System.out.printf("Acelerando %.2f km/h\n",velocidad);
    }

    public static void arrancar(){
        System.out.println("Arrancando!!!");
    }
    
    public static void parar(){
        System.out.println("Deteniendo!!!!");
    }

}//termina mi clase Auto
