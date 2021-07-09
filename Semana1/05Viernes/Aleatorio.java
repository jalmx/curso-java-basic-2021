import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        
        Random random = new Random();

        for(int i = 0; i < 100; i++){
            System.out.println( random.nextInt(11) );
            
            System.out.println("segundo: " +new Random().nextInt(50) );
        }
    }
}
