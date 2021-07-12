
public class Tabla {
    public static void main(String[] args) {
        int tabla = 9;

        int count= 1;

        while(count <=10){//inicia while
            int resultado = tabla * count;
            System.out.println(tabla + " x " + count + " = " + resultado);
            count++;
        }//termina el ciclo while

        System.out.println("====================================");
        count = 1;//reset al contador

        do{
            int resultado = tabla * count;
            System.out.println(tabla + " x " + count + " = " + resultado);
            count++;
        }while(count <= 10);
    }
}
