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

public class help4 extends JFrame{
private JPanel contentPane;
	
	public help4() {
		//Screen and dimensions
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(787, 120, 1000, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);

		//Shop Screen Picture 
		//Create Jlabel
		JLabel shopPic = new JLabel("New label");
		shopPic.setBounds(0, 129, 550, 505);
		//Locate and assign icon to variable
		ImageIcon shopPicIcon = new ImageIcon("Images/help4.png");
		//Resize
		Image shopPicImage =  shopPicIcon.getImage();
		Image modifiedShopPicImage = shopPicImage.getScaledInstance(550, 505, java.awt.Image.SCALE_SMOOTH);
		shopPicIcon = new ImageIcon(modifiedShopPicImage);	
		contentPane.setLayout(null);
		//Set Jlabel Icon To Image/Icon
		shopPic.setIcon(shopPicIcon);
		contentPane.add(shopPic);
		
		//line 1 text
		JLabel line1 = new JLabel("Help 4");
		//format
		line1.setFont(new Font("Lucida Grande", Font.PLAIN, 80));
		line1.setHorizontalAlignment(SwingConstants.CENTER);
		line1.setBounds(251, 6, 502, 127);
		contentPane.add(line1);
		
		//line 2 text
		JLabel line2 = new JLabel("This Is The Item Shop. The Four");
		//format
		line2.setHorizontalAlignment(SwingConstants.CENTER);
		line2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		line2.setBounds(550, 188, 450, 100);
		contentPane.add(line2);
		
		//line 3 text
		JLabel line3 = new JLabel("Potions Will Heal You Pokemons");
		//format
		line3.setHorizontalAlignment(SwingConstants.CENTER);
		line3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		line3.setBounds(550, 257, 450, 100);
		contentPane.add(line3);
		
		//line 4 text
		JLabel line4 = new JLabel("Health, To Buy Them You Must Pay");
		//format
		line4.setHorizontalAlignment(SwingConstants.CENTER);
		line4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		line4.setBounds(550, 324, 450, 100);
		contentPane.add(line4);
		
		//line 5 text
		JLabel line5 = new JLabel("The Listed Amount. You Start With");
		//format
		line5.setHorizontalAlignment(SwingConstants.CENTER);
		line5.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		line5.setBounds(550, 393, 450, 100);
		contentPane.add(line5);
		
		//line 6 text
		JLabel line6 = new JLabel("75 Coins and gain 90 Per Enemy Defeated");
		//format
		line6.setHorizontalAlignment(SwingConstants.CENTER);
		line6.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		line6.setBounds(550, 462, 450, 100);
		contentPane.add(line6);
		
		//back button
		JButton btnBack = new JButton("BACK");
		//when pressed
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display help 3 screen
				help3 help3 = new help3();
				help3.setVisible(true);
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
				//Display help 5 screen
				help5 help5 = new help5();
				help5.setVisible(true);
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
