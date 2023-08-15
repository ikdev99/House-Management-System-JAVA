 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AdminPanel extends JFrame implements ActionListener {

    JLabel adminLabel, adnameLabel, imageLabel, adpasswordLabel;
    JTextField adnameTextField, adpasswordTextField;
    JButton submitButton, backButton, admindashboard;
    String name1, password1;
    private File dataFile;

    public AdminPanel() {
        // Set window properties
        this.setTitle("Admin form");
        this.setSize(800, 500);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(123, 205, 255));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        ImageIcon image = new ImageIcon("admin.jpg");
        imageLabel = new JLabel();
        imageLabel.setBounds(0, -30, 2000, 580);
        imageLabel.setIcon(image);

        adminLabel = new JLabel();
        adminLabel.setText("Admin");
        adminLabel.setBounds(20, 10, 300, 100);
        adminLabel.setForeground(new Color(20, 74, 173));
        adminLabel.setFont(new Font("Cooper Black", Font.BOLD, 50));
        imageLabel.add(adminLabel);

        adnameLabel = new JLabel("Username :");
        adnameLabel.setBounds(126, 101, 190, 51);
        adnameLabel.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        imageLabel.add(adnameLabel);

        adnameTextField = new JTextField();
        adnameTextField.setBounds(327, 105, 388, 45);
        adnameTextField.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        imageLabel.add(adnameTextField);

        adpasswordLabel = new JLabel("Password :");
        adpasswordLabel.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        adpasswordLabel.setBounds(126, 171, 190, 51);
        imageLabel.add(adpasswordLabel);

        adpasswordTextField = new JTextField();
        adpasswordTextField.setBounds(327, 175, 388, 45);
        adpasswordTextField.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        imageLabel.add(adpasswordTextField);

        submitButton = new JButton("Submit");
        submitButton.setBounds(600, 400, 100, 40);
        submitButton.setFont(new Font("Cooper Black", Font.PLAIN, 18));
        submitButton.setBackground(new Color(0, 74, 173));
        submitButton.addActionListener(this);
        submitButton.setFocusable(false);
        imageLabel.add(submitButton);

        backButton = new JButton("Back");
        backButton.setBounds(280, 400, 100, 40);
        backButton.setBackground(Color.white);
        backButton.setFont(new Font("Cooper Black", Font.PLAIN, 25));
        backButton.addActionListener(this);
        imageLabel.add(backButton);

        admindashboard = new JButton("Admin Login");
        admindashboard.setBounds(450, 400, 100, 40);
        admindashboard.setBackground(Color.white);
        admindashboard.setFont(new Font("Cooper Black", Font.PLAIN, 25));
        admindashboard.addActionListener(this);
        imageLabel.add(admindashboard);

        this.add(imageLabel);
        this.setVisible(true);
    }
    

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            name1 = adnameTextField.getText();
            password1 = adpasswordTextField.getText(); 

            if (name1.isEmpty() || password1.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    FileWriter writer = new FileWriter("data1.txt", true);
                    writer.write(name1 + "," + password1 + "\n");
                    writer.close();
                 
                    JOptionPane.showMessageDialog(this, "Registration Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                    dispose();
                    new Interface();

                    adnameTextField.setText("");
                    adpasswordTextField.setText("");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error writing to file!", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
         


          }
         else if (e.getSource() == backButton) {
            // Go back to main menu
            this.setVisible(false);
            new Interface();
        }else if(e.getSource()==admindashboard){

            this.setVisible(false);
            new AdminDashbord();
        }
    }
//read data from file
public void readDataFromFile() {
    try {
        File file = new File("data1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {

            line.split(",");
         
        }
        br.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}


    public static void main(String[] args) {
        new AdminPanel();
       }
    }