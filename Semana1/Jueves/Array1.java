public class Array1 {
    public static void main(String[] args){

        int numeros[] = new int[4]; //defino un array vacio de 4 espacios

        double dobles[] = {4.5, 5.6, 8.6,8.6,2.1,2.5};//defino un array con 5 elementos

        //ingresar valores al array
        numeros[0] = 10;
        numeros[1] = 6;
        numeros[2] = 5;
        numeros[3] = 50;

        int valor1 = numeros[1];

        System.out.println("Posicion 1: "+valor1);
        System.out.println("Posicion 4: "+ numeros[3]);
        
        System.out.println("=====================");
        
        System.out.println("El largo es: " + dobles.length);

        for(int i = 0; i < dobles.length; i++){
            System.out.println("Posicion "+ i + " tiene el valor de " + dobles[i]);
        }
    }
}