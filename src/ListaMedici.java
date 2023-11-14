import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListaMedici extends JFrame {
    private JTextArea listaMedici;

    public ListaMedici() {
        setTitle("DentalPlanner - Lista Medici");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        JPanel mainPanel = new JPanel(new BorderLayout());

        listaMedici = new JTextArea();
        listaMedici.setEditable(false);
        mainPanel.add(new JScrollPane(listaMedici), BorderLayout.CENTER);

        // Adaugare medici
        listaMedici.append("Dr. Popescu\n");
        listaMedici.append("Dr. Ionescu\n");
        listaMedici.append("Dr. Georgescu\n");
        listaMedici.append("Dr. Vasilescu\n");

        JButton inapoiButton = new JButton("Inapoi");
        inapoiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose(); // închiderea ferestrei curente
                MeniuPrincipal menu = new MeniuPrincipal();
            }
        });
        mainPanel.add(inapoiButton, BorderLayout.SOUTH);

        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
