import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFileIntoArrayList {
        ArrayList<String> list = null;

        ArrayList<String> ReadFileIntoArrayList (){
        try {
            File myObj = new File("UserInformation.txt");
            Scanner myReader = new Scanner(myObj);
            list = new ArrayList<String>();
            while (myReader.hasNextLine()) {
                list.add(myReader.nextLine());
                // System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return list;
    }
}
