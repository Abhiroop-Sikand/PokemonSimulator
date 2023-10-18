package pokemonGame;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class gameOver extends JFrame{
	
	private JPanel contentPane;
	// vairable for highschore
	public static int highscore;
	
	public gameOver() {
		battleScreen obj1 = new battleScreen();
		//Screen for game over
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//dimensions
		setBounds(787, 120, 1000, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//MAIN MENU BUTTON
		JButton btnNewButton = new JButton("MAIN MENU");
		//Set font
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		//Check if clicked
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display main menu screen
				mainPokemon main = new mainPokemon();
				main.setVisible(true);
				obj1.count=0;
				//hide game over screen
				dispose();
			}
		});
		btnNewButton.setBounds(373, 438, 192, 56);
		contentPane.add(btnNewButton);
		
		//POKEMON SELECTION SCREEN/TRY AGAIN BUTTON
		JButton btnTryAgain = new JButton("TRY AGAIN");
		//Set font
		btnTryAgain.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		//Check if clicked
		btnTryAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display Selection screen
				Selection selection = new Selection();
				selection.setVisible(true);
				obj1.count=0;
				//hide game over screen
				dispose();
			}
		});
		btnTryAgain.setBounds(373, 524, 192, 56);
		contentPane.add(btnTryAgain);
		
	}
	//Method
	public void scores (int score) {
		//Check if new highscore is created
		
		//Find File
		File f = new File("highscore.txt"); 
		Scanner file = null;
		ArrayList<Integer> highscores = new ArrayList<Integer>();
		try {
			//reading from file
			file = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//Continue reading so long as theres another line	  
	    while (file.hasNextLine()) {
	    	//read in next line
	      String temp = file.nextLine();
	      //make sure string is not empty
	      if (!temp.equals("")) {
	    	  //convert string to int and add to highscore list
	    	  highscores.add(Integer.parseInt(temp));
	      }
	  	} 
	    
	    //check id there are high scores
	    if (highscores.size()>0) {
	    	//Go through the high scores
	    	for (int i = 0; i<highscores.size(); i++) {
	    		//Is the current user score higher than a highscore
	    		if (highscores.get(i)< score) {
	    			//Add the user score into the index of the old highscore it is larger than
	    			highscores.add(i, score);
	    			//If there are more than 5 high scores, remove the last high score
	    			if (highscores.size()>5)
	    				highscores.remove(highscores.size()-1);
	    			//Exit because we are done adding highscores
	    			break;
	    		}
	    	}
	    } else {
	    	//No highscores, current score is a highscore
	    	highscores.add(score);
	    }
	    
	    try {
	    	//Write to the file
			PrintWriter pw = new PrintWriter(f);
			//Empty the file contents
			pw.write("");
			//Go through the highscores list
			for (int i : highscores) {
				//Add the highscore to the list
				pw.print(i);
				//Add in the nextline
				pw.print("\n");
			}
			//Close the printerWriter
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	   
		
		
		//GAME OVER TEXT
		JLabel lblNewLabel = new JLabel("GAME OVER");
		//Font
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 64));
		lblNewLabel.setBounds(276, 32, 382, 107);
		contentPane.add(lblNewLabel);
		
		//SCORE TEXT
		JLabel lblNewLabel_1 = new JLabel("YOUE SCORE = "+score);
		//Font
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(399, 174, 269, 34);
		contentPane.add(lblNewLabel_1);
		
		//HIGHSCORE TEXT
		//hold higschore list in text format
		String scoresList = "";
		//Go through all highscores
		for (int i=0; i<highscores.size(); i++) {
			//add highscore to the scoreList variable
			scoresList += i+1 +": " + highscores.get(i) + ",  ";
		}
		//Show the label with all the highscores
		JLabel lblNewLabel_1_1 = new JLabel("HIGHSCORES= " + scoresList);

		//Font
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(399, 221, 500, 34);
		contentPane.add(lblNewLabel_1_1);
		
		//gameOver Background label
		JLabel gameOverBackground = new JLabel("");
		//Set colour
		gameOverBackground.setBackground(new Color(255, 0, 0, 100));
	    //Dimensions
		gameOverBackground.setBounds(0, 0, 1000, 700);
		//Make opaque (so it can be seen)
		gameOverBackground.setOpaque(true);
		contentPane.add(gameOverBackground);
		
		//Stop from changing screen size mid game
		setResizable(false);
		
		
		
	}
}
 