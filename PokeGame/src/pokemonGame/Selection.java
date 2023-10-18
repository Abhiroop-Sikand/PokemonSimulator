package pokemonGame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.Color;

public class Selection extends JFrame {
	
	private JPanel contentPane;
	//Player Pokemon Variable
	public static int player=0;
	public Selection() {
		//Battle Screen Variable
		battleScreen battle = new battleScreen();
		
		//Selction Screen dimensions
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(787, 120, 1000, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//////////////BUTTON TO SELECT BLASTOISE
		JButton btnNewButton = new JButton("Blastoise");
		//Set font details
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 49));
		//Check if clicked
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Set player to 0, bring in battle screen transfer variable data to method "playerNum" inside battleScreen and take away selction screen
				player =0;
				battle.setVisible(true);
				battle.playerNum(player);
				dispose();
			}
		});
		btnNewButton.setBounds(20, 362, 246, 55);
		contentPane.add(btnNewButton);
		
		/////////////BUTTON TO SELECT CHARIZARD
		JButton btnCharizard = new JButton("Charizard");
		//Check if clicked
		btnCharizard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Set player to 1
				player = 1;
				//Bring in battle screen
				battle.setVisible(true);
				//Transfer variable data
				battle.playerNum(player);
				//Remove current frame/screen
				dispose();
			}
		});
		//Button font and dimensions
		btnCharizard.setFont(new Font("Lucida Grande", Font.PLAIN, 49));
		btnCharizard.setBounds(355, 362, 246, 55);
		contentPane.add(btnCharizard);
		
		///////////////BUTTON TO SELECT SNORLAX
		JButton btnSnorlax = new JButton("Snorlax");
		//Check if clicked
		btnSnorlax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//If clicked set player to 2
				player = 2;
				//bring in battle frame
				battle.setVisible(true);
				//Transfer varaible value
				battle.playerNum(player);
				//take away selction screen
				dispose();
			}
		});
		//Set font and dimesions for snoralx button
		btnSnorlax.setFont(new Font("Lucida Grande", Font.PLAIN, 49));
		btnSnorlax.setBounds(725, 362, 246, 55);
		contentPane.add(btnSnorlax);
		
		///////////BUTTON TO SELECT GIRATINA
		JButton btnGiratina = new JButton("Giratina");
		//Check if clicked
		btnGiratina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//If clicked set player to 3
				player = 3;
				//Bring in battle frame, transfer variable data
				battle.setVisible(true);
				battle.playerNum(player);
				//Take away selection frame
				dispose();
			}
		});
		//Set font and dimensions for giratina button
		btnGiratina.setFont(new Font("Lucida Grande", Font.PLAIN, 49));
		btnGiratina.setBounds(20, 630, 246, 55);
		contentPane.add(btnGiratina);
		
		///////////////BUTTON TO SELECT DIALGA
		JButton btnDialga = new JButton("Dialga");
		//Check if button is clicked
		btnDialga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//If clicked set player to 4
				player = 4;
				//Bring in battle frame, transfer variable data
				battle.setVisible(true);
				battle.playerNum(player);
				//Take away selection screen
				dispose();
			}
		});
		//Set font and dimensions for dialga button
		btnDialga.setFont(new Font("Lucida Grande", Font.PLAIN, 49));
		btnDialga.setBounds(355, 630, 246, 55);
		contentPane.add(btnDialga);
		
		////////////////BUTTON TO SELECT PALKIA
		JButton btnPalkia = new JButton("Palkia");
		//Check if clicked
		btnPalkia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//If clicked player =5
				player = 5;
				//bring in battle frame, transfer variable data
				battle.setVisible(true);
				battle.playerNum(player);
				//Takeaway selection screen
				dispose();
			}
		});
		//Set font and dimnesions for palkia button
		btnPalkia.setFont(new Font("Lucida Grande", Font.PLAIN, 49));
		btnPalkia.setBounds(725, 630, 246, 55);
		contentPane.add(btnPalkia);
		
		
		////////////////TEXT: CHOOSE YOUR POKEMON
		JLabel lblNewLabel = new JLabel("CHOOSE YOUR POKEMON");
		lblNewLabel.setForeground(Color.WHITE);
		//Set font and size
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 80));
		lblNewLabel.setBounds(6, 6, 988, 134);
		contentPane.add(lblNewLabel);
		
		//Blastoise GIF 
		//Create Jlabel
		JLabel blastoiseFront = new JLabel("New label");
		//Locate and assign gif to variable
		ImageIcon blastoiseFrontIcon = new ImageIcon("Images/BlastoiseFront.gif");
		//Resize
		Image blastoiseFrontImage =  blastoiseFrontIcon.getImage();
        Image modifiedBlastoiseFrontImage = blastoiseFrontImage.getScaledInstance(180, 180, java.awt.Image.SCALE_DEFAULT);
        blastoiseFrontIcon = new ImageIcon(modifiedBlastoiseFrontImage);	
		//Set Jlabel Icon To Blastoise GIF
        blastoiseFront.setIcon(blastoiseFrontIcon);
        //Label Size
        blastoiseFront.setBounds(38, 180, 180, 180);
		contentPane.add(blastoiseFront);
		
		//Charizard GIF 
		//Create Jlabel
		JLabel charizardFront = new JLabel("New label");
		//Locate and assign gif to variable
		ImageIcon charizardFrontIcon = new ImageIcon("Images/CharizardFront.gif");
		//Resize
		Image charizardFrontImage =  charizardFrontIcon.getImage();
        Image modifiedCharizardFrontImage = charizardFrontImage.getScaledInstance(250, 250, java.awt.Image.SCALE_DEFAULT);
        charizardFrontIcon = new ImageIcon(modifiedCharizardFrontImage);		
		//Set Jlabel Icon To Charizard GIF
        charizardFront.setIcon(charizardFrontIcon);
		//Label Size
        charizardFront.setBounds(345, 137, 250, 250);
		contentPane.add(charizardFront);
			
		
		//Snorlax GIF 
		//Create Jlabel
		JLabel snorlaxFront = new JLabel("New label");
		//Locate and assign gif to variable
		ImageIcon snorlaxFrontIcon = new ImageIcon("Images/SnorlaxFront.gif");
		//Resize
		Image snorlaxFrontImage =  snorlaxFrontIcon.getImage();
        Image modifiedSnorlaxFrontImage = snorlaxFrontImage.getScaledInstance(200, 200, java.awt.Image.SCALE_DEFAULT);
        snorlaxFrontIcon = new ImageIcon(modifiedSnorlaxFrontImage);		
		//Set Jlabel Icon To Snorlax GIF
        snorlaxFront.setIcon(snorlaxFrontIcon);
		//Label Size
        snorlaxFront.setBounds(737, 165, 200, 200);
		contentPane.add(snorlaxFront);
		
		//Giratina GIF 
		//Create Jlabel
		JLabel giratinaFront = new JLabel("New label");
		//Locate and assign gif to variable
		ImageIcon giratinaFrontIcon = new ImageIcon("Images/GiratinaFront.gif");
		//Resize
		Image giratinaFrontImage =  giratinaFrontIcon.getImage();
		Image modifiedGiratinaFrontImage = giratinaFrontImage.getScaledInstance(230, 230, java.awt.Image.SCALE_DEFAULT);
		giratinaFrontIcon = new ImageIcon(modifiedGiratinaFrontImage);		
		//Set Jlabel Icon To Giratina GIF
		giratinaFront.setIcon(giratinaFrontIcon);
		//Label Size
		giratinaFront.setBounds(20, 405, 230, 230);
		contentPane.add(giratinaFront);
		
		//Dialga GIF 
		//Create Jlabel
		JLabel dialgaFront = new JLabel("New label");
		//Locate and assign gif to variable
		ImageIcon dialgaFrontIcon = new ImageIcon("Images/DialgaFront.gif");
		//Resize
		Image dialgaFrontImage =  dialgaFrontIcon.getImage();
		Image modifiedDialgaFrontImage = dialgaFrontImage.getScaledInstance(200, 200, java.awt.Image.SCALE_DEFAULT);
		dialgaFrontIcon = new ImageIcon(modifiedDialgaFrontImage);		
		//Set Jlabel Icon To Dialga GIF
		dialgaFront.setIcon(dialgaFrontIcon);
		//Label Size
		dialgaFront.setBounds(380, 430, 200, 200);
		contentPane.add(dialgaFront);
		
		//Palkia GIF 
		//Create Jlabel
		JLabel palkiaFront = new JLabel("New label");
		//Locate and assign gif to variable
		ImageIcon palkiaFrontIcon = new ImageIcon("Images/PalkiaFront.gif");
		//Resize
		Image palkiaFrontImage =  palkiaFrontIcon.getImage();
		Image modifiedPalkiaFrontImage = palkiaFrontImage.getScaledInstance(230, 230, java.awt.Image.SCALE_DEFAULT);
		palkiaFrontIcon = new ImageIcon(modifiedPalkiaFrontImage);		
		//Set Jlabel Icon To Palkia GIF
		palkiaFront.setIcon(palkiaFrontIcon);
		//Label Size
		palkiaFront.setBounds(720, 420, 230, 230);
		contentPane.add(palkiaFront);
		//palkiaFront.setVisible(false);
		
		//Selection Screen Background Image 
		//Create Jlabel
		JLabel selectionBackgroundLabel = new JLabel("New label");
		//Locate and assign icon to variable
		ImageIcon selectionBackgroundIcon = new ImageIcon("Images/selectionBackground.png");
		//Resize
		Image selectionBackgroundImage =  selectionBackgroundIcon.getImage();
        Image modifiedSelectionBackgroundImage = selectionBackgroundImage.getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH);
        selectionBackgroundIcon = new ImageIcon(modifiedSelectionBackgroundImage);	
		//Set Jlabel Icon To Selction Sreen Image/Icon
        selectionBackgroundLabel.setIcon(selectionBackgroundIcon);
        //Label Size
        selectionBackgroundLabel.setBounds(0, 0, 1000, 700);
		contentPane.add(selectionBackgroundLabel);
		
		//Stop from changing screen size
		setResizable(false);
		
	}

	
}
