public class maxval {
    public static void main(String[] args){

        int a = 5;
        int b = 7;
        int c = 3;

        //Find Maximum of Three Numbers:
        
        int max = a;

        if(max<b) max=b;
        if(max<c) max=c;

        System.out.println("number "+ max + " is max");
    }
}
