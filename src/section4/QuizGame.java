package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
	String	answer=JOptionPane.showInputDialog(null,"How old is Carly Llod");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase("37")) {
		// 4.  if the user's answer was correct, add one to their score 
		score++;
		}

		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 2.  Ask the user a question 
	String	dog=JOptionPane.showInputDialog(null,"Is M.C. Esher a artist?");
		// 3.  Use an if statement to check if their answer is correct
		if(dog.equalsIgnoreCase("yes")) {
		// 4.  if the user's answer was correct, add one to their score 
		score++;
		}
			answer=JOptionPane.showInputDialog(null,"How many letters are in the alphabet");
		
		if(answer.equalsIgnoreCase("26")) {
		
		score++;
		}
		// 6.  After all the questions have been asked, print the user's score 
		System.out.println(score);
	}
}
