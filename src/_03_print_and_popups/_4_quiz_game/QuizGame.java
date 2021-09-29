package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
	// ASK A QUESTION AND CHECK THE ANSWER
		String input = JOptionPane.showInputDialog("is cheese the most popular food in the U.S.");
			if (input.equals("yes")) {
		JOptionPane.showMessageDialog(null,"here's a block of cheese");
		score += 1;
		}
		else {
		JOptionPane.showMessageDialog(null, "errrrr!!!!! incorrecto");
		score -= 1;
		}
				// 2.  Ask the user a question 
				
				// ASK A QUESTION AND CHECK THE ANSWER
			input = JOptionPane.showInputDialog(null,"what is 3/7 x 17/8");
			if (input.equals("51/56")) {
		JOptionPane.showMessageDialog(null,"correcto");
		score += 3;
		}
		else {
		JOptionPane.showMessageDialog(null, "errrrr!!!!! incorrecto");
		score -= 3;
		}				
		// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
			input = JOptionPane.showInputDialog(null,"was perservearence the latest mars rover?");
			if (input.equals("yes")) {
		JOptionPane.showMessageDialog(null,"go to nasa");
		score += 5;
		}
		else {
		JOptionPane.showMessageDialog(null, "errrrr!!!!! incorrecto");
		score -= 5;
		}				
		// 3.  Use an if statement to check if their answer is correct
			input = JOptionPane.showInputDialog("what is the biggest country in south america");
			if (input.equals("brazil")) {
		JOptionPane.showMessageDialog(null,"we're you born there?");
		score += 10;
		}
		else {
		JOptionPane.showMessageDialog(null, "errrrr!!!!! incorrecto");
		score -= 10;
		}				
		// 3.  Use an if statement to check if their answer is correct
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null," your score was " + score); 
	
}
	}







