import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Booked extends JFrame implements MouseListener {

   JPanel panel;
    JLabel imageLabe1;
    JButton logOutButton, homeButton;

    public Booked() {

        this.setTitle("Interface");
        this.setSize(815, 535);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setResizable(false);

        ImageIcon image = new ImageIcon("Images/booked.png");
        JLabel imageLabel = new JLabel(image);
		
        imageLabel.setSize(image.getIconWidth(), image.getIconHeight());
        imageLabel.setVerticalAlignment(JLabel.TOP);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
		

         panel = new JPanel(new BorderLayout());
        panel.add(imageLabel, BorderLayout.CENTER);

        

        logOutButton = new JButton("LogOut");
        logOutButton.setFocusable(false);
        logOutButton.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        logOutButton.setBounds(100, 380, 150, 60);
        logOutButton.setBorder(BorderFactory.createLineBorder(Color.black));
        logOutButton.setBackground(new Color(255,255,255));
		logOutButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
       
		logOutButton.addMouseListener(this);
        imageLabel.add(logOutButton);

        homeButton = new JButton("Home");
        homeButton.setFocusable(false);
        homeButton.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        homeButton.setBounds(530, 380, 150, 60);
        homeButton.setBackground(new Color(255,255,255));
        homeButton.setBorder(BorderFactory.createLineBorder(Color.black));
		homeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
		homeButton.addMouseListener(this);
        imageLabel.add(homeButton);
        this.add(imageLabel);
        this.setVisible(true);
    }

         public void  mouseClicked(MouseEvent e){
			 if (e.getSource() == logOutButton) {
            dispose();
            new Interface();
        } else if (e.getSource() == homeButton) {
            dispose();
            new HomePage();

        }
		 };
         public void  	mouseEntered(MouseEvent e){
			 if(e.getSource() == logOutButton){
			 logOutButton.setBackground( Color.green);
			 }
			 else if(e.getSource() == homeButton){
				 homeButton.setBackground( Color.GREEN);
			 }
		 };
         public void  mouseExited(MouseEvent e){
			 if(e.getSource() == logOutButton){
			 logOutButton.setBackground(new Color(255,255,255));
			 }
			 else if (e.getSource() == homeButton){
				 homeButton.setBackground(new Color(255,255,255));
			 }
			 
		 };
         public void  	mousePressed(MouseEvent e){};
         public void  mouseReleased(MouseEvent e){};
		 



    public static void main(String[] args) {
        new Booked();
    }
}
