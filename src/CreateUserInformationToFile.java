import java.io.FileWriter;
import java.io.IOException;

public class CreateUserInformationToFile {

    CreateUserInformationToFile(String firstName, String lastName, String email, String userName, String password){
    try {
        FileWriter myWriter = new FileWriter("UserInformation.txt",true);
        myWriter.write("Firstname: " + firstName + "\nLastname: " + lastName +
        "\nEmail: " + email + "\nUsername: " + userName + "\nPassword: " + password + "\n\n");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    }
}
