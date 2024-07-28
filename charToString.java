public class charToString {
     public static void main(String[] args){

        char c = 'G';

        System.out.println(c);


        //charcter to  String
        String s = Character.toString(c);
        System.out.println(s);

        //String to Charcter
        String strr = "hello";
        char[] charArray = strr.toCharArray();

        for(char ch : charArray){
        System.out.print(ch+ " ");
        }
}
}