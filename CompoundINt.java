public class CompoundINt {
    
    public static void main(String [] args){

    //Calculate Compound Interest in Java:
    
 // A	=	final amount
 // P	=	initial principal balance
 // r	=	interest rate
 // n	=	number of times interest applied per time period
 // t	=	number of time periods elapsed
    

    
     double principal =  100000, rate = 5, time = 3;

double CI = principal*(Math.pow((1+rate/100),time)) - principal;
     System.out.println(CI);
    }    
}
