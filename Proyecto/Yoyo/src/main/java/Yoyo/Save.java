package Yoyo;

import java.io.File;
import java.io.FileWriter;

public class Save {

    private static File file;
    public static String path = "";
    
    
    private Save() {
    }//candado

    /**
     * Create a File type cvs with the @param
     * @param nameFile name for file csv
     */
    public static void createFile(String nameFile) {
        if (file == null) {
            file = new File(nameFile + ".csv");
        }
    }

    public static boolean write(String content) {
        
        createFile("data");
        
        try{
            
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
            path = file.getAbsolutePath();
            return true;
            
        }catch(Exception e){
            return false;
        }//termina el catch
               
    }//termina el metodo

}
