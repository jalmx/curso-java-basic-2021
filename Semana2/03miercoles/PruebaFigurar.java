public class PruebaFigurar {
    
    public static void main(String[] args) {
        
        double radio = 5;

        double area = Figuras.areaCirculoRadio(radio, Figuras.PI);
        
        System.out.println("El area del circulo es de " + area + " con un radio de " + radio);
    }
}
