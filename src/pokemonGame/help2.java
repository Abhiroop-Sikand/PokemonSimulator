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

public class help2 extends JFrame{
private JPanel contentPane;
	
	public help2() {
		//Screen and dimensions
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(787, 120, 1000, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);

		//Selection Screen Picture 
		//Create Jlabel
		JLabel selectionPic = new JLabel("New label");
		selectionPic.setBounds(0, 129, 550, 505);
		//Locate and assign icon to variable
		ImageIcon selectionPicIcon = new ImageIcon("Images/help2.png");
		//Resize
		Image selectionPicImage =  selectionPicIcon.getImage();
		Image modifiedSelectionPicImage = selectionPicImage.getScaledInstance(550, 505, java.awt.Image.SCALE_SMOOTH);
		selectionPicIcon = new ImageIcon(modifiedSelectionPicImage);	
		contentPane.setLayout(null);
		//Set Jlabel Icon To Image/Icon
		selectionPic.setIcon(selectionPicIcon);
		contentPane.add(selectionPic);
		
		//line 1 text
		JLabel line1text = new JLabel("Help 2");
		//format
		line1text.setFont(new Font("Lucida Grande", Font.PLAIN, 80));
		line1text.setHorizontalAlignment(SwingConstants.CENTER);
		line1text.setBounds(251, 6, 502, 127);
		contentPane.add(line1text);
		
		//line 2 text
		JLabel line2text = new JLabel("You Will Be Re-Directed");
		//format
		line2text.setHorizontalAlignment(SwingConstants.CENTER);
		line2text.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		line2text.setBounds(550, 208, 450, 100);
		contentPane.add(line2text);
		
		//line 3 text
		JLabel line3text = new JLabel("Here. Inorder To Select");
		//format
		line3text.setHorizontalAlignment(SwingConstants.CENTER);
		line3text.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		line3text.setBounds(550, 277, 450, 100);
		contentPane.add(line3text);
		
		//line 4 text
		JLabel line4text = new JLabel("A Pokemon Click On The");
		//format
		line4text.setHorizontalAlignment(SwingConstants.CENTER);
		line4text.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		line4text.setBounds(550, 344, 450, 100);
		contentPane.add(line4text);
		
		//line 5 text
		JLabel line5text = new JLabel("Name To Choose It.");
		//format
		line5text.setHorizontalAlignment(SwingConstants.CENTER);
		line5text.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		line5text.setBounds(550, 413, 450, 100);
		contentPane.add(line5text);
		
		//back button
		JButton btnNewButton = new JButton("BACK");
		//when pressed
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display help 1 screen
				help1 help1 = new help1();
				help1.setVisible(true);
				//hide screen
				dispose();
			}
		});
		//format
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnNewButton.setBounds(0, 646, 193, 54);
		contentPane.add(btnNewButton);
		
		//next button
		JButton btnNext = new JButton("NEXT");
		//when pressed
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display help 3 screen
				help3 help3 = new help3();
				help3.setVisible(true);
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
