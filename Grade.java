import java.util.*;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int[] marks = new int[5];
	    int sum = 0;
	    float percentage = 0;
		for(int i=0; i<5; i++){
	        System.out.print("Enter marks for Subject " + (i+1) +":\t");
	        marks[i] = sc.nextInt();
	    }
	    for(int j=0; j<5; j++){
	        sum+=marks[j];
	    }
	    percentage = (float)sum/5;   
	    System.out.println("Total marks are:-\t" + sum);
	    System.out.println("Your percentage is:-\t" + percentage);
	    if(percentage<40){
	        System.out.println("Your Grade is: "+'E');
	    }
	    else if(percentage>40 && percentage<=50){
	        System.out.println("Your Grade is:  "+"D");
	    }
	    else if(percentage>50 && percentage<=60){
	        System.out.println("Your Grade is:  "+"D+");
	    }
	    else if(percentage>60 && percentage<=65){
	        System.out.println("Your Grade is:  "+"C-");
	    }
	    else if(percentage>65 && percentage<=70){
	        System.out.println("Your Grade is:  "+"C");
	    }
	    else if(percentage>70 && percentage<=75){
	        System.out.println("Your Grade is:  "+"C+");
	    }
	    else if(percentage>75 && percentage<=80){
	        System.out.println("Your Grade is:  "+"B-");
	    }
	    else if(percentage>80 && percentage<=85){
	        System.out.println("Your Grade is:  "+"B");
	    }
	    else if(percentage>85 && percentage<=90){
	        System.out.println("Your Grade is:  "+"B+");
	    }
	    else if(percentage>90 && percentage<=95){
	        System.out.println("Your Grade is:  "+"A");
	    }
	    else if(percentage>95 && percentage<=100){
	        System.out.println("Your Grade is:  "+"A+");
	    }
	    
	}
}