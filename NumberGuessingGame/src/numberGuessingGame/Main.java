package numberGuessingGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame{
	public Main(){
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setLocationRelativeTo(null);
		setTitle("Guessing Game");
		Dimension infoDimension = new Dimension(200, 25);
		JPanel rules = new JPanel();
		JLabel rulesL = new JLabel("Guess a number from 0 to 50");
		
		JPanel hardbutton = new JPanel();
		JButton hard = new JButton("Hard");
		hard.addActionListener(new ButtonAction());
		JButton medium = new JButton("Medium");
		medium.addActionListener(new ButtonAction());

		JButton easy = new JButton("Easy");
		easy.addActionListener(new ButtonAction());

		JButton check = new JButton("Check");
		check.addActionListener(new ButtonAction());

		JPanel checkP = new JPanel();
		JPanel text = new JPanel();
		JTextField output = new JTextField("output");
		output.setBounds(210, 70, 210, 90);
		JPanel guessP = new JPanel();
		JTextField guessT = new JTextField("Guess");
		output.setPreferredSize(infoDimension);
		guessT.setPreferredSize(infoDimension);
		rules.add(rulesL);
		rules.setBounds(230, 0, 170, 20);
		add(rules);
		checkP.add(check);
		check.setBounds(270, 150, 90, 40);
		add(check);
		text.add(output);
		text.setBounds(210, 70, 210, 40);
		add(text);
		guessP.add(guessT);
		guessP.setBounds(210, 110, 210, 30);
        add(guessP);
		hardbutton.add(hard);
		hardbutton.add(medium);
		hardbutton.add(easy);
		hardbutton.setBounds(190, 30 , 250 , 40);
		add(hardbutton);
		setVisible(true);
	}
	
	public class ButtonAction implements ActionListener{
		
		  public void actionPerformed(ActionEvent e) {
		         if(e.getActionCommand() == "Hard"){
		        	 difficulty = "hard";
		        	 System.out.println(difficulty);
		        	 tries = 5;
		        	 System.out.println(num);
		         }else if(e.getActionCommand() == "Medium"){
		        	 difficulty = "medium";
		        	 System.out.println(difficulty);
		        	 tries = 7;
		         }else if(e.getActionCommand() == "Easy"){
		        	 difficulty = "easy";
		        	 System.out.println(difficulty);
		        	 tries = 10;
		         }
		         //if(e.getActionCommand() == "Check" && guessT == num){
		        	 
		         //}
		      }
	}
	public static void main(String[] args){
		Main program = new Main();
		
	}
	public String difficulty;
	public int tries;
	Random randomNumber = new Random();
	public int num = randomNumber.nextInt(50);
}
/**

public class Main {
   
   private static class HelloWorldDisplay extends JPanel {
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         g.drawString( "Try to guess the number between 0 and 50.", 150, 30 );
         g.drawString("Please select difficulty", 200, 50);
      }
   }
   
   private static class ButtonHandler implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         System.exit(0);
      }
   }
   
   public static void main(String[] args) {
      
	  HelloWorldDisplay displayPanel = new HelloWorldDisplay();
      JButton okButton = new JButton("Exit");
      ButtonHandler listener = new ButtonHandler();
      okButton.addActionListener(listener);
      
      JButton hard = new JButton("Hard");
      //hard.setLayout(null);
      hard.setBounds(150, 70, 150, 30);
      //hard.setPreferredSize(new Dimension(80, 200)); // ?? I don't like this.
     // hard.setFont(new Font("Arial", 1, 40));

      JButton medium = new JButton("Medium");  
      
      JButton easy = new JButton("Easy");  

      
      JPanel content = new JPanel();
      //getContentPane().add(content);
      content.setLayout(null);
     // content.add(displayPanel, BorderLayout.CENTER);
      content.add(okButton);
      content.add(hard);

      //content.add(hard);
     // content.add(medium);
      //content.add(easy);
      
      JFrame window = new JFrame("Guessing Game");
      window.setContentPane(content);
      window.setSize(550,400);
      window.setLocation(100,100);
      window.setVisible(true);

   }
   
}


*/

 

/**
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;

	public class Main {

		public static void main(String[] args) {
			
			JOptionPane.showMessageDialog( null, "Hello World!" );
			
			Scanner keyboard = new Scanner(System.in);
		    Random randomNumber = new Random();
		    int num = randomNumber.nextInt(50); //num is random number between 0 and 50
		    boolean win = false; 
		    int i; //interations aka tries or guesses remining
		        
		    System.out.println("Lets Play the guessing game!");
		    System.out.println("Try to guess the number between 0 and 50.");
	        System.out.println(" ");
	        System.out.println("Please select difficulty: Hard, Medium or Easy");
		        
	        String difficulty = keyboard.nextLine();
	        System.out.println(" ");
		        
	        if(difficulty.equalsIgnoreCase("Easy")){ //derterimne difficulty
	            i = 10;
	            System.out.println("Easy difficuty selected");
		            
	        }else if(difficulty.equalsIgnoreCase("Medium")){
		        i = 7;
		        System.out.println("Medium difficuty selected");
		            
	        }else if(difficulty.equalsIgnoreCase("Hard")){
	            i = 5;
	            System.out.println("Hard difficuty selected");
		            
		    }else{ //catch all
		        i = 10;
		        System.out.println("Easy difficuty selected");
		    }
		   
		    while(!win && i > 0){ //user inputs guesses.
		    	if(i > 1){ //corrects grammar based on tries left because gratical errors are that of satan
		    		System.out.println("you have " + i + " tries left.");
		        }else{
		            System.out.println("you have " + i + " try left.");
		        }
		            
		        int guess = keyboard.nextInt();
		            
		        if(guess < 0 || guess > 50){ //guess is not within appropriate range
		            System.out.println("Your guess it not within the appropriate range");
		            i++;
		        }else if(guess < num){ //guess is too small
		            System.out.println("Your guess is less than the answer.");
		            
		        }else if(guess > num){ //guess is too large
		            System.out.println("Your guess is greater than the answer.");
		            
		        }else if(guess == num){ //guess is correct. win case. Game ends
		            System.out.println("YOU WIN!");
		            win = true;
		        }
		        i--;
		        }
		            if(win == false){ //user runs out of guesses but does not win
		                System.out.println(" ");
		                System.out.println("Sorry you lose.");
		                System.out.println(":-(");
		                System.out.println(" ");
		                System.out.println("The number was " + num);
		        } 
		   }  
	}

*/