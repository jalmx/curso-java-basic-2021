
public class Figuras {
    
    public static final double PI = 3.14159;

    public static double areaCirculoRadio(double radio){
        return PI * radio * radio;
    }

    public static double areaCirculoRadio(double radio, double pi){
        return pi * radio * radio;
    }

    public static double perimetroCirculo(double radio){
        return 2 * PI * radio;
    }

    //area y perimetro cuadrado y rectangulo, sobre agregar otro metodo para el area del circulo con el diametro
}
