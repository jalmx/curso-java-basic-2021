public class Continuar {
    public static void main(String[] args){
        //Yo necesito que brinque lo que sigue

        // continue
        for(int i =0; i < 10; i++){
            System.out.println(i);
            
            if(i == 6 || i == 8){
                System.out.println("Brincando el ciclo");
                continue;
            }
            if(i == 9){
                break;
            }
            System.out.println("Ejecucion de mas codigo");
        }
        System.out.println("Continua el programa");
    }
}