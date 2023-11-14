import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MeniuPrincipal extends JFrame {
    private JButton programeazaButton, listaMediciButton, programLucruButton, iesireButton;

    public MeniuPrincipal() {
        setTitle("DentalPlanner - Meniu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel mainPanel = new JPanel(new GridLayout(4, 1));

        programeazaButton = new JButton("Programeaza-te");
        programeazaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose(); // inchiderea ferestrei curente
                FormularProgramare programare = new FormularProgramare();
            }
        });
        mainPanel.add(programeazaButton);

        listaMediciButton = new JButton("Lista Medici");
        listaMediciButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose(); // inchiderea ferestrei curente
                ListaMedici listaMedici = new ListaMedici();
            }
        });
        mainPanel.add(listaMediciButton);

        programLucruButton = new JButton("Program de lucru");
        programLucruButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose(); // inchiderea ferestrei curente
                ProgramLucru programLucru = new ProgramLucru();
            }
        });
        mainPanel.add(programLucruButton);

        iesireButton = new JButton("Iesire");
        iesireButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                // inchiderea ferestrei curente
                dispose();
                // închiderea aplicației
                System.exit(0);
            }
        });
        mainPanel.add(iesireButton);


        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
