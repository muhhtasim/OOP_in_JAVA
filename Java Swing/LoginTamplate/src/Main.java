
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(500, 600);
		frame.setTitle("Sign up");
		
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		///////////////////////Label/////////////////////////////
		JLabel label1 = new JLabel();
		label1.setText("Username: ");
		label1.setBounds(10, 10, 100, 20);
		label1.setFont(new Font("Arial", Font.BOLD, 14));
		frame.add(label1);
		
		/////////////////////TextField///////////////////
		JTextField tf1 = new JTextField();
		tf1.setBounds(90, 10, 150, 20);
		frame.add(tf1);
		
		///////////////////////Label/////////////////////////////
		JLabel label2 = new JLabel();
		label2.setText("Password: ");
		label2.setBounds(10, 40, 100, 20);
		label2.setFont(new Font("Arial", Font.BOLD, 14));
		frame.add(label2);
		
		/////////////////////TextField///////////////////
		JTextField tf2 = new JTextField();
		tf2.setBounds(90, 40, 150, 20);
		frame.add(tf2);
		
		
		///////////////////////Label/////////////////////////////
		JLabel label3 = new JLabel();
		label3.setText("Gender: ");
		label3.setBounds(10, 70, 100, 20);
		label3.setFont(new Font("Arial", Font.BOLD, 14));
		frame.add(label3);
		
		/////////////////Combo Box//////////////////////
		String s[] = {"Male", "Female", "Others"};
		JComboBox cob1 = new JComboBox(s);
		cob1.setBounds(90, 70, 100, 20);
		cob1.setBackground(Color.GRAY);
		cob1.setForeground(Color.WHITE);
		frame.add(cob1);
		
		/////////////////Check Box////////////////
		final JCheckBox cb1 = new JCheckBox("I accept the terms & conditions.");
		cb1.setBounds(10, 100, 220, 20);
		frame.add(cb1);
		
        
        ////////////////Button////////////////////
        JButton btn1 = new JButton("Create");
        btn1.setBounds(180, 140, 90, 20);
        btn1.setBackground(Color.GREEN);
        btn1.setForeground(Color.BLUE);
        btn1.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(btn1);
        
		///////////////////////Label/////////////////////////////
//		JLabel label4 = new JLabel();
////		label4.setText("Gender: ");
//		label4.setBounds(10, 170, 100, 20);
//		label4.setFont(new Font("Arial", Font.BOLD, 14));
//		frame.add(label4);
//        
        btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(cb1.isSelected())
				{
					String name = tf1.getText();
					String gender = (String) cob1.getItemAt(cob1.getSelectedIndex());
					Welcom w = new Welcom(name, gender);
					frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "You have accept the Terms and Conditions.");
				}
			}
		});
        frame.setVisible(true);
	}

}