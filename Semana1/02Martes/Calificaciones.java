public class Calificaciones {
    
    public static void main(String[] arg){

        int calificacion = 8;

        if (calificacion < 6 && calificacion >=0 ){
            System.out.println("Lastima margarito");
        }
        if (calificacion >= 6 && calificacion <7 ){
            System.out.println("De panzazo");
        }
        if (calificacion >= 7 && calificacion < 8 ){
            System.out.println("Echale mas punch");
        }
        if (calificacion >= 8 && calificacion <9 ){
            System.out.println("Bien, puedes mejorar");
        }
        if (calificacion >= 9 && calificacion < 10 ){
            System.out.println("Muy bien, te falto tantito");
        }
        if (calificacion == 10 ){
            System.out.println("Excelente, con toda la actitud");
        }
        if (calificacion < 0 || calificacion > 10){
            System.out.println("No es posible :O");
        }
        System.out.println("La calificacion es " + calificacion);
        
    }
}