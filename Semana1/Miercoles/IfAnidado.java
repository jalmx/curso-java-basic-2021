public class IfAnidado {
    public static void main(String[] args){
        // Dar tres numeros e indicar cual es el mayor

        int a = 10;
        int b = 8;
        int c = 7;

        if (a > b){
            if (a > c){
                System.out.println(a + " es mayor que " + c);
            }else{
                System.out.println(c + " es mayor que " + a);
            }
        }else{
            if (b > c){
                System.out.println(b + " es mayor que " + c);
            }else{
                System.out.println(c + " es mayor que " + b);
            }
        }
    }
}