public class Romper {
    public static void main(String[] args){
        //Yo necesito que el ciclo termine antes

        // break
        for(int i =0; i < 10; i++){
            System.out.println(i);
            
            if(i == 5){
                System.out.println("Rompiendo el ciclo");
                break;
            }
        }
        System.out.println("Continua el programa");
    }
}