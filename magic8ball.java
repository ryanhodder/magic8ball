//run on linux command line
//java magic8ball [your question here]

//Created by Ryan Hodder
//Answers found at https://en.wikipedia.org/wiki/Magic_8-ball

import java.util.Random;

public class magic8ball{

	private int CONST_SIDES = 20; //how many answers in the 8ball
	private String[] answers = new String[20];
	
	public static void main(String[] input){
		magic8ball m8 = new magic8ball();
		String output;

		try{
			System.out.print("Question: ");
			for(String i : input){ 
				System.out.print(i + " ");
			}
			output = m8.shake();
			System.out.println("\nMagic 8 ball says: " + output);
			return;
		}
		catch(Exception ex){
			System.out.println("Error: " + ex);
			return;
		}
	}

	//shake the 8ball
	//returns a String answer
	private String shake(){
		String answer;
		Random r = new Random();

		int a = r.nextInt(CONST_SIDES); //generating random number
		populateAnswers(); //fills list of answers
		answer = answers[a]; //random number used to select answer
		return answer; //returns answer
	}

	//Generate the answers for the 8ball
	//better way to do this rather than hardcode answers?
	//--> probably could read in a csv file?? if it was filled
	private void populateAnswers(){
		answers[0] = "It is certain";
		answers[1] = "It is decidedly so";
		answers[2] = "Without a doubt";
		answers[3] = "Yes definitely";
		answers[4] = "You may rely on it";
		answers[5] = "As I see it, yes";
		answers[6] = "Most likely";
		answers[7] = "Outlook good";
		answers[8] = "Yes";
		answers[9] = "Signs point to yes";
		answers[10] = "Reply hazy try again";
		answers[11] = "Ask again later";
		answers[12] = "Better not tell you now";
		answers[13] = "Cannot predict now";
		answers[14] = "Concentrate and ask again";
		answers[15] = "Don't count on it";
		answers[16] = "My reply is no";
		answers[17] = "My sources say no";
		answers[18] = "Outlook not so good";
		answers[19] = "Very doubtful";
	}
}
