package simple_compound_interest_and_constructioncost;
public class DemoMain 
{
    public static void main( String[] args )
    {
        SimpleInterest si=new SimpleInterest();
        si.simple_interest_calculation();
        si.display_simple();
        CompoundInterest ci=new CompoundInterest();
        ci.compound_interest_calculation();
        ci.display_compound();
        ConstructionCost cc=new ConstructionCost();
        float cost=cc.material_type();
        System.out.println("Construction cost="+cost);
        
        
    }
}
