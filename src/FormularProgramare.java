import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularProgramare extends JFrame {
    private JLabel numeLabel, prenumeLabel, dataLabel, oraLabel, medicLabel;
    private JTextField numeField, prenumeField, dataField, oraField;
    private JComboBox<String> medicCombo;
    private JButton saveButton, backButton;

    public FormularProgramare() {
        setTitle("DentalPlanner - Programare");
        setResizable(false);

        JPanel mainPanel = new JPanel(new GridLayout(6, 2));

        numeLabel = new JLabel("Nume: ");
        mainPanel.add(numeLabel);
        numeField = new JTextField(20);
        mainPanel.add(numeField);

        prenumeLabel = new JLabel("Prenume: ");
        mainPanel.add(prenumeLabel);
        prenumeField = new JTextField(20);
        mainPanel.add(prenumeField);

        dataLabel = new JLabel("Data: ");
        mainPanel.add(dataLabel);
        dataField = new JTextField(20);
        mainPanel.add(dataField);

        oraLabel = new JLabel("Ora: ");
        mainPanel.add(oraLabel);
        oraField = new JTextField(20);
        mainPanel.add(oraField);

        medicLabel = new JLabel("Medic: ");
        mainPanel.add(medicLabel);
        medicCombo = new JComboBox<String>(new String[]{"Dr. Popescu", "Dr. Ionescu", "Dr. Georgescu", "Dr. Vasilescu"});
        mainPanel.add(medicCombo);

        saveButton = new JButton("Salveaza");
        saveButton.addActionListener(new SaveListener());
        mainPanel.add(saveButton);

        backButton = new JButton("Inapoi");
        backButton.addActionListener(new BackListener());
        mainPanel.add(backButton);

        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class SaveListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // Salvare programare
            String nume = numeField.getText();
            String prenume = prenumeField.getText();
            String data = dataField.getText();
            String ora = oraField.getText();
            String medic = (String) medicCombo.getSelectedItem();
            ManagerFisiere.adaugaProgramare(nume, prenume, data, ora, medic);
            JOptionPane.showMessageDialog(null, "Programarea a fost salvata cu succes!");

            // Redirectionare catre MeniuPrincipal
            dispose();
            MeniuPrincipal menu = new MeniuPrincipal();
        }
    }

    private class BackListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // Inchiderea ferestrei FormularProgramare
            dispose();

            // Redirectionare catre MeniuPrincipal
            MeniuPrincipal menu = new MeniuPrincipal();
        }
    }
}
