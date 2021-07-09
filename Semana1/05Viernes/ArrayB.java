import java.util.Arrays;

public class ArrayB {
    public static void main(String[] args) {
        // [0,0]
        // [0,0]
        int multi1[][] = new int[2][2];
        // col0 col1
        // [ 2 , 5 ] fila 0
        // [ 1 , 9 ] fila 1

        multi1[0][0] = 2;
        multi1[0][1] = 5;

        multi1[1][0] = 1;
        multi1[1][1] = 9;

        System.out.println(Arrays.toString(multi1[0]));
        System.out.println(Arrays.toString(multi1[1]));

        System.out.println("======================");

        // System.out.println(multi1.length);

        for (int i = 0; i < multi1.length; i++) {
            for (int j = 0; j < multi1[i].length; j++) {
                System.out.printf(
                    "fila %d en la posicion %d y tiene el valor %d\n",
                    i,
                    j,
                    multi1[i][j]
                    );
            }//termina el for de j
        }//termina el for de i

    }
}