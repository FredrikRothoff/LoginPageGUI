import javax.swing.*;

public class LoginFrame extends JFrame {

    Panels loginPanel;
    LoginFrame(){
        loginPanel = new Panels();

        this.setSize(600,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
        this.add(loginPanel);

        this.setVisible(true);
    }
}
