import java.util.ArrayList;

public class UsernameAndPasswordList {

    ArrayList<String> UsernameAndPasswordList(){

        ArrayList<String> UsernamePasswords = new ArrayList<String>();
        
        ReadFileIntoArrayList fileList = new ReadFileIntoArrayList();

        for (int i = 0; i < fileList.ReadFileIntoArrayList().size(); i++) {
            if (fileList.ReadFileIntoArrayList().get(i).contains("Username: ") &&
                    fileList.ReadFileIntoArrayList().get(i + 1).contains("Password: ")) {
                UsernamePasswords.add(fileList.ReadFileIntoArrayList().get(i));
                UsernamePasswords.add(fileList.ReadFileIntoArrayList().get(i + 1));
            }
        }
        return UsernamePasswords;
    }
}
