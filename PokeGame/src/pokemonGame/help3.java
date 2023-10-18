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

public class help3 extends JFrame{
private JPanel contentPane;
	
	public help3() {
		//Screen and dimensions
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(787, 120, 1000, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);

		//Battle Screen Picture 
		//Create Jlabel
		JLabel battlePic = new JLabel("New label");
		battlePic.setBounds(0, 129, 550, 505);
		//Locate and assign icon to variable
		ImageIcon battlePicIcon = new ImageIcon("Images/help3.png");
		//Resize
		Image battlePicImage =  battlePicIcon.getImage();
		Image modifiedBattlePicImage = battlePicImage.getScaledInstance(550, 505, java.awt.Image.SCALE_SMOOTH);
		battlePicIcon = new ImageIcon(modifiedBattlePicImage);	
		contentPane.setLayout(null);
		//Set Jlabel Icon To Image/Icon
		battlePic.setIcon(battlePicIcon);
		contentPane.add(battlePic);
		
		//line 1 text
		JLabel line1text = new JLabel("Help 3");
		//format
		line1text.setFont(new Font("Lucida Grande", Font.PLAIN, 80));
		line1text.setHorizontalAlignment(SwingConstants.CENTER);
		line1text.setBounds(251, 6, 502, 127);
		contentPane.add(line1text);
		
		//line 2 text
		JLabel line2text = new JLabel("This Is The Battle Screen, Click An Attack");
		//format
		line2text.setHorizontalAlignment(SwingConstants.CENTER);
		line2text.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		line2text.setBounds(550, 188, 450, 100);
		contentPane.add(line2text);
		
		//line 3 text
		JLabel line3text = new JLabel("Name/Button To Do An Attck. A Box Will");
		//format
		line3text.setHorizontalAlignment(SwingConstants.CENTER);
		line3text.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		line3text.setBounds(550, 257, 450, 100);
		contentPane.add(line3text);
		
		//line 4 text
		JLabel line4text = new JLabel("Appear At The Top Left To Notify You Of");
		//format
		line4text.setHorizontalAlignment(SwingConstants.CENTER);
		line4text.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		line4text.setBounds(550, 324, 450, 100);
		contentPane.add(line4text);
		
		//line 5 text
		JLabel line5text = new JLabel("Your Move And Then The Enemies Move.");
		//format
		line5text.setHorizontalAlignment(SwingConstants.CENTER);
		line5text.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		line5text.setBounds(550, 393, 450, 100);
		contentPane.add(line5text);
		
		//line 6 text
		JLabel line6text = new JLabel("Click The Shop Button Near The Bottom");
		//format
		line6text.setHorizontalAlignment(SwingConstants.CENTER);
		line6text.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		line6text.setBounds(550, 462, 450, 100);
		contentPane.add(line6text);
		
		//line 7 text
		JLabel line7text = new JLabel("Right To Go To The Shop.");
		//format
		line7text.setHorizontalAlignment(SwingConstants.CENTER);
		line7text.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		line7text.setBounds(550, 531, 450, 100);
		contentPane.add(line7text);
		
		//Back button
		JButton btnBack = new JButton("BACK");
		//when pressed
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display help 2 screen
				help2 help2 = new help2();
				help2.setVisible(true);
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
				//Display help 4 screen
				help4 help4 = new help4();
				help4.setVisible(true);
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
