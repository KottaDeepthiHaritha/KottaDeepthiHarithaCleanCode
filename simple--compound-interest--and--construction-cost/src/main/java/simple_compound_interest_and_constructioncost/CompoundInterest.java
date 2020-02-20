package simple_compound_interest_and_constructioncost;
import java.util.Scanner;
import java.lang.Math;
public class CompoundInterest {
	double initial_principal_balance,interest_rate,number_of_times_interest_applied,number_of_time_periods_elapsed;
	public void compound_interest_calculation() {
		Scanner input=new Scanner(System.in);
		System.out.println("\nCompound Interest calculation");
		System.out.println("Enter the initial_principal_balance:");initial_principal_balance=input.nextDouble();
    	System.out.println("Enter the interest_rate:");
    	interest_rate=input.nextDouble();
    	System.out.println("Enter the number_of_times_interest_applied:");
    	number_of_times_interest_applied=input.nextDouble();
    	System.out.println("Enter the number_of_time_periods_elapsed:");
    	number_of_time_periods_elapsed=input.nextDouble();
	}
	public void display_compound() {
		double compoundinterest;
		double rn=1+(interest_rate/number_of_times_interest_applied);
		double nt=number_of_times_interest_applied*number_of_time_periods_elapsed;
		compoundinterest=initial_principal_balance*Math.pow(rn,nt);
		System.out.println("Compound Interest: "+compoundinterest);
	}

}
