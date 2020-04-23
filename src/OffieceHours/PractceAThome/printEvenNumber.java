package OffieceHours.PractceAThome;

import java.util.Scanner;

public class printEvenNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int count=0;

        for(int eachNums: nums){
            if(eachNums%2==0){
                count++;
            }

        };

        System.out.println(count);







    }
}
