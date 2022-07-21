package PavanJava;

public class MissingNumberInArray {
    public static void main(String[]args){
        //Array should not have dublicates
        //Array No need to be sorted order
        //Values should be in range
        int a[]={1,2,3,5};

        int sum1=0;

        for(int i=0;i<a.length;i++)
        {
            sum1=sum1+a[i];
        }
        System.out.println("Sum of elements in Array:"+sum1);

        int sum2=0;

        for(int i=1; i<=5; i++)
        {
            sum2=sum2+i;
        }
        System.out.println("Sum of range of elements in Array:"+sum2);
        System.out.println("Missing number in Array:"+ (sum2-sum1));

    }
}
