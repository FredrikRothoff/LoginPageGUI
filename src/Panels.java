import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import static javax.swing.JOptionPane.showMessageDialog;

public class Panels extends JPanel implements ActionListener, MouseListener {

    private static JTextField username;
    private static JPasswordField password;
    private static JLabel signInLabel;
    private static JLabel line;
    private static JLabel signInLine;
    private static JLabel signUpLine;
    private static JLabel signUpLabel;
    private static JLabel usernameLabel;
    private static JLabel passwordLabel;
    private static JCheckBox showPassword;
    private static JButton loginButton;
    private static JButton createUserButton;
    private static JLabel firstNameLabel;
    private static JLabel lastNameLabel;
    private static JLabel emailLabel;
    private static JLabel signUpUsernameLabel;
    private static JLabel signUpPasswordLAbel;
    private static JTextField firstName;
    private static JTextField lastName;
    private static JTextField email;
    private static JTextField signUpUsername;
    private static JTextField signUpPassword;
    private static String usernameInput;
    private static String passwordInput;

    private static JButton ticTacToe;
    private static JButton puzzleGame;
    private static JButton snake;
    private static JButton calculator;
    private static JButton logOut;
    private static JButton quit;
    Panels() {
        signInLabel = new JLabel("SIGN IN");
        signInLabel.setBounds(180, 25, 95, 25);
        signInLabel.setForeground(Color.WHITE);
        signInLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signInLabel.addMouseListener(this);
        signInLabel.setFont(new Font("", Font.PLAIN, 24));

        signUpLabel = new JLabel("SIGN UP");
        signUpLabel.setBounds(330, 25, 95, 25);
        signUpLabel.setForeground(Color.WHITE);
        signUpLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signUpLabel.addMouseListener(this);
        signUpLabel.setFont(new Font("", Font.PLAIN, 24));

        line = new JLabel("");
        line.setBounds(300, 25, 2, 25);
        line.setForeground(Color.WHITE);
        line.setOpaque(true);

        signInLine = new JLabel("");
        signInLine.setBounds(184, 53, 80, 2);
        signInLine.setBackground(new Color(250, 60, 80));
        signInLine.setOpaque(true);

        signUpLine = new JLabel("");
        signUpLine.setBounds(333, 53, 80, 2);
        signUpLine.setBackground(new Color(250, 60, 80));

        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(60, 80, 100, 50);
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setFont(new Font("", Font.PLAIN, 20));

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(60, 180, 150, 50);
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setFont(new Font("", Font.PLAIN, 20));

        username = new JTextField();
        username.setBounds(50, 125, 500, 50);
        username.setFont(new Font("Arial", Font.BOLD, 24));
        username.setBackground(new Color(0, 0, 0, 50));

        password = new JPasswordField();
        password.setBounds(50, 225, 500, 50);
        password.setFont(new Font("Arial", Font.BOLD, 24));
        password.setBackground(new Color(0, 0, 0, 50));

        showPassword = new JCheckBox("Show Password");
        showPassword.setFont(new Font("", Font.ITALIC, 13));
        showPassword.setForeground(Color.WHITE);
        showPassword.setBounds(50, 270, 150, 50);
        showPassword.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    password.setEchoChar((char) 0);
                } else {
                    password.setEchoChar('\u25cf');
                }
            }
        });

        loginButton = new JButton("SIGN IN");
        loginButton.setBounds(50, 330, 500, 50);
        loginButton.setFont(new Font("", Font.ITALIC, 24));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(250, 60, 80));
        loginButton.setBorder(null);
        loginButton.setOpaque(true);
        loginButton.addActionListener(this);

        this.setSize(600, 400);
        this.setBackground(new Color(200, 200, 170));
        this.setLayout(null);

        this.add(signInLabel);
        this.add(signUpLabel);
        this.add(line);
        this.add(signInLine);
        this.add(signUpLine);
        this.add(usernameLabel);
        this.add(passwordLabel);
        this.add(username);
        this.add(password);
        this.add(showPassword);
        this.add(loginButton);

        firstNameLabel = new JLabel("Firstname");
        firstNameLabel.setBounds(53, 75, 250, 50);
        firstNameLabel.setForeground(Color.WHITE);
        firstNameLabel.setFont(new Font("", Font.PLAIN, 20));

        firstName = new JTextField();
        firstName.setBounds(48, 115, 250, 50);
        firstName.setFont(new Font("Arial", Font.BOLD, 20));
        firstName.setBackground(new Color(0, 0, 0, 50));

        lastNameLabel = new JLabel("Lastname");
        lastNameLabel.setBounds(307, 75, 250, 50);
        lastNameLabel.setForeground(Color.WHITE);
        lastNameLabel.setFont(new Font("", Font.PLAIN, 20));

        lastName = new JTextField();
        lastName.setBounds(302, 115, 250, 50);
        lastName.setFont(new Font("Arial", Font.BOLD, 20));
        lastName.setBackground(new Color(0, 0, 0, 50));

        emailLabel = new JLabel("Email");
        emailLabel.setBounds(53, 155, 100, 50);
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setFont(new Font("", Font.PLAIN, 20));

        email = new JTextField();
        email.setBounds(48, 195, 504, 50);
        email.setFont(new Font("Arial", Font.BOLD, 20));
        email.setBackground(new Color(0, 0, 0, 50));

        signUpUsernameLabel = new JLabel("Username");
        signUpUsernameLabel.setBounds(50, 235, 135, 50);
        signUpUsernameLabel.setForeground(Color.WHITE);
        signUpUsernameLabel.setFont(new Font("", Font.PLAIN, 20));

        signUpUsername = new JTextField();
        signUpUsername.setBounds(48, 275, 250, 50);
        signUpUsername.setFont(new Font("Arial", Font.BOLD, 20));
        signUpUsername.setBackground(new Color(0, 0, 0, 50));

        signUpPasswordLAbel = new JLabel("Password");
        signUpPasswordLAbel.setBounds(307, 235, 150, 50);
        signUpPasswordLAbel.setForeground(Color.WHITE);
        signUpPasswordLAbel.setFont(new Font("", Font.PLAIN, 20));

        signUpPassword = new JTextField();
        signUpPassword.setBounds(302, 275, 250, 50);
        signUpPassword.setFont(new Font("Arial", Font.BOLD, 20));
        signUpPassword.setBackground(new Color(0, 0, 0, 50));

        createUserButton = new JButton("CREATE USER");
        createUserButton.setBounds(50, 330, 500, 50);
        createUserButton.setFont(new Font("", Font.ITALIC, 24));
        createUserButton.setForeground(Color.WHITE);
        createUserButton.setBackground(new Color(250, 60, 80));
        createUserButton.setBorder(null);
        createUserButton.setOpaque(true);
        createUserButton.addActionListener(this);

        ticTacToe = new JButton("Tic-Tac-Toe");
        ticTacToe.setPreferredSize(new Dimension(200,200));
        ticTacToe.setBounds(50,20,200,150);
        ticTacToe.addActionListener(this);

        puzzleGame = new JButton("15-Puzzle-Game");
        puzzleGame.setPreferredSize(new Dimension(200,200));
        puzzleGame.setBounds(350,20,200,150);
        puzzleGame.addActionListener(this);

        snake = new JButton("Snake");
        snake.setPreferredSize(new Dimension(200,200));
        snake.setBounds(50,190,200,150);
        snake.addActionListener(this);

        calculator = new JButton("Calulator");
        calculator.setPreferredSize(new Dimension(200,200));
        calculator.setBounds(350,190,200,150);
        calculator.addActionListener(this);

        logOut = new JButton("Log out");
        logOut.setPreferredSize(new Dimension(75,50));
        logOut.setBounds(190,350,100,50);
        logOut.addActionListener(this);

        quit = new JButton("Quit");
        quit.setPreferredSize(new Dimension(75,50));
        quit.setBounds(310,350,100,50);
        quit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CheckValidUser checkValidUser = new CheckValidUser();
        usernameInput = username.getText();
        passwordInput = String.valueOf(password.getPassword());
            if (e.getSource() == loginButton && checkValidUser.CheckValidUser(usernameInput, passwordInput)) {
                this.remove(signInLabel);
                this.remove(signUpLabel);
                this.remove(line);
                this.remove(signInLine);
                this.remove(signUpLine);
                this.remove(usernameLabel);
                this.remove(passwordLabel);
                this.remove(username);
                this.remove(password);
                this.remove(showPassword);
                this.remove(loginButton);
                this.repaint();
                this.add(ticTacToe);
                this.add(puzzleGame);
                this.add(snake);
                this.add(calculator);
                this.add(logOut);
                this.add(quit);
                this.repaint();
            } else if (e.getSource() == loginButton && usernameInput.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a username",
                        "Missing username", JOptionPane.INFORMATION_MESSAGE);
            } else if (e.getSource() == loginButton && passwordInput.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a password",
                        "Missing password", JOptionPane.INFORMATION_MESSAGE);
            }  else if (e.getSource() == createUserButton ) {
                CreateUserInformationToFile createUserButton
                        = new CreateUserInformationToFile(firstName.getText(),lastName.getText(),email.getText(),
                        signUpUsername.getText(),signUpPassword.getText());
                JOptionPane.showMessageDialog(null,"User created",
                        "User created", JOptionPane.INFORMATION_MESSAGE);
                firstName.setText("");
                lastName.setText("");
                email.setText("");
                signUpUsername.setText("");
                signUpPassword.setText("");

            } else if (checkValidUser.CheckValidUser(usernameInput, passwordInput) == false){
                    showMessageDialog(null, "Wrong password or Username",
                            "Wrong user details", JOptionPane.WARNING_MESSAGE);
            }else if (e.getSource() == ticTacToe){
                File file = new File("/Users/fredrik/Desktop/TicTacToe.jar");
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            } else if (e.getSource() == puzzleGame){
                File file = new File("/Users/fredrik/Desktop/PuzzleGame.jar");
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            } else if (e.getSource() == snake){
                File file = new File("/Users/fredrik/Desktop/Snake.jar");
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } 
            }else if (e.getSource() == calculator){
                File file = new File("/Users/fredrik/Desktop/Calculator.jar");
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            } else if (e.getSource() == logOut){
                this.remove(ticTacToe);
                this.remove(puzzleGame);
                this.remove(snake);
                this.remove(calculator);
                this.remove(logOut);
                this.remove(quit);

                this.add(signInLabel);
                this.add(signUpLabel);
                this.add(line);
                this.add(signInLine);
                this.add(signUpLine);
                this.add(usernameLabel);
                this.add(passwordLabel);
                this.add(username);
                this.add(password);
                this.add(showPassword);
                this.add(loginButton);
                username.setText("");
                password.setText("");

                this.repaint();

            }else if (e.getSource() == quit){
                System.exit(0);
            }
        }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == signUpLabel){
            this.remove(usernameLabel);
            this.remove(passwordLabel);
            this.remove(username);
            this.remove(password);
            this.remove(showPassword);
            this.remove(loginButton);
            this.remove(signInLine);
            signUpLine.setOpaque(false);
            signUpLine.setOpaque(true);

            this.add(firstNameLabel);
            this.add(firstName);
            this.add(lastNameLabel);
            this.add(lastName);
            this.add(emailLabel);
            this.add(email);
            this.add(signUpUsernameLabel);
            this.add(signUpUsername);
            this.add(signUpPasswordLAbel);
            this.add(signUpPassword);
            this.add(createUserButton);
            this.revalidate();
            this.repaint();
        } else if (e.getSource() == signInLabel){
            this.remove(firstNameLabel);
            this.remove(firstName);
            this.remove(lastNameLabel);
            this.remove(lastName);
            this.remove(emailLabel);
            this.remove(email);
            this.remove(signUpUsernameLabel);
            this.remove(signUpUsername);
            this.remove(signUpPasswordLAbel);
            this.remove(signUpPassword);
            this.remove(createUserButton);

            this.add(signInLabel);
            this.add(signUpLabel);
            this.add(line);
            this.add(signInLine);
            this.add(usernameLabel);
            this.add(passwordLabel);
            this.add(username);
            this.add(password);
            this.add(showPassword);
            this.add(loginButton);
            signUpLine.setOpaque(false);
            signInLine.setOpaque(true);
            this.repaint();
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == signInLabel){
            signInLine.setOpaque(true);
            signUpLine.setOpaque(false);
            this.repaint();
        } else if(e.getSource() == signUpLabel){
            signUpLine.setOpaque(true);
            signInLine.setOpaque(false);
            this.repaint();
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == signInLabel){
            signInLine.setOpaque(false);
            this.repaint();

            signUpLine.setOpaque(true);
        }else if(e.getSource() == signUpLabel){
            signUpLine.setOpaque(false);
            this.repaint();
            signInLine.setOpaque(true);
        }
    }
}
