import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {

    JLabel lblTitle, lblUsername, lblPassword;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JButton btnLogin, btnRegister;

    public LoginFrame() {

        setTitle("Secure Password Manager");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5, 2, 10, 10));

        lblTitle = new JLabel("PASSWORD MANAGER");
        lblUsername = new JLabel("Username:");
        lblPassword = new JLabel("Password:");

        txtUsername = new JTextField();
        txtPassword = new JPasswordField();

        btnLogin = new JButton("Login");
        btnRegister = new JButton("Register");

        btnRegister.addActionListener(e -> {
            new RegisterFrame();
        });

        add(lblTitle);
        add(new JLabel(""));

        add(lblUsername);
        add(txtUsername);

        add(lblPassword);
        add(txtPassword);

        add(btnLogin);
        add(btnRegister);

        setVisible(true);
    }
}