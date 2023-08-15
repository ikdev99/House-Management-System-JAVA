import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class AdminDashbord implements ActionListener{
	
	JFrame adminDashBord;
	private JLabel wlcLbl;
	private JButton  Backbtn ,logoutBtn,empdataBtn,empdata,serempBtn,seremp,addempBtn,addemp,addAdminBtn,addAdmin;
	
	public AdminDashbord(){
		
		adminDashBord = new JFrame();
		
		wlcLbl = new JLabel("Admin DashBoard");
		wlcLbl.setBounds(550,35,300,40);
		wlcLbl.setForeground(new Color(255,255,255));
		wlcLbl.setFont(new Font("Arial",Font.BOLD,20));
		
		logoutBtn = new JButton("Logout");
		logoutBtn.setBounds(700,10,90,25);
		logoutBtn.setForeground(new Color(255,255,255));
		logoutBtn.setFont(new Font("Arial",Font.BOLD,16));
		logoutBtn.setFocusPainted(false);
		logoutBtn.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		logoutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		logoutBtn.setContentAreaFilled(false);
		adminDashBord.add(logoutBtn);
		
		empdataBtn = new JButton();
		empdataBtn.setIcon(new ImageIcon("Images/userinfo.jpg"));
		empdataBtn.setBounds(460,100,150,150);
		empdataBtn.setFocusPainted(false);
		empdataBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		empdataBtn.setBackground(Color.WHITE);
		adminDashBord.add(empdataBtn);
		
		empdata = new JButton("Employee Information");
		empdata.setBounds(440,250,180,20);
		empdata.setFont(new Font("Arial",Font.BOLD,13));
		empdata.setForeground(new Color(255,255,255));
		empdata.setFocusPainted(false);
		empdata.setCursor(new Cursor(Cursor.HAND_CURSOR));
		empdata.setContentAreaFilled(false);
		empdata.setBorderPainted(false);
		adminDashBord.add(empdata);
		
		serempBtn = new JButton();
		serempBtn.setIcon(new ImageIcon("Images/search.png"));
		serempBtn.setBounds(620,100,150,150);
		serempBtn.setFocusPainted(false);
		serempBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		serempBtn.setBackground(Color.WHITE);
		adminDashBord.add(serempBtn);
		
		seremp = new JButton("Search Employee");
		seremp.setBounds(600,250,180,20);
		seremp.setFont(new Font("Arial",Font.BOLD,13));
		seremp.setForeground(new Color(255,255,255));
		seremp.setFocusPainted(false);
		seremp.setCursor(new Cursor(Cursor.HAND_CURSOR));
		seremp.setContentAreaFilled(false);
		seremp.setBorderPainted(false);
		adminDashBord.add(seremp);
		
		addempBtn = new JButton();
		addempBtn.setIcon(new ImageIcon("Images/add.png"));
		addempBtn.setBounds(460,280,150,150);
		addempBtn.setFocusPainted(false);
		addempBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		addempBtn.setBackground(Color.WHITE);
		adminDashBord.add(addempBtn);
		
		addemp = new JButton("Add Employee");
		addemp.setBounds(440,440,180,20);
		addemp.setFont(new Font("Arial",Font.BOLD,13));
		addemp.setForeground(new Color(255,255,255));
		addemp.setFocusPainted(false);
		addemp.setCursor(new Cursor(Cursor.HAND_CURSOR));
		addemp.setContentAreaFilled(false);
		addemp.setBorderPainted(false);
		adminDashBord.add(addemp);
		
		addAdminBtn = new JButton();
		addAdminBtn.setIcon(new ImageIcon("Images/loc.png"));
		addAdminBtn.setBounds(620,280,150,150);
		addAdminBtn.setFocusPainted(false);
		addAdminBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		addAdminBtn.setBackground(Color.WHITE);
		adminDashBord.add(addAdminBtn);
		
		addAdmin = new JButton("Add Admin");
		addAdmin.setBounds(600,440,180,20);
		addAdmin.setFont(new Font("Arial",Font.BOLD,13));
		addAdmin.setForeground(new Color(255,255,255));
		addAdmin.setFocusPainted(false);
		addAdmin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		addAdmin.setContentAreaFilled(false);
		addAdmin.setBorderPainted(false);
		adminDashBord.add(addAdmin);
		
		
		adminDashBord.setLayout(null);
		adminDashBord.setTitle("Admin DashBoard");
		adminDashBord.setSize(900,600);
		adminDashBord.setBackground(new Color(152,235,152));
		adminDashBord.setResizable(false);
		adminDashBord.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminDashBord.setLocationRelativeTo(null);

        Backbtn=new JButton("Back ");
        Backbtn.setBounds(550,10,90,25);
		Backbtn.setForeground(new Color(255,255,255));
		Backbtn.setFont(new Font("Arial",Font.BOLD,16));
		Backbtn.setFocusPainted(false);
		Backbtn.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		Backbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Backbtn.setContentAreaFilled(false);
        Backbtn.addActionListener(this);
		adminDashBord.add(Backbtn);


		ImageIcon backgroundImage = new ImageIcon("Images/House2image.jpeg");
		Image img = backgroundImage.getImage();
		Image tempImg = img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
		backgroundImage = new ImageIcon(tempImg);
		
		JLabel backgroundLbl = new JLabel("",backgroundImage,JLabel.CENTER);
		backgroundLbl.setBounds(0,0,900,600);
		adminDashBord.add(backgroundLbl);
		
		adminDashBord.setVisible(true);
		
	}
	
public static void main (String[]args){
	new AdminDashbord();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
}
}