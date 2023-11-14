import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Autentificare extends JFrame {
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, exitButton;

    public Autentificare() {
        super("DentalPlanner - Autentificare");
        setLayout(new GridLayout(4, 2));

        usernameLabel = new JLabel("Nume utilizator: ");
        add(usernameLabel);
        usernameField = new JTextField(20);
        add(usernameField);

        passwordLabel = new JLabel("Parola: ");
        add(passwordLabel);
        passwordField = new JPasswordField(20);
        add(passwordField);

        loginButton = new JButton("Logare");
        loginButton.addActionListener(new LoginListener());
        add(loginButton);

        exitButton = new JButton("Iesire");
        exitButton.addActionListener(new ExitListener());
        add(exitButton);

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Verificare utilizator si parola
            if (username.equals("tesla") && password.equals("modelx")) {
                dispose();
                MeniuPrincipal menu = new MeniuPrincipal();
            } else {
                JOptionPane.showMessageDialog(null, "Nume utilizator sau parola incorecte!");
            }
        }
    }

    private class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }
}
