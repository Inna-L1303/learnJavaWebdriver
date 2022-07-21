package PavanJava;

public class ReverseEachWordinString {
    public static void main(String[]args){

//Approach1
        /*String str ="Welcome to Java";

        String[] words = str.split(" "); //Splitting string into multiple words

        String reverseString="";

        for(String w:words) //welcme
        {
            String reverseword="";

            for(int i=w.length()-1;i>=0;i--) //welcome
            {
                reverseword=reverseword+w.charAt(i);
            }
            reverseString=reverseString+reverseword+" ";  //emocleW ot avaJ
        }
        System.out.println(reverseString);*/

//Approach2
         String str="Welcome to Java";
         String[] words=str.split("\\s");

         String reverseword="";

         for(String w:words)
         {
             StringBuilder sb=new StringBuilder(w);
             sb.reverse();

             reverseword=reverseword+sb.toString()+" ";
         }
        System.out.println(reverseword);

    }
}
