package PavanJava;

public class EvenOddFromArray {
    public static void main(String[]args){
        int a[]={78,2,3,4,5,6};

        //Extracting even numbers
        System.out.println("Odd numbers in array:");
        for(int i=0; i<a.length;i++)
        {
            if (a[i]%2==0)
                System.out.println(a[i]);
        }
        System.out.println("Even numbers in array:");
        for(int i=0; i<a.length;i++)
        {
            if (a[i]%2!=0)
                System.out.println(a[i]);
        }

        //Enhanced for loop
        /*for(int value:a)
        {
            if(value%2==0)
                System.out.println(value);
        }
        for(int value:a)
        {
            if(value%2!=0)
                System.out.println(value);
        }*/

    }
}