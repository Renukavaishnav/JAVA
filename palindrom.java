public class palindrom {
    public static void main(String[] args){

        int num = 141, ans = 0;
        int temp = num;


        while(num>0){
        ans = ans*10+num%10;

        num = num/10;
    }
    System.out.println(ans);
        
    System.out.println(ans + " " + num);

    if(temp == ans){
        System.out.println("it's palindrom");
    }else {
        System.out.println("it's not palindrom");
    }

    }
} 
