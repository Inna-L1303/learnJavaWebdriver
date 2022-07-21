package PavanJava;

public class SwapTwoNumbers {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c;
        {
            System.out.println("Before swapping :" + a + " " + b);
        }
        //Logic1 - Third variable
        c = a;
        a = b;
        b = c;
        {

            System.out.println("After swapping:" + a + " " + b);
        }
        //Logic2 - Use -&+ without using third variable
        a = a + b; //10+20=30
        a = a - b; //30-10=20
        b = a - b; //30-20=10

        {
            System.out.println("After swapping:" + a + " " + b);
        }
        //Logic3 - use * and / without using third variable
        //here a&b values should not be Zero
        a=a*b; //10*20=200
        a=a/b; //200/10=20
        b=a/b; //200/20=10

        {
            System.out.println("After swapping:" + a + " " + b);
        }
        //Logic4 -Single statement
        b=a+b-(a=b);
        {
            System.out.println("After swapping:" + a + " " + b);
        }

    }
}
