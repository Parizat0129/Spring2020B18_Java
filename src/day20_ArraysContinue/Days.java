package day20_ArraysContinue;

import java.util.Scanner;

/*
Create an array that holds the daysUser should be able to enter
the day index and output should be:“Today is Monday”
 */
public class Days {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String [] days={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday", "Sunday" };// size is 7, max index :6

        System.out.println("Enter a number");
        int num=input.nextInt();//5
        int attempts=1;

        while(num>7||num<=0) {
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter ");
            num=input.nextInt();


            attempts++;
            if (attempts == 3 && (num > 7 || num < 0)) {
                System.out.println("Invalid Entry, you already have 3 attempts");
                System.exit(0);
            }
        }




        String result=days[num-1];

        System.out.println(result);


























    }
}
