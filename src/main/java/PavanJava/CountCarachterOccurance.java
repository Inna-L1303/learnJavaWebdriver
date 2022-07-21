package PavanJava;

public class CountCarachterOccurance {
    public static void main(String[] args){

        String s="java Programming Java oops";

        int total_count = s.length(); //total length
        int total_count_afterRemove=s.replace("a","").length(); //total length after removing a's

        int count = total_count-total_count_afterRemove;

        System.out.println("Number of Occurances of a is:" +count);


    }
}
