package OffieceHours.Practice_04_15_2020;

import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {
        //                  0    1
        char[] [] arr2D ={{'A', 'B', },{'C', 'D', 'E'},{'F', 'J','H'}};
        //                     0           1                 2

        //arr2D[0]

        for (int j=0;j<arr2D.length;j++) {//j: index nums of iD
            for (int i = 0; i < arr2D[j].length; i++) {//i: index num of elements in 1D
                System.out.println(arr2D[j][i]);
            }
        }
        System.out.println("===================================");
        // arr2D ={{'A', 'B', },{'C', 'D', 'E'},{'F', 'J','H'}};

        for(char []each1DArray :arr2D){
           // System.out.println(Arrays.toString(each1DArray));

            for(char eachElement:each1DArray){
                System.out.println(eachElement);
            }
        }


































    }
}
