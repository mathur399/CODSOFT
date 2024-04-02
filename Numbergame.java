
import java.util.*;
import java.util.Random;

public class Numbergame{
	    int theNum;
	    int max=100;
	    Scanner sc=new Scanner(System.in);
	    int attempts;
	    int maxAttempts=5;
	    int wins=0;

	    public Numbergame(){
	    	Random ran=new Random();
	    	theNum=Math.abs(ran.nextInt())%(max+1);
	    }

	    public void play(){
	        boolean playAgain=true;
	        while(playAgain){
		    	Random ran=new Random();
		    	theNum=Math.abs(ran.nextInt())%(max+1);
	            attempts=0;
	            System.out.println("New game started!");
	            System.out.println("You have 5 attempts to guess the number");

	        while(attempts<maxAttempts){
	            System.out.print("Enter your Number:  ");
	            int guess=sc.nextInt();
	            attempts++;
	            if(guess>theNum){
	                System.out.println("Your guess is greater than the Number...");
	            }
	            else if(guess<theNum){
	                System.out.println("Your guess is lesser than the Number...");
	            }
	            else if(guess==theNum){
	                wins++;
	                System.out.println("Congratulations, you guessed it right, your current score is "+wins);
	                break;
	            }
	            if(attempts<maxAttempts){
	                System.out.println("Attempts left: "+(maxAttempts-attempts));
	            }else{
	                System.out.println("Attempts are over, the number was  " +theNum+ " & your score was:" +wins);
	            }
	        }
	        System.out.println("Do you want to restart the game(yes/no):");
	        String playAgainInput=sc.next().toLowerCase();
	        playAgain=playAgainInput.equals("yes");
	        if(!playAgain){
	            System.out.println("Game is ended...");
	        }
	    }
	}


	public static void main(String[] args) {
		System.out.println("Welcome to the Number Game");
		Numbergame guess=new Numbergame();
		guess.play();
		
	}

}