import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

public class SearchPage extends JFrame implements ActionListener,MouseListener {

    JButton profileButton1, backButton, House1, House2, House3,H1,H2,H3,b1,b2,b3;
    JLabel imageLabel;
    ImageIcon image;

    String hN1,hD1,hP1;//houseName,datails,picPath
    String hN2,hD2,hP2;
    String hN3,hD3,hP3;
    
    int price1, bed1, bath1,sqft1;
    int price2, bed2, bath2,sqft2;
    int price3, bed3, bath3,sqft3;

    public SearchPage(  String hN1,String hD1,String hP1,int price1,int bed1,int bath1,int sqft1,
                        String hN2,String hD2,String hP2,int price2,int bed2,int bath2,int sqft2,
                        String hN3,String hD3,String hP3,int price3,int bed3,int bath3,int sqft3) {
        this.hN1=hN1;
        this.hD1=hD1;
        this.hP1=hP1;
        this.hN2=hN2;
        this.hD2=hD2;
        this.hP2=hP2;
        this.hN3=hN3;
        this.hD3=hD3;
        this.hP3=hP3;
        this.price1=price1;
        this.price2=price2;
        this.price3=price3;
        this.bed1=bed1;
        this.bed2=bed2;
        this.bed3=bed3;
        this.bath1=bath1;
        this.bath2=bath2;
        this.bath3=bath3;
        this.sqft1=sqft1;
        this.sqft2=sqft2;
        this.sqft3=sqft3;
this.
        setTitle("Search Page");
        setSize(800, 500);
        setLayout(null);
        getContentPane().setBackground(new Color(123, 205, 255));
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        //image = new ImageIcon("home6.png");
        image = new ImageIcon("House1image.jpeg");
        imageLabel = new JLabel();
        imageLabel.setBounds(0, -10, 800, 500);
        imageLabel.setIcon(image);
        

        b1 = new JButton();
        b1.setIcon(new ImageIcon(hP1));
        b1.setBounds(40, 25, 200, 260);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.addActionListener(this);
        imageLabel.add(b1);



         b2 = new JButton();
        //b2.setIcon(new ImageIcon("House2image.jpg"));
        b2.setBounds(280, 25, 200, 260);
        b2.setIcon(new ImageIcon(hP2));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.addActionListener(this);
        imageLabel.add(b2);

        
        
        backButton = new JButton("Back");
        backButton.setBounds(37, 421, 98, 38);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.setBackground(new Color(29,29,29));
        backButton.setFont(new Font("Cooper Black", Font.PLAIN, 25));
        backButton.setForeground(Color.WHITE);
        backButton.setFocusable(false);
        backButton.setBorderPainted(false);
        backButton.addMouseListener(this);
        //ButtonUtils.setButtonRadius(backButton, 15);


        //LineBorder roundedBorder=new LineBorder(null);
        //roundedBorder.paintBorder(backButton, backButton.getGraphics(), EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
        imageLabel.add(backButton);


        House1 = new JButton(hN1);
        House1.setBounds(0, 300, 270, 48);
        House1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        House1.setBackground( Color.white);
        House1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        House1.setFocusable(false);
        House1.setBorderPainted(false);
        House1.addMouseListener(this);
        imageLabel.add(House1);

        H1 = new JButton("৳"+price1+"/month");
        H1.setBounds(0, 340, 270, 48);
        H1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        H1.setBackground(Color.white);
        H1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        H1.setFocusable(false);
        H1.setBorderPainted(false);
        H1.addMouseListener(this);
        imageLabel.add(H1);

        House2 = new JButton(hN2);
        House2.setBounds(245, 300, 270, 48);
        House2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        House2.setBackground( Color.white);
        House2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        House2.setFocusable(false);
        House2.setBorderPainted(false);
        House2.addMouseListener(this);
        imageLabel.add(House2);

        H2 = new JButton("৳"+price2+"/month");
        H2.setBounds(245, 340, 270, 48);
        H2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        H2.setBackground(Color.white);
        H2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        H2.setFocusable(false);
        H2.setBorderPainted(false);
        H2.addMouseListener(this);
        imageLabel.add(H2);

        b3 = new JButton();
        b3.setIcon(new ImageIcon(hP3));
        b3.setBounds(530, 25, 200, 260);
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.addActionListener(this);
        imageLabel.add(b3);

        House3 = new JButton(hN3);
        House3.setBounds(480, 300, 310, 48);
        House3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        House3.setBackground(Color.white);
        House3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        House3.setFocusable(false);
        House3.setBorderPainted(false);
        House3.addMouseListener(this);
        imageLabel.add(House3);

        H3 = new JButton("৳"+price3+"/month");
        H3.setBounds(490, 340, 310, 48);
        H3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        H3.setBackground(Color.white);
        H3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        H3.setFocusable(false);
        H3.setBorderPainted(false);
        H3.addMouseListener(this);
        imageLabel.add(H3);


        add(imageLabel);
        setVisible(true);
    }
   
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == profileButton1) {
            dispose();
            new ProfilePage();
        }

        else if (e.getSource() == backButton) {
            dispose();
            new HomePage();
        }

        else if (e.getSource() == House1) {
            dispose();
            new HomePage();
        }

        else if (e.getSource() == House2) {
            dispose();
            new HomePage();
        }

        else if (e.getSource() == House3) {
            dispose();
            new HomePage();
        }

    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public static void main(String[] args) {
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new HouseDetailsForm(hN1,hD1,hP1,price1,bed1,bath1,sqft1);
            this.dispose();
        }
        else if(e.getSource()==b2){
            this.dispose();
            new HouseDetailsForm(hN2,hD2,hP2,price2,bed2,bath2,sqft2);

        }
        else if(e.getSource()==b3){
            this.dispose();
            new HouseDetailsForm(hN3,hD3,hP3,price3,bed3,bath3,sqft3);

        }



    }


}
