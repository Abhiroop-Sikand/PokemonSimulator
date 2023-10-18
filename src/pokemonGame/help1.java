package pokemonGame;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class help1 extends JFrame{
	private JPanel contentPane;
	
	public help1() {
		//Screen and dimensions
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(787, 120, 1000, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);

		//Main Screen Picture 
		//Create Jlabel
		JLabel mainPic = new JLabel("New label");
		mainPic.setBounds(0, 129, 550, 505);
		//Locate and assign icon to variable
		ImageIcon mainPicIcon = new ImageIcon("Images/help1.png");
		//Resize
		Image mainPicImage =  mainPicIcon.getImage();
		Image modifiedMainPicImage = mainPicImage.getScaledInstance(550, 505, java.awt.Image.SCALE_SMOOTH);
		mainPicIcon = new ImageIcon(modifiedMainPicImage);	
		contentPane.setLayout(null);
		//Set Jlabel Icon To Image/Icon
		mainPic.setIcon(mainPicIcon);
		contentPane.add(mainPic);
		
		//line 1 text
		JLabel line1text = new JLabel("Help 1");
		line1text.setFont(new Font("Lucida Grande", Font.PLAIN, 80));
		//format
		line1text.setHorizontalAlignment(SwingConstants.CENTER);
		line1text.setBounds(251, 6, 502, 127);
		contentPane.add(line1text);
		
		//line 2 text
		JLabel line2text = new JLabel("The First Thing To Do");
		//format
		line2text.setHorizontalAlignment(SwingConstants.CENTER);
		line2text.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		line2text.setBounds(550, 208, 450, 100);
		contentPane.add(line2text);
		
		//line 3 text
		JLabel line3text = new JLabel("Is Click The Play Button");
		//format
		line3text.setHorizontalAlignment(SwingConstants.CENTER);
		line3text.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		line3text.setBounds(550, 277, 450, 100);
		contentPane.add(line3text);
		
		//line 4 text
		JLabel line4text = new JLabel("When At The Main Menu");
		//format
		line4text.setHorizontalAlignment(SwingConstants.CENTER);
		line4text.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		line4text.setBounds(550, 344, 450, 100);
		contentPane.add(line4text);
		
		//back button
		JButton btnBack = new JButton("BACK");
		//when pressed
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display main menu screen
				mainPokemon main = new mainPokemon();
				main.setVisible(true);
				//hide screen
				dispose();
			}
		});
		//format
		btnBack.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnBack.setBounds(0, 646, 193, 54);
		contentPane.add(btnBack);
		
		//next button
		JButton btnNext = new JButton("NEXT");
		//when pressed
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display help 2 screen
				help2 help2 = new help2();
				help2.setVisible(true);
				//hide screen
				dispose();
			}
		});
		//format
		btnNext.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnNext.setBounds(807, 646, 193, 54);
		contentPane.add(btnNext);
		
		
		
	}
}
