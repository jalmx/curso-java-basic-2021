public class Casting {
    public static void main(String[] args) {
        //casting automatico
        int a = 5; // -->int --> float
        float b = 6;
        double c = 9.0;

        short g = 3;
        long f = 6;

        System.out.println(a + c);
        System.out.println(g + f);
        
        System.out.println("=======================");

        //casting manual

        a = 3;
        b = 5.5f;

        int y = a + (int) b;

        System.out.println(y);

        int r = 4;
        int o  = 3;

        double resultado = (double) r / (double) o;

        System.out.println(resultado);

    }
}