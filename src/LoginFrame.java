import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {

        setTitle("Secure Password Manager");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(30, 30, 30));
        panel.setLayout(null);

        JLabel title = new JLabel("SECURE PASSWORD MANAGER");
        title.setBounds(80, 30, 350, 40);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(Color.WHITE);

        JLabel lblUser = new JLabel("Username");
        lblUser.setBounds(80, 100, 100, 25);
        lblUser.setForeground(Color.WHITE);

        JTextField txtUser = new JTextField();
        txtUser.setBounds(80, 130, 300, 35);

        JLabel lblPass = new JLabel("Password");
        lblPass.setBounds(80, 180, 100, 25);
        lblPass.setForeground(Color.WHITE);

        JPasswordField txtPass = new JPasswordField();
        txtPass.setBounds(80, 210, 300, 35);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(80, 280, 130, 40);

        JButton btnRegister = new JButton("Register");
        btnRegister.setBounds(250, 280, 130, 40);

        btnRegister.addActionListener(e -> {
            new RegisterFrame();
        });

        panel.add(title);
        panel.add(lblUser);
        panel.add(txtUser);
        panel.add(lblPass);
        panel.add(txtPass);
        panel.add(btnLogin);
        panel.add(btnRegister);

        add(panel);
        setVisible(true);
    }
}