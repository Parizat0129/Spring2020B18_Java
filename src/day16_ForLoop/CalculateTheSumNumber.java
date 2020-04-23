package day16_ForLoop;
/*
write a program that can calculate the sum of all
the even / odd  numbers between 1 ~ 100

 */
public class CalculateTheSumNumber {
    public static void main(String[] args) {
        int sum1=0;
       int sum2=0;
        for(int i=0; i<=100; i++ ){//i is even number

            if(i%2==0){  //even numbers
                sum1+=i;
            }else{// odd numbers
                sum2+=i;
            }
        }
        System.out.println("sum of all even number: "+sum1);
        System.out.println("sum of all odd number: "+sum2);














    }
}
