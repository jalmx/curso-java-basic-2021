public class Comparacion {
    public static void main(String[] args) {
        
        int i = 5;

        //primero pregunto y en caso que cumpla, entro
        while(i < 0){
            System.out.println("Entro al while");
        }

        //primero entro, ejecuto y al final pregunto
        do{
            System.out.println("Entro al DO - while");
        }while(i < 0);
    }
}
