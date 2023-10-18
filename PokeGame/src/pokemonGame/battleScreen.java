package pokemonGame;

import java.util.Random;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.SwingConstants;

public class battleScreen extends JFrame {
//	ImageIcon battleBackgroundIcon = new ImageIcon("Images/battleBackground.png");
//	Image battleBackgroundImage =  battleBackgroundIcon.getImage();

	      	   
	private JPanel contentPane;
	// int for        Player health     comp pokemon     comp health    comp attack     score     coins/money/currency   count to identitfy start of new game    player level comp level
  	public static int playerHealth=100, compPokemon,     compHealth=0,   compMove,      score,    money=75  ,            count=0,                                playerLevel, compLevel;
  	//Boolean to make sure correct turns happen
	public static boolean playerTurn = true;
	//String array for pokemon name
	public static String[] pokeName = {"Blastoise", "Charizard", "Snorlax", "Giratina", "Dialga", "Palkia"};
	//String array for pokemon 25 damage moves
	public static String[] attack25 = {"Tail Whip", "Dragon Claw", "Body Slam", "Draco Meteor", "Dragon Pulse", "Spacial Rend"};
	//String array for pokemon 20 damage moves
	public static String[] attack20 = {"Flash Cannon", "Blaze Punch", "Bulldoze", "Shadow Force", "Fire Blast", "Focus Blast"};
	//String array for pokemon 15 damage moves
	public static String[] attack15 = {"Tackle", "Fire Fang", "Punch", "Iron Tail", "Shock Wave", "Blizzard"};
	//String array for pokemon 10 damage moves
	public static String[] attack10 = {"Ice Punch", "Slash", "Brick Break", "Thunder Bolt", "Dragon Tail", "Dragon Claw"};
	//To generate random levels
	Random LevelRand = new Random();
	
			//Blastoise    Tail Whip=25      Flash Cannon=20     Tackle=15            Ice Punch=10
			//Charizard    Dragon Claw=25    Blaze Punch=20    Fire Fang=15         Slash=10
			//Snorlax      Body Slam=25      Bulldoze=20         Punch=15             Brick Break=10
			//Giratina     Draco Meteor=25   Shadow Force=20     Iron Tail=15         Thunder Bolt=10
			//Dialga       Dragon Pulse=25   Fire Blast=20       Shock Wave=15        Dragon Tail=10
			//Palkia       Spacial Rend=25   Focus Blast=20      Blizzard=15          Dragon Claw=10

	
	//Create Jlabel for computer Pokemon Sprite
	JLabel compPokemonSprite = new JLabel("New label");
	//Create Jlabel for player Pokemon Sprite
	JLabel playerPokemonSprite = new JLabel("New label");
	//button that says what player move was done
	JButton boxText1 = new JButton("");
	//button that says what comp move is done
	JButton compboxText1 = new JButton("");
	//label to inform user how to move on
	JLabel boxText2 = new JLabel("Click This Box To Continue");
	//label to contain box image for move notification
	JLabel moveBox = new JLabel("");
	//Label for player pokemon name and level
	JLabel playerNameAndLevel = new JLabel("");
	//Lavel for player pokemon health
	JLabel playerHealthStatus = new JLabel("");
	//Label for comp pokemon name and level
	JLabel compNameAndLevel = new JLabel("");
	//label for player pokeon health
	JLabel compHealthStatus = new JLabel("");
	
	public  battleScreen() {
		//Battle Scrren, dimensions
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(787, 120, 1000, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//boxText2 label formatting
		//font
		boxText2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		//text align
		boxText2.setVerticalAlignment(SwingConstants.BOTTOM);
		boxText2.setHorizontalAlignment(SwingConstants.CENTER);
		//size
		boxText2.setBounds(25, 35, 512, 130);
		contentPane.add(boxText2);
		
		//boxText1 button formatting
		//font
		boxText1.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		//text align
		boxText1.setHorizontalAlignment(SwingConstants.CENTER);
		//size
		boxText1.setBounds(25, 45, 512, 130);
		contentPane.add(boxText1);
		//If button clicked hide image text and button and call method for computerr move
		boxText1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boxText1.setVisible(false);
				boxText2.setVisible(false);
				moveBox.setVisible(false);
				compAttack();
				
				
			}
		});
		
		//compBoxText1 button formatting
		//font
		compboxText1.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		//align
		compboxText1.setHorizontalAlignment(SwingConstants.CENTER);
		//size
		compboxText1.setBounds(25, 45, 512, 130);
		contentPane.add(compboxText1);
		//If button clicked hide image text and button and set player turn as to true
		compboxText1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				compboxText1.setVisible(false);
				boxText2.setVisible(false);
				moveBox.setVisible(false);
				playerTurn=true;
				
				
			}
		});
		
		
		//load box2.png and set as icon
		ImageIcon moveBoxIcon = new ImageIcon("Images/box2.png");
		moveBox.setIcon(moveBoxIcon);
		//size
		moveBox.setBounds(25, 45, 512, 130);
		contentPane.add(moveBox);
		
		//Hide the labels, and buttons
		boxText1.setVisible(false);
		compboxText1.setVisible(false);
		boxText2.setVisible(false);
		moveBox.setVisible(false);
		
		//Format playerNameAndLevel and create size
		playerNameAndLevel.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		playerNameAndLevel.setVerticalAlignment(SwingConstants.TOP);
		playerNameAndLevel.setHorizontalAlignment(SwingConstants.CENTER);
		playerNameAndLevel.setBounds(65, 305, 255, 65);
		contentPane.add(playerNameAndLevel);

		//Format playerHealthStatus and create size
		playerHealthStatus.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		playerHealthStatus.setVerticalAlignment(SwingConstants.BOTTOM);
		playerHealthStatus.setHorizontalAlignment(SwingConstants.CENTER);
		playerHealthStatus.setBounds(65, 295, 255, 65);
		contentPane.add(playerHealthStatus);

		//Format compNameAndLevel and create size
		compNameAndLevel.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		compNameAndLevel.setVerticalAlignment(SwingConstants.TOP);
		compNameAndLevel.setHorizontalAlignment(SwingConstants.CENTER);
		compNameAndLevel.setBounds(700, 155, 255, 65);
		contentPane.add(compNameAndLevel);

		//Format compHealthStatus and create size
		compHealthStatus.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		compHealthStatus.setVerticalAlignment(SwingConstants.BOTTOM);
		compHealthStatus.setHorizontalAlignment(SwingConstants.CENTER);
		compHealthStatus.setBounds(700, 145, 255, 65);
		contentPane.add(compHealthStatus);
		
		//Label to contain box1 for player stats
		JLabel playerHealthBox = new JLabel("New label");
		//set image as icon for playerHealthBox
		ImageIcon playerHealthBoxIcon = new ImageIcon("Images/box1.png");
		playerHealthBox.setIcon(playerHealthBoxIcon);
		//size
		playerHealthBox.setBounds(65, 300, 255, 65);
		contentPane.add(playerHealthBox);
		
		//label to contain box1 for computer stats
		JLabel compHealthBox = new JLabel("New label");
		//set image as icon for compHealthBox
		ImageIcon compHealthBoxIcon = new ImageIcon("Images/box1.png");
		compHealthBox.setIcon(compHealthBoxIcon);
		//size
		compHealthBox.setBounds(700, 150, 255, 65);
		contentPane.add(compHealthBox);
		
	}
	
	
	//Method for Button and reciveing player number from selection screen
	public void playerNum (int player) {
		//Stop from changin screen size while running
		setResizable(false);
		
		//If statment that only happens at start of everynew game
		 if(count ==0) {
		//generate a random opposing/computer pokemon
		Random compPoke = new Random();
        compPokemon =compPoke.nextInt(6);
        //Set computer health to 100
        compHealth = 100;
        //generate random levels for both pokemon
        playerLevel =1+LevelRand.nextInt(100);
        compLevel =1+LevelRand.nextInt(100);
        count = 1;
		 }
		 	
		 	//change text for player stats
			playerNameAndLevel.setText(pokeName[player]+" lv. "+playerLevel);
			playerHealthStatus.setText("HP "+playerHealth+"/100");
	        
			//change text for computer stats
			compNameAndLevel.setText(pokeName[compPokemon]+" lv. "+compLevel);
			compHealthStatus.setText("HP "+compHealth+"/100");
			
        //////SHOP BUTTON
        JButton btnNewButton = new JButton("SHOP");
        //Check if clicked
		btnNewButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				//if clicked and it is players turn
				if(playerTurn==true) {
				System.out.println(money +" "+ playerHealth);
				//If clicked make shope screen variable
				shop shop = new shop();
				//Bring in shop screen
				shop.setVisible(true);
				//Call method in shop class
				shop.moneyAndHealth();
				//Hide battle screen
				dispose();
				}
			}
		});
		btnNewButton.setBounds(767, 622, 72, 72);
		contentPane.add(btnNewButton);
        
			
			/////////MOVE 25 DAMAGE
			JButton btnAttack25 = new JButton(attack25[player]);
			//Set font
			btnAttack25.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
			//check if clicked
			btnAttack25.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//if clicked and it is players turn
					if(playerTurn==true) {
					//Take away 25 health from computer
					compHealth = compHealth - 25;
					//Show neccesary images/boxes/buttons
					boxText1.setVisible(true);
					boxText2.setVisible(true);
					moveBox.setVisible(true);
					//change computer health
					compHealthStatus.setText("HP "+compHealth+"/100");
					//display what move was done
					boxText1.setText("Your "+pokeName[player]+" Used "+attack25[player]);
					//set player turn to false
					playerTurn=false;

				}
				}
			});
			btnAttack25.setBounds(681, 554, 202, 60);
			contentPane.add(btnAttack25);
			
			///////////MOVE 20 DAMAGE
			JButton btnAttack20 = new JButton(attack20[player]);
			//Set font
			btnAttack20.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
			//Check if clicked
			btnAttack20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//Check if player turn
					if(playerTurn==true) {
					//Take away 20 from compHealth
					compHealth = compHealth - 20;
					compHealthStatus.setText("HP "+compHealth+"/100");
					//Output move done
					boxText1.setVisible(true);
					boxText2.setVisible(true);
					moveBox.setVisible(true);
					boxText1.setText("Your "+pokeName[player]+" Used "+attack20[player]);
					//set player turn to false
					playerTurn=false;

					}
				}
			});
			btnAttack20.setBounds(527, 482, 202, 60);
			contentPane.add(btnAttack20);
			
			//////////MOVE 15 DAMAGE
			JButton btnAttack15 = new JButton(attack15[player]);
			//Set font
			btnAttack15.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
			//Check if clicked
			btnAttack15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//If player turn is true
					if(playerTurn==true) {
					//Take away 15 from player health
					compHealth = compHealth - 15;
					compHealthStatus.setText("HP "+compHealth+"/100");
					//output move done/details
					boxText1.setVisible(true);
					boxText2.setVisible(true);
					moveBox.setVisible(true);
					boxText1.setText("Your "+pokeName[player]+" Used "+attack15[player]);
					//set player turn to false
					playerTurn=false;

					}
				}
			});
			btnAttack15.setBounds(376, 554, 202, 60);
			contentPane.add(btnAttack15);
			
			//////////MOVE 10 DAMAGE
			JButton btnAttack10 = new JButton(attack10[player]);
			//Set font
			btnAttack10.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
			//Check if clicked
			btnAttack10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//check if player turn
					if(playerTurn==true) {
					//Take away 10 from player health
					compHealth = compHealth - 10;
					compHealthStatus.setText("HP "+compHealth+"/100");
					//Ouput move done/details
					boxText1.setVisible(true);
					boxText2.setVisible(true);
					moveBox.setVisible(true);
					boxText1.setText("Your "+pokeName[player]+" Used "+attack10[player]);
					//set player turn to false
					playerTurn=false;

					}
				}
			});
			btnAttack10.setBounds(527, 622, 202, 60);
			contentPane.add(btnAttack10);
			
			///JLabel compPokemonSprite
			//Locate and assign gif to variable
			ImageIcon compPokemonSpriteIcon = new ImageIcon("Images/"+pokeName[compPokemon]+"Front.gif");
			//Resize
			Image compPokemonSpriteImage =  compPokemonSpriteIcon.getImage();
	        Image modifiedCompPokemonSpriteImage = compPokemonSpriteImage.getScaledInstance(200, 200, java.awt.Image.SCALE_DEFAULT);
	        compPokemonSpriteIcon = new ImageIcon(modifiedCompPokemonSpriteImage);	
			//Set Jlabel Icon To  GIF
	        compPokemonSprite.setIcon(compPokemonSpriteIcon);
	        //Label Size
	        compPokemonSprite.setBounds(765, 209, 205, 205);
			contentPane.add(compPokemonSprite);
			
			///JLabel playerPokemonSprite
			//Locate and assign gif to variable
			ImageIcon playerPokemonSpriteIcon = new ImageIcon("Images/"+pokeName[player]+"Back.gif");
			//Resize
			Image playerPokemonSpriteImage =  playerPokemonSpriteIcon.getImage();
			Image modifiedPlayerPokemonSpriteImage = playerPokemonSpriteImage.getScaledInstance(400, 400, java.awt.Image.SCALE_DEFAULT);
			//If statment to change gif size depending on which pokemon the player choses
	        if(player==0) {
	        	 modifiedPlayerPokemonSpriteImage = playerPokemonSpriteImage.getScaledInstance(450, 450, java.awt.Image.SCALE_DEFAULT);
	        }
	        else if(player==1) {
		         modifiedPlayerPokemonSpriteImage = playerPokemonSpriteImage.getScaledInstance(425, 425, java.awt.Image.SCALE_DEFAULT);
	        }
	        else if(player==2) {
		         modifiedPlayerPokemonSpriteImage = playerPokemonSpriteImage.getScaledInstance(300, 300, java.awt.Image.SCALE_DEFAULT);
	        }
	        else if(player==3) {
		         modifiedPlayerPokemonSpriteImage = playerPokemonSpriteImage.getScaledInstance(350, 350, java.awt.Image.SCALE_DEFAULT);
	        }
	        else if(player==4) {
		         modifiedPlayerPokemonSpriteImage = playerPokemonSpriteImage.getScaledInstance(285, 285, java.awt.Image.SCALE_DEFAULT);
	        }
	        else if(player==5) {
		         modifiedPlayerPokemonSpriteImage = playerPokemonSpriteImage.getScaledInstance(280, 280, java.awt.Image.SCALE_DEFAULT);

	        }
	        playerPokemonSpriteIcon = new ImageIcon(modifiedPlayerPokemonSpriteImage);	
			//Set Jlabel Icon To  GIF
	        playerPokemonSprite.setIcon(playerPokemonSpriteIcon);
	        //If Statments to set Label Size depending on which player pokemon is chosen
	        if(player==0) {
	        	playerPokemonSprite.setBounds(-25, 300, 450, 450);
	        }
	        else if(player==1) {
	        	playerPokemonSprite.setBounds(-25, 250, 425, 425);
	        }
	        else if(player==2) {
	        	playerPokemonSprite.setBounds(50, 350, 300, 300);
	        }
	        else if(player==3) {
	        	playerPokemonSprite.setBounds(20, 325, 350, 350);
	        }
	        else if(player==4) {
	        	playerPokemonSprite.setBounds(25, 375, 285, 285);
	        }
	        else if(player==5) {
	        	playerPokemonSprite.setBounds(55, 400, 280, 280);

	        }
			contentPane.add(playerPokemonSprite);
			
			//Battle Screen Background Image 
			//Create Jlabel
			JLabel battleBackgroundLabel = new JLabel("New label");
			//Locate and assign icon to variable
			ImageIcon battleBackgroundIcon = new ImageIcon("Images/battleBackground.png");
			//Resize
			Image battleBackgroundImage =  battleBackgroundIcon.getImage();
	        Image modifiedBattleBackgroundImage = battleBackgroundImage.getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH);
	        battleBackgroundIcon = new ImageIcon(modifiedBattleBackgroundImage);	
			//Set Jlabel Icon To Battle Sreen Image/Icon
	        battleBackgroundLabel.setIcon(battleBackgroundIcon);
	        //Label Size
	        battleBackgroundLabel.setBounds(0, 0, 1000, 700);
			contentPane.add(battleBackgroundLabel);
		contentPane.addKeyListener(new KeyAdapter() {
		});
		
		
		
		}
	
	//Computer attack method
	public  void compAttack() {
		//First check if player killed computer
		if(compHealth<=0) {
			//If computer dead randomly select new pokemon
			Random compPoke = new Random();
	        compPokemon =compPoke.nextInt(6);
	        //show new comp pokemon sprite
	        compPokemonSprite();
	        //Set health back to one hundred
	        compHealth = 100;
	        //Reward 75 coins and add 1 to score
	        score = score + 1;
	        money = money + 75;
	        //New level for new comp pokemon
	        compLevel =1+LevelRand.nextInt(100);
	        //displaye new pokemons info
			compNameAndLevel.setText(pokeName[compPokemon]+" lv. "+compLevel);
			compHealthStatus.setText("HP "+compHealth+"/100");
		}
		
		//If computer turn
		if(playerTurn==false) {
				//Choose random attack/move
				Random moveComp = new Random();
		        compMove = 1 +moveComp.nextInt(4);
		        
		        //25 damage attack
		        if(compMove==1) {
		        	//Take away 25 from player health
		        	playerHealth = playerHealth - 25;
		        	//Output move info
		        	compboxText1.setVisible(true);
					boxText2.setVisible(true);
					moveBox.setVisible(true);
					compboxText1.setText("Enemy "+pokeName[compPokemon]+" Used "+attack25[compPokemon]);
		        }
		        //20 damage attack
		        else if(compMove==2) {
		        	//takeaway 20 from player health
		        	playerHealth = playerHealth - 20;
		        	//output move info
		        	compboxText1.setVisible(true);
					boxText2.setVisible(true);
					moveBox.setVisible(true);
					compboxText1.setText("Enemy "+pokeName[compPokemon]+" Used "+attack20[compPokemon]);
		        }
		        //15 damage attack
		        else if(compMove==3) {
		        	//Takeawat 15 from player health
		        	playerHealth = playerHealth - 15;
		        	//output move info
		        	compboxText1.setVisible(true);
					boxText2.setVisible(true);
					moveBox.setVisible(true);
					compboxText1.setText("Enemy "+pokeName[compPokemon]+" Used "+attack15[compPokemon]);
		        }
		        //10 damage attack
		        else if(compMove==4) {
		        	//takeaway 10 from player health
		        	playerHealth = playerHealth - 10;
		        	//output move info
		        	compboxText1.setVisible(true);
					boxText2.setVisible(true);
					moveBox.setVisible(true);
					compboxText1.setText("Enemy "+pokeName[compPokemon]+" Used "+attack10[compPokemon]);
		        }
		        //New player Health
		        playerHealthStatus.setText("HP "+playerHealth+"/100");
		}
		
		//Check if player dead after computers attack
		if(playerHealth<=0) {
		//Game over screen
		gameOver gameOver = new gameOver();
		//Show game over screen
		gameOver.setVisible(true);
		//Transfer score data
		gameOver.scores(score);
		//Set score back to 0, playerhealth to 100 (max) and comphealth to 0 and money to 90 and player turn to true
		score=0;
		playerHealth=100;
		compHealth=0;
		money=90;
		playerTurn=true;
		//Hide battle screen
		dispose();
		}
	}
	
	public void compPokemonSprite() {
		//Locate and assign gif to variable
		ImageIcon compPokemonSpriteIcon = new ImageIcon("Images/"+pokeName[compPokemon]+"Front.gif");
		//Resize
		Image compPokemonSpriteImage =  compPokemonSpriteIcon.getImage();
        Image modifiedCompPokemonSpriteImage = compPokemonSpriteImage.getScaledInstance(200, 200, java.awt.Image.SCALE_DEFAULT);
        compPokemonSpriteIcon = new ImageIcon(modifiedCompPokemonSpriteImage);	
		//Set Jlabel Icon To Blastoise GIF
        compPokemonSprite.setIcon(compPokemonSpriteIcon);
				
	}
	
	
}
