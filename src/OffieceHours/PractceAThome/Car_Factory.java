package OffieceHours.PractceAThome;

import java.util.Scanner;

public class Car_Factory {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int countEven=0;
        for(int eachnums:nums){
            if(eachnums%2==0){
                countEven++;
            }


        }
        System.out.println(countEven);







































    }
}
