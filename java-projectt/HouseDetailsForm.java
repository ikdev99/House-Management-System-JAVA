import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HouseDetailsForm extends JFrame implements ActionListener{
    JButton bookButton = new JButton("Book Now");
    JButton cancelButton = new JButton("Cancel");

    public int price,bedroom,bathroom,sqft;
    String hName;
    String pic,hd;
    public HouseDetailsForm(String hn,String hd,String pic,int price,int bed,int bath,int sqft) {
    //public HouseDetailsForm(String hn,String hd,String pic,int a)
        this.price=price;
        bedroom=bed;
        bathroom=bath;
        hName=hn;
        this.hd=hd;
        this.pic=pic;
        this.sqft=sqft;


        initComponents();
        this.setVisible(true);

    }

    private void initComponents() {
        
        // create and set up the frame
        setTitle("House Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500, 700);
        setLocationRelativeTo(null);

        // create and set up the top panel
        JPanel topPanel = new JPanel(new BorderLayout());
        JLabel pictureLabel = new JLabel(new ImageIcon(pic));
        topPanel.add(pictureLabel, BorderLayout.CENTER);
        JLabel nameLabel = new JLabel(hName);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        nameLabel.setHorizontalAlignment(JLabel.CENTER);
        topPanel.add(nameLabel, BorderLayout.SOUTH);
        topPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // create and set up the details panel
        JPanel detailsPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        detailsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel locationLabel = new JLabel("Location:");
        JLabel locationValueLabel = new JLabel(hd);
        JLabel priceLabel = new JLabel("Price:");
        JLabel priceValueLabel = new JLabel("৳"+price+"/month");
        JLabel bedroomsLabel = new JLabel("Bedrooms:");
        JLabel bedroomsValueLabel = new JLabel("4");
        JLabel bathroomsLabel = new JLabel("Bathrooms:");
        JLabel bathroomsValueLabel = new JLabel("3");
        JLabel sqftLabel = new JLabel("Sqft:");
        JLabel sqftValueLabel = new JLabel(sqft+"");
        
        detailsPanel.add(locationLabel);
        detailsPanel.add(locationValueLabel);
        detailsPanel.add(priceLabel);
        detailsPanel.add(priceValueLabel);
        detailsPanel.add(bedroomsLabel);
        detailsPanel.add(bedroomsValueLabel);
        detailsPanel.add(bathroomsLabel);
        detailsPanel.add(bathroomsValueLabel);
        detailsPanel.add(sqftLabel);
        detailsPanel.add(sqftValueLabel);

        // create and set up the button panel
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));

        bookButton.setFont(new Font("Arial", Font.BOLD, 16));
        bookButton.setBackground(new Color(0, 128, 0));
        bookButton.setForeground(Color.WHITE);
        bookButton.setFocusable(false);
        bookButton.addActionListener(this);

        cancelButton.setFont(new Font("Arial", Font.BOLD, 16));
        cancelButton.setBackground(new Color(180, 0, 0));
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setFocusable(false);
        cancelButton.addActionListener(this);

        buttonPanel.add(bookButton);
        buttonPanel.add(cancelButton);


        // add the panels to the frame
        add(topPanel, BorderLayout.NORTH);
        add(detailsPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        HouseDetailsForm form = new HouseDetailsForm("Rongdhono House","Dhaka,Bashundhara","Images/rb1.png",25000,4,3,300);
        
        
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cancelButton){
            this.dispose();
            new HomePage();
        }
        
        if(e.getSource()==bookButton){
        
        //JOptionPane.showMessageDialog(null, "Successfull");
        int result=JOptionPane.showOptionDialog(rootPane, "Preceed to pay?", "hName", 0, 2, null, null, e);
        if(result==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Successfull");
            this.dispose();
            new Booked();
        }
        if(result==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Incomplete");
        }
            
        }
            
    }
}
