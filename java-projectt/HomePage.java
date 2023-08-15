import javax.swing.*;    //For text fild, button, panel etc.
import java.awt.*;       //for color, front etcimport java.awt.event.*; //For operation of button or etc.
import java.awt.event.*; //For operation of button or etc.
//import Images.*;

public class HomePage extends JFrame implements ActionListener{

JMenuBar bar=new JMenuBar();
JMenu menu=new JMenu("Menu");
JButton profileButton,searchButton;
JComboBox District,Area,Block;
JLabel imageLabe1;
ImageIcon image;
String[][] areaString= new String[][]{{"Area"},
	{"Area", "Bashundhara","Uttara", "Mirpur", "Kuril", "Banani", "Gulshan", "Mohakhali", "Baridhara", "Farmgate", "Badda"}, 
	{"Area", "Hillview","Halurghat", "Boddarhat", "Pahartoli", "Sadarghat"},
	{"Area", "Jalalabad","Arambagh","Police Line","Hazaribag"}, 
	{"Area", "Kandirpar", "Badortola", "Jaotola","Racecource",},
	{"Area", "Rajpara", "Bulanpur", "Raipara", "Motihar"}, {"Area", "No data"}};
String blockString[][]=new String[][]{{" "},{"Block-A","Block-B","Block-C","Block-D","Block-E","Block-F","Block-G","Block-H"},{"1","2","3","4","5","6","7","8","9","10","11"}};

public HomePage()
{
	
	
	this.setTitle("Home Page");
         this.setSize(800, 500);
         this.setLayout(null);
         this.getContentPane().setBackground(new Color(0xFFFDFF));
         this.setResizable(false);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setLocationRelativeTo(null);
	
	
	 	image = new ImageIcon("Images/homebgn1.png");
        imageLabe1 = new JLabel();
        imageLabe1.setBounds(0,0,800, 500);
        imageLabe1.setIcon(image);
	
		bar.setBounds(5, 0, 40, 20);
		bar.setFont(new Font("Times New Roman",Font.BOLD,15));
		bar.setFocusable(false);
		bar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bar.setForeground(Color.white);
		bar.setBackground(new Color(0,0,0,90));
		//menu.setVisible(true);
		JMenuItem logOutItem=new JMenuItem("LogOut");
		JMenuItem aboutItem=new JMenuItem("About");
		JMenuItem favItem=new JMenuItem("Favourites");
		logOutItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Interface();

			}
		});
		
		aboutItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Work in progress");
				JOptionPane.showMessageDialog(null, "Work in progress & never will be finished");
			}
		});
		
		favItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Work in progress & never will be finished");
				//System.out.println("Favourites menu item selected");
			}
		});
		menu.setForeground(Color.white);
		menu.add(logOutItem);
		menu.add(aboutItem);
		menu.add(favItem);

		bar.add(menu);
		imageLabe1.add(bar);
		
		

		
		String [] Districtname = {"Select","Dhaka","Chittagong", "Sylhet", "Cumilla", "Rajshahi"};
	

		District = new JComboBox(Districtname);
		District.setFont(new Font("Georgia",Font.PLAIN,20));
		District.setBounds(35,210,141,37);
		District.setFocusable(false);
		District.setBackground(new Color(0xFFFDFF));
		District.setCursor(new Cursor(Cursor.HAND_CURSOR));
		District.setForeground(Color.black);
		District.addActionListener(this);
		imageLabe1.add(District);
		
		
		//String [] Areaname = {"Area","Basundhara","N/A"};
		String [] temp = {"Select Area","-"};
		
		
		Area= new JComboBox<>(temp);
		Area.setFont(new Font("Georgia",Font.PLAIN,20));
		Area.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Area.setFocusable(false);
		Area.setBounds(320,210,151,37);
		Area.setBackground(new Color(0xFFFDFF));
		Area.setForeground(Color.black);
		
		imageLabe1.add(Area);
		Area.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedArea = (String) Area.getSelectedItem();
				if (selectedArea.equals("Uttara")||selectedArea.equals("Mirpur")) {
					String[] blocks = blockString[2];
					Block.setModel(new DefaultComboBoxModel<String>(blocks));
				} else if (selectedArea.equals("Bashundhara")||selectedArea.equals("Banasree")||selectedArea.equals("Baridhara")||selectedArea.equals("Banani")||selectedArea.equals("Gulshan")) {
					
					String[] blocks = blockString[1];
					Block.setModel(new DefaultComboBoxModel<String>(blocks));
				} else {
					String[] blocks = blockString[0];
					Block.setModel(new DefaultComboBoxModel<String>(blocks));
				}
			}
		});
		
		
		
		
String [] Blockname = {"Blocks"};
		JLabel blockLabel=new JLabel("Block/Number");
		blockLabel.setFont(new Font("Times New Roman",Font.BOLD,15));
		blockLabel.setBounds(600,180,141,37);
		blockLabel.setFocusable(false);
		blockLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		blockLabel.setForeground(Color.white);
		blockLabel.setBackground(new Color(0,0,0,0));
		imageLabe1.add(blockLabel);

		Block = new JComboBox(Blockname);
		Block.setFont(new Font("Georgia",Font.PLAIN,20));
		Block.setBounds(600,210,141,37);
		Block.setFocusable(false);
		Block.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Block.setForeground(Color.black);
		Block.setBackground(new Color(0xFFFDFF));
		imageLabe1.add(Block);
		
	
	
	//String [] Roadno = {"Road No","1","2","3","4","5"};
		
		//Road = new JComboBox(Roadno);
		//Road.setFont(new Font("Georgia",Font.PLAIN,20));
		//Road.setFocusable(false);
		//Road.setBounds(620,210,141,37);
		//Road.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//Road.setForeground(Color.black);
		//Road.setBackground(new Color(0xFFFDFF));
		//imageLabe1.add(Road);
	
	
	searchButton = new JButton("Search");
		searchButton.setFont(new Font("Georgia",Font.PLAIN,25));
		searchButton.setBounds(288,390,224,42);
		searchButton.setForeground(Color.black);
		searchButton.setBackground(new Color(0xFFFDFF));
		searchButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		searchButton.setBorderPainted(false);
		searchButton.setFocusable(false);
		//searchButton.addMouseListener(this);
		imageLabe1.add(searchButton);
		searchButton.addActionListener(this);
		// searchButton.addActionListener(new ActionListener() {
		// 	@Override
		// 	public void actionPerformed(ActionEvent e) {
		// 		HomePage.dispose();
		// 		new SearchPage();
		// 	}
		// });
	
	//ImageIcon image2 = new ImageIcon("profile3.png",35000,3,2,1500);
	//profileButton = new JButton(image2);
		
		//profileButton.setBounds(15,62,69,69);
		//profileButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//profileButton.setBorderPainted(false);
		//profileButton.setFocusable(false);
		//profileButton.addMouseListener(this);
		// imageLabe1.add(profileButton);

	
		this.add(imageLabe1);
     this.setVisible(true);
	
}



public void  mouseClicked(MouseEvent e){
	if (e.getSource()== searchButton){
		dispose();
		
		
	}
	else if (e.getSource()== profileButton){
		dispose();
		new ProfilePage();
		
	}
	
	
	
};
         public void  	mouseEntered(MouseEvent e){
			 if(e.getSource() == searchButton){
			 searchButton.setBackground( Color.white);
			 }
			
		 };
         public void  mouseExited(MouseEvent e){
			 if(e.getSource() == searchButton){
			 searchButton.setBackground(new Color(0xFFFDFF));
			 }
			 
			 
		 };
         public void  	mousePressed(MouseEvent e){};
         public void  mouseReleased(MouseEvent e){};

		

		
		
    



public static void main(String[] args) {
     new HomePage();
}
@Override
public void actionPerformed(ActionEvent e) {
	String selectedArea = (String) Area.getSelectedItem();
	String selectedDistrict=(String)District.getSelectedItem();
	String selectedBlock=(String)Block.getSelectedItem();

	//area
	if (District.getSelectedIndex() == 0) {
		Area.setModel(new DefaultComboBoxModel<>(areaString[0]));
	} 
	else if (District.getSelectedIndex() == 1) {
		Area.setModel(new DefaultComboBoxModel<>(areaString[1]));
	}else if (District.getSelectedIndex() == 2) {
		Area.setModel(new DefaultComboBoxModel<>(areaString[2]));
	}else if (District.getSelectedIndex() == 3) {
		Area.setModel(new DefaultComboBoxModel<>(areaString[3]));
	}else if (District.getSelectedIndex() == 4) {
		Area.setModel(new DefaultComboBoxModel<>(areaString[4]));
	}else if (District.getSelectedIndex() == 5) {
		Area.setModel(new DefaultComboBoxModel<>(areaString[5]));
	}
	
	
	
	if(e.getSource()==searchButton)
	{
		this.dispose();
		//String selectedArea = (String) Area.getSelectedItem();
		System.out.println(selectedArea);
		if(selectedArea.equals("Bashundhara")){
			new SearchPage("HOUSE NO.404,Flat 2B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/rb1.png",28000,3,2,1500,
       		"HOUSE NO.405,Flat 2A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/rb4.png",25000,3,1,1400,
       	 "HOUSE NO.406,Flat 4C",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/rb3.png",30000,4,2,1600);
		}

		else if(selectedArea.equals("Uttara")){
			new SearchPage("HOUSE NO.408,Flat 4B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl1.png",25000,4,3,1800,
       		"HOUSE NO.409,Flat 2D",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl2.png",22000,3,2,1700,
       		"House No.410,Flat 3A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl3.png",20000,3,1,1500);
		}
		
		else if(selectedArea.equals("Mirpur")){
			new SearchPage("HOUSE NO.423,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl3.png",23000,4,2,1600,
       		"HOUSE NO.405,Flat 2B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl2.png",20000,3,2,1450,
       		"HOUSE NO.406,Flat 5A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl1.png",16000,2,1,1200);
		}
		else if(selectedArea.equals("Kuril")){
			new SearchPage("HOUSE NO.411,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl4.png",20000,3,2,1600,
       		"HOUSE NO.412,Flat 2A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl5.png",14000,2,2,1300,
       		"HOUSE NO.413,Flat 4C",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl6.png",12000,2,1,1250);
		}
		else if(selectedArea.equals("Banani")){
			new SearchPage("HOUSE NO.415,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl7.png",35000,5,3,1750,
       		"HOUSE NO.416,Flat 2B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl8.png",32000,4,2,1600,
       		"HOUSE NO.417,Flat 5A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl9.png",29000,3,2,1500);
		}
		else if(selectedArea.equals("Gulshan")){
			new SearchPage("HOUSE NO.430,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl10.png",38000,4,2,1700,
       		"HOUSE NO.434,Flat 2D",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl11.png",35000,3,3,1600,
       		"HOUSE NO.440,Flat 3C",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl12.png",26000,2,1,1400);
		}
		else if(selectedArea.equals("Mohakhali")){
			new SearchPage("HOUSE NO.446,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl13.png",25000,3,2,1550,
       		"HOUSE NO.448,Flat 2A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl14.png",28000,4,2,1400,
       		"HOUSE NO.450,Flat 4D",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl15.png",22000,3,1,1300);
		}
		else if(selectedArea.equals("Baridhara")){
			new SearchPage("HOUSE NO.471,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl16.png",26500,4,2,1700,
       		"HOUSE NO.480,Flat 2C",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl17.png",23000,2,2,1500,
       		"HOUSE NO.482,Flat 2B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl19.png",19000,1,1,1200);
		}
		else if(selectedArea.equals("Farmgate")){
			new SearchPage("HOUSE NO.488,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl20.png",25000,3,2,1600,
       		"HOUSE NO.490,Flat 2C",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl22.png",21000,2,2,1500,
       		"HOUSE NO.492,Flat 4A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/b23.png",30000,5,3,1600);
		}
		else if(selectedArea.equals("Badda")){
			new SearchPage("HOUSE NO.495,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl24.png",24000,4,2,1700,
       		"HOUSE NO.499,Flat 2C",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl25.png",21000,3,2,1500,
       		"HOUSE NO.500,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl26.png",17000,2,1,1200);
		}
		

		else if(selectedArea.equals("Hillview")){
			new SearchPage("HOUSE NO.808,Flat 2B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl24.png",23000,3,2,1400,
       		"HOUSE NO.601,Flat 4A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl23.png",26000,4,2,1600,
       		"HOUSE NO.599,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl22.png",22000,3,1,1300);
		}

		else if(selectedArea.equals("Halurgate")){
			new SearchPage("HOUSE NO.3394,Flat 23a",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl21.png",24000,4,3,1750,
       		"HOUSE NO.1405,Flat 32A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl20.png",19000,3,2,1600,
       		"HOUSE NO.4406,Flat 4B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl19.png",21000,4,2,1500);
		}

		else if(selectedArea.equals("Boddarhat")){
			new SearchPage("HOUSE NO.304,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl18.png",23000,4,2,1500,
       		"HOUSE NO.906,Flat 2A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl17.png",21000,3,2,1400,
       		"HOUSE NO.34406,Flat 3C",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl16.png",18000,2,2,1200);
		}

		else if(selectedArea.equals("Pahartoli")){
			new SearchPage("HOUSE NO.233,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl15.png",24000,3,2,1600,
       		"HOUSE NO.330,Flat 2A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl14.png",25000,4,2,1500,
       		"HOUSE NO.705,Flat 3A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl13.png",22000,3,1,1800);
		}
		else if(selectedArea.equals("Sadarghat")){
			new SearchPage("HOUSE NO.1130,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl12.png",35000,3,2,1500,
       		"HOUSE NO.1200,Flat 2A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl13.png",31000,4,2,1600,
       		"HOUSE NO.990,Flat 3A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl11.png",36000,3,2,1700);
		}
		else if(selectedArea.equals("Jalalabad")){
			new SearchPage("HOUSE NO.677,Flat 4B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl10.png",20000,3,2,1500,
       		"HOUSE NO.333,Flat 2A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl9.png",23000,3,2,1700,
       		"HOUSE NO.650,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl8.png",25000,4,2,1600);
		}
		else if(selectedArea.equals("Arambagh")){
			new SearchPage("HOUSE NO.250,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl7.png",27000,5,2,1800,
       		"HOUSE NO.440,Flat 2B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl6.png",25000,3,2,1600,
       		"HOUSE NO.605,Flat 3C",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl5.png",23000,3,1,1500);
		}
		else if(selectedArea.equals("Police Line")){
			new SearchPage("HOUSE NO.230,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl4.png",29000,5,2,1900,
       		"HOUSE NO.555,Flat 2D",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl3.png",26000,4,2,1500,
       		"HOUSE NO.905,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl2.png",25000,3,2,1400);
		}
		else if(selectedArea.equals("Hazaribag")){
			new SearchPage("HOUSE NO.940,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl1.png",27000,4,2,1500,
       		"HOUSE NO.759,Flat 2A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl2.png",24000,3,2,1300,
       		"HOUSE NO.810,Flat 3A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl3.png",36000,4,2,1200);
		}
		else if(selectedArea.equals("Kandirpar")){
			new SearchPage("HOUSE NO.810,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl4.png",30000,5,2,1800,
       		"HOUSE NO.750,Flat 2A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl5.png",28000,4,2,1500,
       		"HOUSE NO.777,Flat 3A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl6.png",24000,3,2,1300);
		}
		else if(selectedArea.equals("Badortola")){
			new SearchPage("HOUSE NO.1050,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl7.png",25000,3,2,1600,
       		"HOUSE NO.689,Flat 2C",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl8.png",35000,4,2,1500,
       		"HOUSE NO.457,Flat 3D",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl9.png",23000,3,2,1500);
		}
		else if(selectedArea.equals("Jaotola")){
			new SearchPage("HOUSE NO.1060,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl10.png",29000,5,2,1800,
       		"HOUSE NO.600,Flat 2A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl11.png",28000,3,2,1400,
       		"HOUSE NO.100,Flat 3A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl12.png",24000,4,2,1500);
		}
		else if(selectedArea.equals("Racecource")){
			new SearchPage("HOUSE NO.300,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl13.png",33000,3,2,1600,
       		"HOUSE NO.400,Flat 2A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl14.png",31000,3,2,1300,
       		"HOUSE NO.900,Flat 3A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl15.png",22000,3,2,1200);
		}
		else if(selectedArea.equals("Rajpara")){
			new SearchPage("HOUSE NO.300,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl16.png",37000,5,2,1700,
       		"HOUSE NO.500,Flat 2A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl17.png",29000,4,2,1500,
       		"HOUSE NO.600,Flat 3A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl18.png",35000,3,2,1700);
		}
		else if(selectedArea.equals("Bulanpur")){
			new SearchPage("HOUSE NO.740,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl19.png",26000,4,2,1600,
       		"HOUSE NO.459,Flat 2A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl20.png",29000,3,2,1700,
       		"HOUSE NO.200,Flat 3A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl21.png",28000,5,2,1800);
		}
		else if(selectedArea.equals("Raipara")){
			new SearchPage("HOUSE NO.500,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl22.png",29000,4,2,1500,
       		"HOUSE NO.800,Flat 2A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl24.png",26000,5,2,1200,
       		"HOUSE NO.300,Flat 3A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/notFound.png",35000,3,2,1700);
		}
		else if(selectedArea.equals("Motihar")){
			new SearchPage("HOUSE NO.600,Flat 3B",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/bl24.png",25000,3,2,1500,
       		"HOUSE NO.888,Flat 2A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/notFound.png",29000,4,2,1700,
       		"HOUSE NO.990,Flat 3A",selectedArea+"("+selectedBlock+"),"+selectedDistrict,"Images/notFound.png",28000,5,2,1400);
		}
		
		
		






		else{
			new SearchPage("NOT Found","NOT Found","Images/notFound.png",35000,3,2,1500,
       		"NOT Found","NOT Found","Images/notFound.png",35000,3,2,1500,
       		"NOT Found","NOT Found","Images/notFound.png",35000,3,2,1500);
		}

	}

	



}
}
