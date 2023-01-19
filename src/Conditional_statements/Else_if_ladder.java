package Conditional_statements;

public class Else_if_ladder {

	public static void main(String[] args) {
    
		int marks= 35;
		if(marks>=80) {
			System.out.println("Passes in Distinction devison");
		}
		else if (marks>=70) {
			System.out.println("Passed in A devison");
		}
		else if (marks>=50) {
			System.out.println("Pass in B division");
		}
		else if (marks>=40) {
			System.out.println("Pass with C division");
		}
		else if (marks>=35) {
			System.out.println("Pass with D division");
		}
		else {
			System.out.println("Fail");
			
		
		}
	}

}
