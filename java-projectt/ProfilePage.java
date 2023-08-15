import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ProfilePage extends JFrame implements MouseListener {

    JLabel username, email, phonenumber, password, imageLabel1,usernamefiledata,emailfiledata,phonenumberfiledata,passwordfiledata;
String line;
    ImageIcon image;
    JButton backButton, logoutButton;

    public ProfilePage() {
        this.setTitle("Profile Page");
        this.setSize(800, 500);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(123, 205, 255));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        image = new ImageIcon("home5.png");
        imageLabel1 = new JLabel();
        imageLabel1.setBounds(0, -10, 800, 500);
        imageLabel1.setIcon(image);

        username = new JLabel("Username :");
        username.setBounds(100, 153, 237, 53);
        username.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        imageLabel1.add(username);
		
		 usernamefiledata = new JLabel();
        usernamefiledata.setBounds(298, 157, 466, 49);
        usernamefiledata.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        imageLabel1.add(usernamefiledata);
		
		
		
		
		

        email = new JLabel("E-mail :");
        email.setBounds(155, 220, 237, 53);
        email.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        imageLabel1.add(email);
		
		
		 emailfiledata = new JLabel();
        emailfiledata.setBounds(298, 223, 466, 49);
        emailfiledata.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        imageLabel1.add(emailfiledata);

        phonenumber = new JLabel("Phone Number:");
        phonenumber.setBounds(51, 286, 237, 60);
        phonenumber.setFont(new Font("Cooper Black", Font.PLAIN, 28));
        imageLabel1.add(phonenumber);


 phonenumberfiledata = new JLabel();
        phonenumberfiledata.setBounds(298, 290, 466, 49);
        phonenumberfiledata.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        imageLabel1.add(phonenumberfiledata);





        password = new JLabel("Password :");
        password.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        password.setBounds(100, 354, 237, 53);
        imageLabel1.add(password);


 passwordfiledata = new JLabel();
        passwordfiledata.setBounds(298, 356, 466, 49);
        passwordfiledata.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        imageLabel1.add(passwordfiledata);








        logoutButton = new JButton("Logout");
        logoutButton.setBounds(339, 419, 123, 44);
        logoutButton.setBackground(new Color(60, 156, 214));
        logoutButton.setFont(new Font("Cooper Black", Font.PLAIN, 25));
        logoutButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logoutButton.setFocusable(false);
        logoutButton.setBorderPainted(false);
        logoutButton.addMouseListener(this);
        imageLabel1.add(logoutButton);

        backButton = new JButton("Back");
        backButton.setBounds(50, 55, 141, 48);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.setBackground(new Color(92, 225, 230));
        backButton.setFont(new Font("Cooper Black", Font.PLAIN, 25));
        backButton.setFocusable(false);
        backButton.setBorderPainted(false);
        backButton.addMouseListener(this);
        imageLabel1.add(backButton);

        this.add(imageLabel1);
        this.setVisible(true);

        // Read data from file
        String[] fields = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            
            while ((line = reader.readLine()) != null) {
                fields = line.split(",");
				usernamefiledata.setText(fields[0]);
        passwordfiledata.setText(fields[1]);
        phonenumberfiledata.setText(fields[2]);
        emailfiledata.setText(fields[3]);
    
                if (fields[0].equals(usernamefiledata.getText())
        && fields[2].equals(phonenumberfiledata.getText())
        && fields[1].equals(passwordfiledata.getText())
        && fields[3].equals(emailfiledata.getText()))  {
					 usernamefiledata.setText(fields[0]);
            emailfiledata.setText(fields[3]);
            phonenumberfiledata.setText(fields[2]);
            passwordfiledata.setText(fields[1]);
					
                    //break;
                }
            }
            reader.close();
        } catch (IOException ex) {
            System.err.println("Error reading file: " + ex.getMessage());
        }
    }

    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == logoutButton) {
            dispose();
            new LoginForm();
        } else if (e.getSource() == backButton) {
            dispose();
            new HomePage();
        }
    }





         public void  	mouseEntered(MouseEvent e){
			 if(e.getSource() == logoutButton){
			 logoutButton.setBackground( Color.red);
			 }
			 else if(e.getSource() == backButton){
				 backButton.setBackground( Color.red);
			 }
		 };
         public void  mouseExited(MouseEvent e){
			 if(e.getSource() == logoutButton){
			 logoutButton.setBackground(new Color(60,156,214));
			 }
			 else if (e.getSource() == backButton){
				 backButton.setBackground(new Color(92,225,230));
			 }
			 
		 };
         public void  	mousePressed(MouseEvent e){};
         public void  mouseReleased(MouseEvent e){};
		 




public static void main(String args[]){
	
	new ProfilePage();
	
}}






