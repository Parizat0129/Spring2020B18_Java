package OffieceHours.Practice_04_15_2020;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

/*
    Arrays.sort(arr): sorts the array in Ascending order
    Arrays.equal(arr1, arr2):  arr1 == arr2
    Arrays.toString(): converts single dimentional array to string
    Arrays.deepToString(): onverts multi dimentional array to string
     */
        int arr[]={10,9,3,5,7,65};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[3, 5, 7, 9, 10, 65]

        int []salaries={10000,200000,30000,40000,123123  };
        int length=salaries.length;
        int lastIndex=length-1;
        Arrays.sort(salaries);// ascending order
        System.out.println("Minimum salary: "+salaries[0]);
        System.out.println("Maximum salary: "+salaries[salaries.length-1]);

        System.out.println("===================");

        int []arr1={3,2,1};
        int []arr2={2,1,3};
        Arrays.sort(arr1);// [1,2,3]
        Arrays.sort(arr2);//[1,2,3]
        System.out.println(Arrays.equals(arr1,arr2));//ture








    }
}
