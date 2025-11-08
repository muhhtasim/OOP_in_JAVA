import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcom {
	Welcom(String name, String gender)
	{
		JFrame frame = new JFrame();
		frame.setSize(500, 600);
		frame.setTitle("Signed in as "+ name);
		
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		///////////////////////Label/////////////////////////////
		JLabel label1 = new JLabel();
		label1.setText("Welcome");
		label1.setBounds(190, 10, 200, 20);
		label1.setFont(new Font("Arial", Font.BOLD, 24));
		label1.setForeground(Color.BLUE);
		frame.add(label1);
		
		JLabel label2 = new JLabel();
		label2.setText(name);
		label2.setBounds(10, 40, 190, 20);
		label2.setFont(new Font("Arial", Font.ITALIC, 12));
		frame.add(label2);
		
		JLabel label3 = new JLabel();
		label3.setText(gender);
		label3.setBounds(10, 70, 100, 20);
		label3.setFont(new Font("Arial", Font.ITALIC, 12));
		frame.add(label3);
		
		frame.setVisible(true);
	}

}
