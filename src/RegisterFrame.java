import javax.swing.*;
import java.awt.*;

public class RegisterFrame extends JFrame {

    JLabel lblUsername, lblPassword, lblConfirmPassword;
    JTextField txtUsername;
    JPasswordField txtPassword, txtConfirmPassword;
    JButton btnRegister, btnBack;

    public RegisterFrame() {

        setTitle("Register");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4, 2, 10, 10));

        lblUsername = new JLabel("Username:");
        lblPassword = new JLabel("Password:");
        lblConfirmPassword = new JLabel("Confirm Password:");

        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        txtConfirmPassword = new JPasswordField();

        btnRegister = new JButton("Register");
        btnBack = new JButton("Back");

        btnBack.addActionListener(e -> {
            dispose();
        });

        add(lblUsername);
        add(txtUsername);

        add(lblPassword);
        add(txtPassword);

        add(lblConfirmPassword);
        add(txtConfirmPassword);

        add(btnRegister);
        add(btnBack);

        setVisible(true);
    }
}