import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.HashMap;

public class MedicineInfoApp {
    int boardWidth = 450;
    int boardHeight = 650;

    // Colors
    Color bgColor = new Color(28, 28, 28);
    Color cardColor = new Color(45, 45, 45);
    Color buttonColor = new Color(255, 149, 0);
    Color textColor = new Color(255, 255, 255);
    Color accentColor = new Color(52, 152, 219);

    JFrame frame = new JFrame("💊 Medicine Info App");
    JLabel titleLabel = new JLabel("Select a Medicine");
    JTextArea infoArea = new JTextArea();
    JPanel buttonPanel = new JPanel();

    // Medicine data
    HashMap<String, String> medicineData = new HashMap<>();

    MedicineInfoApp() {
        // Medicine details
        medicineData.put("Napa", "💊 **Napa (Paracetamol)**\n\nUsed to relieve fever, headache, toothache, and muscle pain. Suitable for mild to moderate pain relief.");
        medicineData.put("Paracetamol", "💊 **Paracetamol**\n\nA common painkiller and fever reducer. Helps relieve headaches, muscle pain, and colds.");
        medicineData.put("Omeprazole", "💊 **Omeprazole**\n\nReduces stomach acid. Used for acid reflux, heartburn, and ulcers.");
        medicineData.put("Seclo", "💊 **Seclo (Omeprazole)**\n\nTreats gastritis and acidity. Best taken before meals to reduce stomach discomfort.");
        medicineData.put("Amodis", "💊 **Amodis**\n\nUsed for diarrhea control and restoring bowel balance. Take as prescribed.");
        medicineData.put("Histacin", "💊 **Histacin**\n\nAn antihistamine that relieves allergy symptoms like sneezing, itching, and runny nose.");
        medicineData.put("Cef-3", "💊 **Cef-3 (Cefixime)**\n\nAn antibiotic for bacterial infections such as tonsillitis, bronchitis, and urinary infections.");
        medicineData.put("Losectil", "💊 **Losectil**\n\nUsed for acid reflux and gastric ulcers. Helps reduce acid and heal the stomach lining.");
        medicineData.put("Antacid", "💊 **Antacid Tablets**\n\nNeutralizes excess stomach acid. Provides quick relief from heartburn and indigestion.");
        medicineData.put("Flagyl", "💊 **Flagyl (Metronidazole)**\n\nAn antibiotic used to treat bacterial and parasitic infections, especially in the stomach and intestines.");
        medicineData.put("Azithromycin", "💊 **Azithromycin**\n\nA broad-spectrum antibiotic used to treat respiratory infections, skin infections, and STDs.");
        medicineData.put("Cetirizine", "💊 **Cetirizine**\n\nAn allergy medicine that relieves itching, runny nose, and watery eyes. Usually taken once daily.");
        medicineData.put("Ranitidine", "💊 **Ranitidine**\n\nReduces stomach acid and treats heartburn, gastritis, and acid reflux. Take before meals.");
        medicineData.put("Napa Extra", "💊 **Napa Extra**\n\nA stronger version of Napa combining paracetamol and caffeine. Used for headaches and migraines.");
        medicineData.put("Bextrum", "💊 **Bextrum**\n\nA multivitamin supplement that supports immunity, energy, and overall health.");
        medicineData.put("Maxpro", "💊 **Maxpro (Esomeprazole)**\n\nUsed to reduce stomach acid and prevent ulcers and gastritis.");
        medicineData.put("ORS", "💧 **ORS (Oral Rehydration Salts)**\n\nRestores body fluids and electrolytes lost due to dehydration, vomiting, or diarrhea.");

        // Frame setup
        frame.setSize(boardWidth, boardHeight);
        frame.setLayout(new BorderLayout(10, 10));
        frame.getContentPane().setBackground(bgColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        // Title label
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 26));
        titleLabel.setForeground(textColor);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        frame.add(titleLabel, BorderLayout.NORTH);

        // Info area
        infoArea.setFont(new Font("Arial", Font.PLAIN, 16));
        infoArea.setBackground(cardColor);
        infoArea.setForeground(textColor);
        infoArea.setLineWrap(true);
        infoArea.setWrapStyleWord(true);
        infoArea.setEditable(false);
        infoArea.setMargin(new Insets(15, 15, 15, 15));
        infoArea.setText("🩺 Click a medicine below to view its details.");
        JScrollPane scrollPane = new JScrollPane(infoArea);
        scrollPane.setBorder(new LineBorder(cardColor));
        frame.add(scrollPane, BorderLayout.CENTER);

        // Button panel
        buttonPanel.setLayout(new GridLayout(5, 3, 10, 10));
        buttonPanel.setBackground(bgColor);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        String[] medicines = {
            "Napa", "Paracetamol", "Omeprazole",
            "Seclo", "Amodis", "Histacin",
            "Cef-3", "Losectil", "Antacid",
            "Flagyl", "Azithromycin", "Cetirizine",
            "Ranitidine", "Napa Extra", "Bextrum",
            "Maxpro", "ORS"
        };

        for (String med : medicines) {
            JButton btn = new JButton(med);
            btn.setFont(new Font("Arial", Font.BOLD, 16));
            btn.setBackground(buttonColor);
            btn.setForeground(Color.white);
            btn.setFocusPainted(false);
            btn.setBorder(new LineBorder(bgColor, 3));
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

            btn.addActionListener(e -> infoArea.setText(medicineData.get(med)));

            btn.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(accentColor);
                }
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(buttonColor);
                }
            });

            buttonPanel.add(btn);
        }

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MedicineInfoApp();
    }
}
