public class leapyear {
    public static void main(String[] args) {
        
        //Check Leap Year in Java:
   
        int year = 2016;

        if(year%4==0 || year%400==0 || year%100==0){
            System.out.println(year + " is leap year" );
        }else{
            System.out.println(year + " is not leap year" );

        }
    }
}
