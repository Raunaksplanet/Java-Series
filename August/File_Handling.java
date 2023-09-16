import java.io.File; // creating File 
import java.io.FileReader; // Reading File
import java.io.FileWriter; // Writer File
import java.io.IOException; // Maintaining File Exceptions

public class File_Handling{
    public static void main(String args[]) {

        // Making Directory
        try {
            File fl = new File("New File");
            if (!fl.exists()) {
                fl.mkdir();
            }
        }catch (Exception e){
            System.out.print("Error Occured: " + e.toString());
        }
    }
}
