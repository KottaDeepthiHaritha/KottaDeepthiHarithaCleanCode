package simple_compound_interest_and_constructioncost;
import java.util.Scanner;
class SimpleInterest  {
	float principle,time,rateofinterest;
	public  void simple_interest_calculation() {
		Scanner input=new Scanner(System.in);
		System.out.println("Simple Interest calculation");
    	System.out.println("Enter the Principle:");principle=input.nextFloat();
    	System.out.println("Enter the Time(in years):");
        time=input.nextFloat();
        System.out.println("Enter the Rate of Interest:");
    	rateofinterest=input.nextFloat();
	}
	public void display_simple(){
		float simpleinterest;
		simpleinterest=((principle*time*rateofinterest)/100);
		System.out.println("Simple Interest: "+simpleinterest);
		
	}

}
