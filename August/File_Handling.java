import java.io.File; // creating File 
import java.io.FileReader; // Reading File
import java.io.FileWriter; // Writer File
import java.io.IOException; // Maintaining File Exceptions/Errors

public class File_Handling{
    public static void main(String args[]) {

        // Creating File & Directory
        File fl = new File("File.txt");
        File fl2 = new File("Folder");

        try{
            fl.createNewFile();
            fl2.mkdir();
        }
        catch(Exception e){
            e.toString();
        }

        // Checking if File exist or not
        try {
            if (fl.exists() && fl2.exists()) {
                System.out.println("Already Exist");
            } else {
                fl.createNewFile();
                fl2.mkdir();
            }
        } catch (Exception e) {
            e.toString();

        }

        //Creating Multiple Files & Folders using loop
        int n = 5;
        for (int i = 1; i <= n; i++) {
            try {
                File fl = new File("file" + i + ".txt");
                fl.createNewFile();

                File fl2 = new File("Folder" + i);
                fl2.mkdir();
            } catch (Exception e) {
                e.toString();
            }
        }
        
    }
}
