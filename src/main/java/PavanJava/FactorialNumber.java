package PavanJava;

public class FactorialNumber {
    public static void main(String[]args){
        int num=9;
        long factorial=1;

        for(int i=1; i<=num;i++)
        {
            factorial=factorial*i;
        }
        System.out.println("Factorial of number is:" +factorial);
    }

}
