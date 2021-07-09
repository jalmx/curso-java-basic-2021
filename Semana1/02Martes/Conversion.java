public class Conversion {
    public static void main(String... ar){

        double inch = 1;
        double cm = 2.54;

        double cmToInch = 2.54;
        double inchToCm = 1;

        double convertToInch = (cmToInch * inch) / cm;
        double convertToCm = (inchToCm * cm) / inch;

        System.out.println(inchToCm + " pulgadas, dan en cm " + convertToCm);
        System.out.println(cmToInch + " cm, dan en pulgadas " + convertToInch);

    }
}