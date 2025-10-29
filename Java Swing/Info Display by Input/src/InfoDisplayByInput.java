import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InfoDisplayByInput {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("New One");
		frame.setLocationRelativeTo(null);
		
		frame.setLayout(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel label1 = new JLabel();
		label1.setText("Name :");
		label1.setBounds(20, 10, 200, 20);
		frame.add(label1);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(70, 15, 220, 15);
		frame.add(tf1);
		
		
		
		JLabel label2 = new JLabel();
		label2.setText("ID :"
				+ "");
		label2.setBounds(20, 30, 200, 20);
		frame.add(label2);
		
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(70, 35, 220, 15);
		frame.add(tf2);
		
		
		JLabel label3 = new JLabel();
		label3.setText("Batch :");
		label3.setBounds(20, 50, 200, 20);
		frame.add(label3);
		
		JTextField tf3 = new JTextField();
		tf3.setBounds(70, 55, 220, 15);
		frame.add(tf3);
		
		JButton btn1 = new JButton();
		btn1.setText("SHOW");
		btn1.setBounds(100, 90, 100, 25);
		frame.add(btn1);
		
		
		JLabel label4 = new JLabel();
		label4.setBounds(20, 130, 200, 20);
		frame.add(label4);
		
		
        JLabel label5 = new JLabel();
		label5.setBounds(20, 150, 200, 20);
		frame.add(label5);
		
		
		
        JLabel label6 = new JLabel();
		label6.setBounds(20, 170, 200, 20);
		frame.add(label6);
		
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label4.setText("Name : " + tf1.getText());
				label5.setText("ID : " +tf2.getText());
				label6.setText("Batch : " +tf3.getText());
				
			}
	
		
		
		});
		
		
		
		frame.setVisible(true);
		

	}

}



