import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Student Info");
		frame.setLocationRelativeTo(null);
		
		frame.setLayout(null);
		
	
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel label1 = new JLabel();
		label1.setText("Name: Ahmed Muhtasim Labib");
		label1.setBounds(20, 10, 200, 20);
		frame.add(label1);
		
		JLabel label2 = new JLabel();
		label2.setText("ID : 241-115-062");
		label2.setBounds(20, 30, 150, 20);
		frame.add(label2);
		
		JLabel label3 = new JLabel();
		label3.setText("Batch : 60th");
		label3.setBounds(20, 50, 150, 20);
		frame.add(label3);
		
		
		JLabel label4 = new JLabel();
		label4.setText("Section : 'B' ");
		label4.setBounds(20, 70, 150, 20);
		frame.add(label4);
		
		JLabel label5 = new JLabel();
		label5.setText("Department : CSE ");
		label5.setBounds(20, 90, 150, 20);
		frame.add(label5);
		
		JLabel label6 = new JLabel();
		label6.setText("University : Metropolitan University ");
		label6.setBounds(20, 110, 300, 20);
		frame.add(label6);
		
		
		
		
		
		frame.setVisible(true);
		


	}

}
  

