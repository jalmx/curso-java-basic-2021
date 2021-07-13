import java.util.Scanner;

public class PruebaLeyOhm {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Print.ln("===========================");
        Print.ln("Calculadora de Ley de Ohm");
        Print.ln("===========================");

        Print.ln("Elige una opcion");
        Print.ln("Que deseas calcular");
        Print.ln("1)Voltaje");
        Print.ln("2)Corriente");
        Print.ln("3)Resistencia");
        int opcion = sc.nextInt();

        double resultado = 0;
        String unidad = "";
        switch(opcion){
            case 1:
                Print.ln("Dar el valor de la corriente (A): ");
                double corriente = sc.nextDouble();
                Print.ln("Dar el valor de la resistencia (Ohms): ");
                double resistencia = sc.nextDouble();
                resultado = LeyOhm.voltage(corriente, resistencia);
                unidad = "volts";
                break;
            case 2:
            break;
            case 3:
            break;
            default:
                Print.ln("Esa opcion no existe");
        }

        if(opcion >= 1 && opcion <= 3)
            Print.f("El resultado es %.2f %s\n",resultado, unidad);
    }
}
