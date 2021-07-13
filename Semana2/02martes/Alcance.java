public class Alcance {
    
    public static int i = 0;//campo, es una propiedad
    public int h = 5;//variables globales

    public static void metodo1(){
        int i = 0;
        Print.ln(i);
    }
    
    public static void metodo2(){
        int i = 10;
        Print.ln(i);
    }
    public static void main(String[] args) {
        
        int a = 10;
        double i = 10;//nace
        Print.ln(i);

        for(i = 0; i < 10; i++){
            Print.ln(i);

            for(int j = 0; j < 5; j++){//el for 2
                Print.ln(j);
                double o = 5;
                // puedo usar la variable b???si
                for(int k = 0; k < 5; k++){//el for 3
                    Print.ln(k);
                    // puedo usar la variable b???si
                }
                double k = 2;
                Print.ln(k);
            }

        }//termina el for 1
        
        double p = 20.0;
        Print.ln(p);

        Print.ln(Alcance.i);

    }//termina metodo main

}
