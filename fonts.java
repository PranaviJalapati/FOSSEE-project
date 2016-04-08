import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class fonts extends JFrame {

	private JPanel ccpane;
	JLabel lld= new JLabel();
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	JLabel lblISaywow;

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fonts frame = new fonts();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the frame.
	 */
	public fonts() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ccpane = new JPanel();
		ccpane.setBorder(new EmptyBorder(5, 5, 5, 5));
		ccpane.setLayout(null);
		setContentPane(ccpane);
		
		JLabel lblButton = new JLabel("Button");
		lblButton.setBounds(209, 154, 46, 14);
		ccpane.add(lblButton);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(lblButton, popupMenu);
		popupMenu.setBounds(-10008, -10031, 107, 72);
		popupMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		
		JMenu test1 = new JMenu("Open test 1");
		popupMenu.add(test1);
		
		JMenu menu = new JMenu("Test 1");
		test1.add(menu);
		
		JMenuItem test2 = new JMenuItem("Test2");
		popupMenu.add(test2);
		
		JMenuItem properties = new JMenuItem("Properties");
		popupMenu.add(properties);
		properties.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e){
				
				//JFrame frm4= new JFrame("dd");
				//frm4.setVisible(true);
				//System.out.println("Menu item Test2");
				prepareGUI();
				showComboboxDemo();
			}
		});
		
		lblISaywow = new JLabel("Please click Properties");
		lblISaywow.setBounds(10, 11, 414, 132);
		ccpane.add(lblISaywow);
		
	
}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
					
				
				
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private void prepareGUI(){
	      mainFrame = new JFrame("Java Swing Examples");
	      mainFrame.setSize(800,400);
	      mainFrame.getContentPane().setLayout(new GridLayout(3,4));
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      headerLabel = new JLabel("", JLabel.CENTER);        
	      statusLabel = new JLabel("",JLabel.CENTER);    

	      statusLabel.setSize(350,100);

	     controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.getContentPane().add(headerLabel);
	      mainFrame.getContentPane().add(controlPanel);
	     mainFrame.getContentPane().add(statusLabel);
	      mainFrame.setVisible(true);  
	   }

	   private void showComboboxDemo(){                                    
	      headerLabel.setText("Control in action: JComboBox");
	      final JComboBox fontcombo = new JComboBox();   
	      final JComboBox fontcombo2= new JComboBox();
	      String fonts[] = 
			      GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		 for(int i = 0; i < fonts.length; i++ ){
			 fontcombo.addItem(fonts[i]);
		 }
		
			 JScrollPane fruitListScrollPane = new JScrollPane(fontcombo);    
			
		      JButton showButton = new JButton("Show");
		      JButton showButton2= new JButton("Color Background");
		      JButton showButton3 = new JButton("Color Text");
	   

	      showButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) { 
	            String data = "";
	          // if (fontcombo.getSelectedIndex() != -1) {                     
	            //   data = "Fruits Selected: " 
	              //    + fontcombo.getItemAt
	                //    (fontcombo.getSelectedIndex());
	              // Color initialColor = Color.red;
					// Color newColor = JColorChooser.showDialog(null, "Dialog Title", initialColor);
				
				//controlPanel.setBackground(newColor);
	               lblISaywow.setText((String) fontcombo.getSelectedItem());
	               lblISaywow.setFont(new Font((String) ( fontcombo.getSelectedItem()),Font.BOLD,70 ));           
	            //}              
	         
	         }
	      }); 
	      showButton2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			Color initialColor = Color.red;
			 Color newColor = JColorChooser.showDialog(null, "Dialog Title", initialColor);
			
			 
//			if(newColor.getSelectedIndex()!=-1){
				ccpane.setBackground(newColor);
				//controlPanel.setBackground(newColor);
				
			//if(fontcombo2.getSelectedIndex()!=-1){
			//headerLabel.setText((String)fontcombo2.getSelectedItem());
		}
		}
	      );
	      showButton3.addActionListener(new ActionListener(){
	    		public void actionPerformed(ActionEvent ae){
	    			Color initialColor = Color.red;
	    			 Color newColor = JColorChooser.showDialog(null, "Dialog Title", initialColor);
	    			 
//	    			if(newColor.getSelectedIndex()!=-1){
	    			 lblISaywow.setForeground(newColor);
	    				//lblNewLabel.setForeground(initialColor);
	  //  		}
	    		}}
	    	      );
	    		
		
	      controlPanel.add(fruitListScrollPane);          
	      controlPanel.add(showButton);
	
	      controlPanel.add(showButton2);
	      controlPanel.add(showButton3);
	      mainFrame.setVisible(true);             
	   
	}
}
