package pokemonGame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;

public class mainPokemon extends JFrame {


	private JPanel contentPane;
	
	public mainPokemon() {
		//Selection Frame Variable
		Selection select = new Selection();
		//help 2 fram vairable
		help1 help1 = new help1();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Dimensions
		setBounds(787, 120, 1000, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		//Stop from chaning size via dragging
		setResizable(false);
		
		
		///////MAIN MENU BUTTONS
		
		//Play Button
		JButton btnNewButton = new JButton("PLAY");
		//Font and dimensions for button
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnNewButton.setBounds(42, 586, 231, 85);
		//Check if button clicked
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Bring in selection frame and takeaway current fram
				select.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		
		//Help Button
		JButton btnHelp = new JButton("HELP");
		//Fonts and dimensions
		btnHelp.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnHelp.setBounds(719, 586, 231, 85);
		//Check if button clicked
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				help1.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnHelp);
		
		
		//Pokemon Icon 
		//Create Jlabel
		JLabel mainLogoLabel = new JLabel("New label");
		//Locate and assign icon to variable
		ImageIcon mainLogoIcon = new ImageIcon("Images/mainLogo.png");
		//Resize
		Image mainLogoImage = mainLogoIcon.getImage();
		Image modifiedMainLogoImage = mainLogoImage.getScaledInstance(800, 250, java.awt.Image.SCALE_SMOOTH);
		mainLogoIcon = new ImageIcon(modifiedMainLogoImage);
		//Set Jlabel Icon To pokemon icon
		mainLogoLabel.setIcon(mainLogoIcon);
		//Jlabel Size
		mainLogoLabel.setBounds(100, 0, 800, 250);
		contentPane.add(mainLogoLabel);
		
		//Main Screen Background Image 
		//Create Jlabel
		JLabel mainBackgroundLabel = new JLabel("New label");
		//Locate and assign icon to variable
		ImageIcon mainBackgroundIcon = new ImageIcon("Images/mainBackground.png");
		//Resize
		Image mainBackgroundImage =  mainBackgroundIcon.getImage();
        Image modifiedMainBackgroundImage = mainBackgroundImage.getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH);
        mainBackgroundIcon = new ImageIcon(modifiedMainBackgroundImage);	
		//Set Jlabel Icon To Main Sreen Image/Icon
        mainBackgroundLabel.setIcon(mainBackgroundIcon);
        //Label Size
        mainBackgroundLabel.setBounds(0, 0, 1000, 700);
		contentPane.add(mainBackgroundLabel);
		
		
		
		


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			mainPokemon frame = new mainPokemon();
			frame.setVisible(true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		

	}
}
