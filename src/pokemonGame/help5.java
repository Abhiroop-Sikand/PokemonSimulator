package pokemonGame;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class help5 extends JFrame{
private JPanel contentPane;
	
	public help5() {
		//Screen and dimensions
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(787, 120, 1000, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);

		//Game Over Screen Picture 
		//Create Jlabel
		JLabel gameOverPic = new JLabel("New label");
		gameOverPic.setBounds(0, 129, 550, 505);
		//Locate and assign icon to variable
		ImageIcon gameOverPicIcon = new ImageIcon("Images/help5.png");
		//Resize
		Image gameOverPicImage =  gameOverPicIcon.getImage();
		Image modifiedGameOverPicImage = gameOverPicImage.getScaledInstance(550, 505, java.awt.Image.SCALE_SMOOTH);
		gameOverPicIcon = new ImageIcon(modifiedGameOverPicImage);	
		contentPane.setLayout(null);
		//Set Jlabel Icon To Image/Icon
		gameOverPic.setIcon(gameOverPicIcon);
		contentPane.add(gameOverPic);
		
		//Line 1 text
		JLabel text1 = new JLabel("Help 5");
		//format
		text1.setFont(new Font("Lucida Grande", Font.PLAIN, 80));
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setBounds(251, 6, 502, 127);
		contentPane.add(text1);
		
		//Line 2 text
		JLabel text2 = new JLabel("This Screen Appears When Your");
		//Format
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		text2.setBounds(550, 188, 450, 100);
		contentPane.add(text2);
		
		//Line 3 Text
		JLabel text3 = new JLabel("Pokemon Dies. If You Click \"Try Again\"");
		//Format
		text3.setHorizontalAlignment(SwingConstants.CENTER);
		text3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		text3.setBounds(550, 257, 450, 100);
		contentPane.add(text3);
		
		//Line 4 text
		JLabel text4 = new JLabel("You Will Be Taken To The Selection Screen.");
		//format
		text4.setHorizontalAlignment(SwingConstants.CENTER);
		text4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		text4.setBounds(550, 324, 450, 100);
		contentPane.add(text4);
		
		//Line 5 Text
		JLabel text5 = new JLabel("If You Click \"Main Menu\" You Will Be");
		//format
		text5.setHorizontalAlignment(SwingConstants.CENTER);
		text5.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		text5.setBounds(550, 393, 450, 100);
		contentPane.add(text5);
		
		//Line 6 text
		JLabel text6 = new JLabel("Taken To The Main Menu.");
		//format
		text6.setHorizontalAlignment(SwingConstants.CENTER);
		text6.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		text6.setBounds(550, 462, 450, 100);
		contentPane.add(text6);
		
		//back button
		JButton backButton = new JButton("BACK");
		//when pressed
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display help 4 screen
				help4 help4 = new help4();
				help4.setVisible(true);
				//hide screen
				dispose();
			}
		});
		//format
		backButton.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		backButton.setBounds(0, 646, 193, 54);
		contentPane.add(backButton);
		
		//main menu button
		JButton mainMenuButton = new JButton("MAIN MENU");
		//when pressed
		mainMenuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display main menu screen
				mainPokemon main = new mainPokemon();
				main.setVisible(true);
				//hide  screen
				dispose();
			}
		});
		//format
		mainMenuButton.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		mainMenuButton.setBounds(807, 646, 193, 54);
		contentPane.add(mainMenuButton);
		
		
		
	}
}
