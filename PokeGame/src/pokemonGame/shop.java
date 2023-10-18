package pokemonGame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;

public class shop extends JFrame{
	private JPanel contentPane;
	
	//Method for shop screen
	public shop() {
		//Screen and dimensions
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(787, 120, 1000, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		
		
		
	}
	
	//Method for changing money and health with potions
	public void moneyAndHealth() {
		//New way of getting variables from classes
		//Battle scren
		battleScreen obj1 = new battleScreen();
		//Selection
		Selection obj2 = new Selection();
		
		//Stop from changing size mid game
		setResizable(false);
		
		//Text for Item shop
				JLabel lblNewLabel = new JLabel("ITEM SHOP");
				//font
				lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
				lblNewLabel.setBounds(319, 17, 333, 93);
				contentPane.add(lblNewLabel);
				
				//Text for amount of money left
				JLabel lblNewLabel_1 = new JLabel(obj1.money + " Coins");
				//Set font
				lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
				lblNewLabel_1.setBounds(777, 626, 184, 54);
				contentPane.add(lblNewLabel_1);
				
				//Button for +25hp potion
				JButton btnNewButton = new JButton("+25HP, Cost=50");
				//Check if clicked
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Check if player has enough money
						if(obj1.money>=50) {
							//Take away money
							obj1.money = obj1.money - 50;
							//Add to health
							obj1.playerHealth = obj1.playerHealth +25;
							//Check if health went over 100, then bring back down to 100
							if(obj1.playerHealth>100) {
								obj1.playerHealth = 100;
							}
							 // Change text to display new money left
							 lblNewLabel_1.setText(obj1.money +" coins"); 
						}
					}
				});
				btnNewButton.setBounds(262, 252, 141, 99);
				contentPane.add(btnNewButton);
				
				//Button for +50HP potion
				JButton btnhpCost = new JButton("+50HP, Cost=100");
				//Check if clicked
				btnhpCost.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Check if enough money
						if(obj1.money>=100) {
							//Take away cost
							obj1.money = obj1.money - 100;
							//Add health
							obj1.playerHealth = obj1.playerHealth +50;
							//Check if health went over 100, bring back down to 100
							if(obj1.playerHealth>100) {
								obj1.playerHealth = 100;
							}
							//Update text for new wallet/money left
							lblNewLabel_1.setText(obj1.money +" coins"); 
						}
						
					}
				});
				btnhpCost.setBounds(591, 252, 141, 99);
				contentPane.add(btnhpCost);
				
				//Button for +75HP potion
				JButton btnhpCost_1 = new JButton("+75HP, Cost=150");
				//Check if clicked
				btnhpCost_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Check if player has enough money
						if(obj1.money>=150) {
							//Take away cost
							obj1.money = obj1.money - 150;
							//Add to health
							obj1.playerHealth = obj1.playerHealth +75;
							//Check if player health went over 100, bring back down to 100
							if(obj1.playerHealth>100) {
								obj1.playerHealth = 100;
							}
							//update text for new wallen/money left
							lblNewLabel_1.setText(obj1.money +" coins"); 
						}
					}
				});
				btnhpCost_1.setBounds(262, 502, 141, 99);
				contentPane.add(btnhpCost_1);
				
				//Button to get full hp
				JButton btnFullHpCost = new JButton("FULL HP, Cost=200");
				//Check if cliked
				btnFullHpCost.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//check if player has enough money
						if(obj1.money>=200) {
							//takeaway cost
							obj1.money = obj1.money - 200;
							//set health to 100
							obj1.playerHealth = 100;
							//Update new balance
							lblNewLabel_1.setText(obj1.money +" coins"); 
						}
					}
				});
				btnFullHpCost.setBounds(591, 502, 141, 99);
				contentPane.add(btnFullHpCost);
				
				//Back button to go back to battle screen
				JButton btnNewButton_1 = new JButton("BACK");
				//Chek if clicked
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Battle screen variable
						battleScreen battle = new battleScreen();
						//Displaye battle screen
						battle.setVisible(true);
						//call playerNum method 
						battle.playerNum(obj2.player);
						//Hide shop screen
						dispose();
					}
				});
				//Set font
				btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
				btnNewButton_1.setBounds(55, 643, 117, 37);
				contentPane.add(btnNewButton_1);
			   
				//25HP potion 
				//Create Jlabel
				JLabel twentyFivePotionLabel = new JLabel("New label");
				//Locate and assign icon to variable
				ImageIcon twentyFivePotionIcon = new ImageIcon("Images/25potion.png");
				//Resize
				Image twentyFivePotionImage =  twentyFivePotionIcon.getImage();
				Image modifiedTwentyFivePotionImage = twentyFivePotionImage.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
				twentyFivePotionIcon = new ImageIcon(modifiedTwentyFivePotionImage);	
				//Set Jlabel Icon To Image/Icon
				twentyFivePotionLabel.setIcon(twentyFivePotionIcon);
		        //Label Size
				twentyFivePotionLabel.setBounds(150, 250, 100, 100);
				contentPane.add(twentyFivePotionLabel);
				

				//50HP potion 
				//Create Jlabel
				JLabel fiftyPotionLabel = new JLabel("New label");
				//Locate and assign icon to variable
				ImageIcon fiftyPotionIcon = new ImageIcon("Images/50potion.png");
				//Resize
				Image fiftyPotionImage =  fiftyPotionIcon.getImage();
				Image modifiedFiftyPotionImage = fiftyPotionImage.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
				fiftyPotionIcon = new ImageIcon(modifiedFiftyPotionImage);	
				//Set Jlabel Icon To Image/Icon
				fiftyPotionLabel.setIcon(fiftyPotionIcon);
		        //Label Size
				fiftyPotionLabel.setBounds(750, 250, 100, 100);
				contentPane.add(fiftyPotionLabel);


				//75HP potion 
				//Create Jlabel
				JLabel seventyFivePotionLabel = new JLabel("New label");
				//Locate and assign icon to variable
				ImageIcon seventyFivePotionIcon = new ImageIcon("Images/75potion.png");
				//Resize
				Image seventyFivePotionImage =  seventyFivePotionIcon.getImage();
				Image modifiedSeventyFivePotionImage = seventyFivePotionImage.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
				seventyFivePotionIcon = new ImageIcon(modifiedSeventyFivePotionImage);	
				//Set Jlabel Icon To Image/Icon
				seventyFivePotionLabel.setIcon(seventyFivePotionIcon);
		        //Label Size
				seventyFivePotionLabel.setBounds(150, 500, 100, 100);
				contentPane.add(seventyFivePotionLabel);
				

				//Max HP potion 
				//Create Jlabel
				JLabel maxPotionLabel = new JLabel("New label");
				//Locate and assign icon to variable
				ImageIcon maxPotionIcon = new ImageIcon("Images/maxPotion.png");
				//Resize
				Image maxPotionImage =  maxPotionIcon.getImage();
				Image modifiedMaxPotionImage = maxPotionImage.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
				maxPotionIcon = new ImageIcon(modifiedMaxPotionImage);	
				//Set Jlabel Icon To Image/Icon
				maxPotionLabel.setIcon(maxPotionIcon);
		        //Label Size
				maxPotionLabel.setBounds(750, 500, 100, 100);
				contentPane.add(maxPotionLabel);
				
				
				
				//shop Background label
				JLabel shopBackground = new JLabel("");
				//Set colour
			    shopBackground.setBackground(new Color(0, 204, 204));
			    //Dimensions
				shopBackground.setBounds(0, 0, 1000, 700);
				//Make opaque (so it can be seen)
				shopBackground.setOpaque(true);
				contentPane.add(shopBackground);

	}
}
