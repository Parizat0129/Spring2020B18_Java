package day16_ForLoop;
/*
write a program that can print all the ODD / Even numbers
between 1 ~ 100 that can be divisible by 3 & 5
 */
public class DivisibleBy3_5 {
    public static void main(String[] args) {



        for(int i=1;i<=100;i++){

            if(i%2==0){//even  if wanna odd number i%!=0

                if(i%3==0&&i%5==0)
            System.out.print(i+" ");

        }
        }






    }
}
