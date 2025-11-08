
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Try {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Project");
		frame.setSize(500, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
				
		
		JLabel lbl1 = new JLabel();
		lbl1.setText("Usernmae:");
		lbl1.setBounds(10, 20, 150, 20);
		frame.add(lbl1);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(80, 20, 150, 20);
		frame.add(tf1);
		
		JLabel lbl2 = new JLabel();
		lbl2.setText("password:");
		lbl2.setBounds(10, 50, 150, 20);
		frame.add(lbl2);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(80, 50, 150, 20);
		frame.add(tf2);
		
		JCheckBox cb1 = new JCheckBox("I accept the terms and conitons");
		cb1.setBounds(20, 95, 350, 30);
		frame.add(cb1);
		
		JButton btn1 = new JButton("Create");
		btn1.setBounds(30, 130, 100, 30);
		btn1.setBackground(Color.GREEN);
		btn1.setForeground(Color.BLACK);
		frame.add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				if(cb1.isSelected()) {
					
					JOptionPane.showMessageDialog(frame, "Log in Successfull");
				}
				else {
					
					JOptionPane.showMessageDialog(frame, "You have to accept all terms and conditions");
				}
				
			}
		}
		);
		frame.setVisible(true);
	}
}