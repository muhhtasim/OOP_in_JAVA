package Image;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageDisplayPrgm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.setTitle("CR7 Image Display");
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		ImageIcon icon1 = new ImageIcon("img/png-transparent-CR7-siuu.png");
		Image image = icon1.getImage();
		Image newImage = image.getScaledInstance(250, 50, Image.SCALE_SMOOTH);
		ImageIcon resizeIcon = new ImageIcon(newImage);
		
	    JLabel title = new JLabel("Cristiano Ronaldo 🐐", JLabel.CENTER);
	    title.setBounds(0, 20, 600, 30);
	    frame.add(title);
		
		JLabel imglabel = new JLabel();
		
		imglabel.setBounds(10, 20, 200, 20);
		imglabel.setIcon(resizeIcon);
		frame.add(imglabel);
		
		
		
		
		
		
		
		
		
		frame.setVisible(true);

	}

}


