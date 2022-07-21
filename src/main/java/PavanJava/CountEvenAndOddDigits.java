package PavanJava;

public class CountEvenAndOddDigits {
    public static void main(String[]args){
        int num = 123418749;
        int even_count=0;
        int odd_count=0;

        while(num>0) //1234 123
        {
            int rem = num%10; //4 3
            if(rem%2==0)
            {
                even_count++; //1
            }
            else
            {
                odd_count++;
            }
            num=num/10; //123
        }
        System.out.println("Number of Even numbers:"+ even_count);
        System.out.println("Number of Odd numbers:"+ odd_count);

    }
}
