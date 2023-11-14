import javax.swing.*;
import java.awt.*;

public class ProgramLucru extends JFrame {
    private JTextArea programLucru;

    public ProgramLucru() {
        setTitle("DentalPlanner - Program de lucru");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        JPanel mainPanel = new JPanel(new BorderLayout());

        programLucru = new JTextArea();
        programLucru.setEditable(false);
        mainPanel.add(new JScrollPane(programLucru), BorderLayout.CENTER);

        // Afisare program de lucru
        programLucru.append("Program de lucru:\n");
        programLucru.append("Luni - Vineri: 08:00 - 20:00\n");
        programLucru.append("Sambata: 09:00 - 14:00\n");
        programLucru.append("Duminica: inchis\n");

        JButton inapoiButton = new JButton("Inapoi");
        inapoiButton.addActionListener(event -> {
            dispose();
            MeniuPrincipal menu = new MeniuPrincipal();
        });
        mainPanel.add(inapoiButton, BorderLayout.SOUTH);

        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
