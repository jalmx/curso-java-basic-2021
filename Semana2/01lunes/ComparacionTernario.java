public class ComparacionTernario {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        int c = 20;

        if (a > b) {
            if (a > c) {
                System.out.println(a + " es mayor que " + c);
            } else {
                System.out.println(c + " es mayor que " + a);
            }
        } else {
            if (b > c) {
                System.out.println(b + " es mayor que " + c);
            } else {
                System.out.println(c + " es mayor que " + b);
            }
        }

        // String mensaje1 = (a > c)? a + " es mayor que " + c :c + " es mayor que " + a;
        // String mensaje2 = (b > c)? b + " es mayor que " + c : c + " es mayor que " + b;

        //String mensajeFinal = (a > b) : mensaje1 : mensaje2;

        String mensajeFinal = (a > b) ? (a > c)? a + " es mayor que " + c :c + " es mayor que " + a : (b > c)? b + " es mayor que " + c : c + " es mayor que " + b;

        System.out.println(mensajeFinal);
    }
}
