package OffieceHours.Practice_04_15_2020;

import java.util.Arrays;

public class NestedLoops2 {
    public static void main(String[] args) {

        int[][]  numbers = {
                {5,4,3,2,1},
                {10,11,12,13,14,15},
                {16,17,18,19,20},
        };

        // print all the odd number with regular for loop,Must usr continue statement

        for(int j=0;j<numbers.length;j++){// j: index nums of 1D arrays
            for(int i=0;i<numbers[j].length;i++){// i: index number of all Elements

                if(numbers[j][i]%2==0){
                    continue;
                }

                System.out.println(numbers[j][i]);

            }

        }
        System.out.println("=====================================");
        // print all the even number with for each loop.Must usr continue statement

        for( int[] each1DArrays :numbers){

            for(int eachElement:each1DArrays ){

                if(eachElement%2!=0){
                    continue;
                }

                System.out.println(eachElement);

            }

        }




































    }
}
