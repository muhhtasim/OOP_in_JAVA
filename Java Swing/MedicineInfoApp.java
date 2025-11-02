import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.HashMap;

public class MedicineInfoApp {
    int boardWidth = 450;
    int boardHeight = 700;

    // Colors
    Color bgColor = new Color(25, 25, 25);
    Color cardColor = new Color(40, 40, 40);
    Color buttonColor = new Color(255, 149, 0);
    Color textColor = Color.WHITE;
    Color accentColor = new Color(41, 128, 185);

    JFrame frame = new JFrame("💊 Medicine Info App");
    JLabel titleLabel = new JLabel("Select a Medicine");
    JTextArea infoArea = new JTextArea();
    JPanel buttonPanel = new JPanel();
    HashMap<String, String> medicineData = new HashMap<>();

    MedicineInfoApp() {
        // Medicine list (37 medicines)
        medicineData.put("Napa", "💊 **Napa (Paracetamol)**\n\nUsed for fever, headache, toothache, and mild pain relief.");
        medicineData.put("Paracetamol", "💊 **Paracetamol**\n\nCommon fever and pain reliever. Helps reduce headache and body ache.");
        medicineData.put("Omeprazole", "💊 **Omeprazole**\n\nReduces stomach acid. Used for acid reflux and ulcers.");
        medicineData.put("Seclo", "💊 **Seclo (Omeprazole)**\n\nTreats acidity and gastritis. Take before meals.");
        medicineData.put("Amodis", "💊 **Amodis**\n\nUsed for diarrhea and bowel issues. Restores digestive balance.");
        medicineData.put("Histacin", "💊 **Histacin**\n\nRelieves allergy symptoms like sneezing and itching.");
        medicineData.put("Cef-3", "💊 **Cef-3 (Cefixime)**\n\nAntibiotic for bacterial infections like tonsillitis or bronchitis.");
        medicineData.put("Losectil", "💊 **Losectil**\n\nUsed for acid reflux and ulcers. Reduces excess stomach acid.");
        medicineData.put("Antacid", "💊 **Antacid Tablets**\n\nNeutralizes stomach acid. Quick relief from indigestion.");
        medicineData.put("Flagyl", "💊 **Flagyl (Metronidazole)**\n\nTreats bacterial and parasitic infections.");
        medicineData.put("Azithromycin", "💊 **Azithromycin**\n\nAntibiotic used for respiratory and skin infections.");
        medicineData.put("Cetirizine", "💊 **Cetirizine**\n\nAllergy medicine for runny nose, watery eyes, and itching.");
        medicineData.put("Ranitidine", "💊 **Ranitidine**\n\nUsed for heartburn, gastritis, and acid reflux.");
        medicineData.put("Napa Extra", "💊 **Napa Extra**\n\nParacetamol with caffeine for stronger headache relief.");
        medicineData.put("Bextrum", "💊 **Bextrum**\n\nMultivitamin for immunity, energy, and health.");
        medicineData.put("Maxpro", "💊 **Maxpro (Esomeprazole)**\n\nPrevents ulcers and reduces acid.");
        medicineData.put("ORS", "💧 **ORS (Oral Rehydration Salts)**\n\nRestores body fluids after dehydration.");
        medicineData.put("Alatrol", "💊 **Alatrol**\n\nAntihistamine used for allergies and itching.");
        medicineData.put("Panadol", "💊 **Panadol**\n\nPain reliever and fever reducer.");
        medicineData.put("Nexum", "💊 **Nexum (Esomeprazole)**\n\nUsed for acid reflux, heartburn, and gastritis.");
        medicineData.put("Calbo-D", "💊 **Calbo-D**\n\nCalcium and Vitamin D supplement for bone strength.");
        medicineData.put("Zimax", "💊 **Zimax (Azithromycin)**\n\nAntibiotic for respiratory and throat infections.");
        medicineData.put("Ciprocin", "💊 **Ciprocin (Ciprofloxacin)**\n\nAntibiotic for urinary and skin infections.");
        medicineData.put("Norflox", "💊 **Norflox**\n\nUsed for urinary tract and intestinal infections.");
        medicineData.put("Ace", "💊 **Ace (Paracetamol)**\n\nPain reliever and fever reducer, similar to Napa.");
        medicineData.put("Monas", "💊 **Monas (Montelukast)**\n\nUsed to treat asthma and allergic rhinitis.");
        medicineData.put("Secef", "💊 **Secef (Cefuroxime)**\n\nBroad-spectrum antibiotic for bacterial infections.");
        medicineData.put("Rupafen", "💊 **Rupafen (Rupatadine)**\n\nEffective for allergy and skin rashes.");
        medicineData.put("Ciproxin", "💊 **Ciproxin**\n\nAntibiotic used for urinary and stomach infections.");
        medicineData.put("Nexum 20", "💊 **Nexum 20mg**\n\nReduces stomach acid, relieves gastritis.");
        medicineData.put("Emistat", "💊 **Emistat**\n\nPrevents nausea and vomiting.");
        medicineData.put("Ace Plus", "💊 **Ace Plus**\n\nCombination painkiller with caffeine for headaches.");
        medicineData.put("Zinc", "💊 **Zinc Tablet**\n\nImproves immunity and helps in diarrhea recovery.");
        medicineData.put("Fexo", "💊 **Fexo (Fexofenadine)**\n\nAllergy relief medicine with minimal drowsiness.");
        medicineData.put("Myospaz", "💊 **Myospaz**\n\nMuscle relaxant used for back pain and cramps.");
        medicineData.put("Bisolvon", "💊 **Bisolvon**\n\nUsed for cough and mucus clearance.");
        medicineData.put("Ambroxol", "💊 **Ambroxol**\n\nExpectorant for cough and chest congestion.");

        // Frame setup
        frame.setSize(boardWidth, boardHeight);
        frame.setLayout(new BorderLayout(10, 10));
        frame.getContentPane().setBackground(bgColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        // Title
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
        buttonPanel.setLayout(new GridLayout(0, 3, 10, 10));
        buttonPanel.setBackground(bgColor);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        for (String med : medicineData.keySet()) {
            JButton btn = new JButton(med);
            btn.setFont(new Font("Arial", Font.BOLD, 14));
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
