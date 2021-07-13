public class Print {
    
    private Print(){}

    public static void ln(String message){
        System.out.println(message);
    }

    public static void f(String message, Object... args){
        System.out.printf(message, args);
    }

}
