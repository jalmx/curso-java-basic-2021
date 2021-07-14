import java.util.Scanner;

import javax.swing.JOptionPane;

public class Error {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Da el dividendo");
            double d1 = sc.nextDouble();

            System.out.println("El numero recibido es " + d1);

        } catch (Exception e) {
            System.out.println("No se adminten otros valores que no sean numeros");
            JOptionPane.showMessageDialog(null, "Solo se reciben numeros");
        }

    }
}
