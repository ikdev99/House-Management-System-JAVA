import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Profile extends JFrame implements ActionListener {

    JPanel p1, p2;
    JButton b1, b2;

    public Profile() {

        super("Profile");
        this.setSize(800, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color c1 = new Color(107, 147, 211);

        p1 = new JPanel();
        p1.setPreferredSize(new Dimension(800, 30));
        p1.setBackground(c1);

        ImageIcon logout = new ImageIcon(getClass().getResource("LGICON.jpg"));
        b1 = new JButton("Back", logout);
        b1.setFont(new Font("Abadi", Font.BOLD, 12));
        b1.setForeground(Color.red);
        b1.setBackground(c1);
        b1.addActionListener(this);
        p1.add(b1);

        p2 = new JPanel();
        p2.setBackground(Color.white);

        ImageIcon logo = new ImageIcon(getClass().getResource("LOGO.jpg"));
        b2 = new JButton(logo);
        b2.setFont(new Font("Abadi", Font.BOLD, 12));
        b2.setForeground(Color.red);
        b2.setBackground(Color.white);
        b2.addActionListener(this);
        p2.add(b2);

        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.CENTER);
		this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()==b1){
        HomePage p2 = new HomePage();
        this.setVisible(false);
        p2.setVisible(true);
		}
    }


	public static void main(String [] args)
	{
		new Profile();
		
}	 }