import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Try2nd {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Project");
		frame.setSize(500, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JLabel lbl1 = new JLabel();
		lbl1.setText("Username :");
		lbl1.setBounds(10, 20, 150, 20);
		frame.add(lbl1);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(80, 20, 150, 20);
		frame.add(tf1);
		
		JLabel lbl2 = new JLabel();
		lbl2.setText("password :");
		lbl2.setBounds(10, 50, 150, 20);
		frame.add(lbl2);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(80, 50, 150, 20);
		frame.add(tf2);
		
		JLabel lbl3 = new JLabel();
		lbl3.setText("Gender :");
		lbl3.setBounds(10, 80, 150, 20);
		frame.add(lbl3);
		
		String s[] = {"Male", "Female", "others"};
		JComboBox cmb1 = new JComboBox(s);
		cmb1.setBounds(80, 80, 150, 20);
		cmb1.setBackground(Color.GRAY);
		cmb1.setForeground(Color.WHITE);
		frame.add(cmb1);
		
		
		final JCheckBox cb1 = new JCheckBox("I accept the terms and conditons");
		cb1.setBounds(20, 120, 350, 30);
		frame.add(cb1);
		
		JButton btn1 = new JButton("Create");
		btn1.setBounds(30, 150, 100, 30);
		btn1.setBackground(Color.GREEN);
		btn1.setForeground(Color.BLACK);
		frame.add(btn1);
		
		JLabel lbl4 = new JLabel();
		lbl4.setBounds(10, 190, 200, 20);
		frame.add(lbl4);
		
		btn1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {

		        if (cb1.isSelected()) {
		            String username = tf1.getText(); // get username
		            String gender = (String) cmb1.getSelectedItem(); // get gender

		            // Show login message
		            JOptionPane.showMessageDialog(frame, "Login Successful!");

		            // Display username + gender on lbl4
		            lbl4.setText(username + "      Gender: " + gender);
		        } else {
		            JOptionPane.showMessageDialog(frame, "You have to accept all terms and conditions");
		        }
		    }
		});
		frame.setVisible(true);
	}
}