package simple_compound_interest_and_constructioncost;
import java.util.Scanner;
public class ConstructionCost {
	int cost,area;
	String type;
	public float material_type() {
		int area;
		Scanner input=new Scanner(System.in);
		System.out.println("\nTo Estimate House Construction Cost");
		System.out.println("Enter Area:");
		area=input.nextInt();
		System.out.println("If they want fully automated ,type should be:fully_automated");
		System.out.println("Enter material type");
		type=input.next();
		if(type.equals("No")) {
			if(type.equals("standard_material")) {
				cost=area*1200;
			}
		    else if(type.equals("Above_standard_material")) {
			    cost=area*1500;
		    }
		    else if(type.equals("high_standard_material")) {
			    cost=area*1800;
		    }
		}	
		else{
			if(type.equals("fully_automated")){
			   cost=area*2500;
			}
		}
		return(cost);
	}
}
