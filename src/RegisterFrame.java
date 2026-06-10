import javax.swing.*;
import java.awt.*;
import java.sql.*;

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

        // Register Button Action
        btnRegister.addActionListener(e -> {

            String username = txtUsername.getText();

            String password =
                    String.valueOf(txtPassword.getPassword());

            String confirmPassword =
                    String.valueOf(
                            txtConfirmPassword.getPassword());

            if (username.isEmpty() ||
                    password.isEmpty() ||
                    confirmPassword.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please fill all fields!"
                );

                return;
            }

            if (!password.equals(confirmPassword)) {

                JOptionPane.showMessageDialog(
                        this,
                        "Passwords do not match!"
                );

                return;
            }

            try {

                Connection con =
                        DatabaseConnection.getConnection();

                String sql =
                        "INSERT INTO users(username,password) VALUES(?,?)";

                PreparedStatement ps =
                        con.prepareStatement(sql);

                ps.setString(1, username);
                ps.setString(2, password);

                ps.executeUpdate();

                JOptionPane.showMessageDialog(
                        this,
                        "Registration Successful!"
                );

                dispose();

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Username already exists or database error!"
                );

                ex.printStackTrace();
            }
        });

        // Back Button Action
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