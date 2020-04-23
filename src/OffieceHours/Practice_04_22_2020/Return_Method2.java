package OffieceHours.Practice_04_22_2020;

import java.util.Arrays;

public class Return_Method2 {
           //write a return  method that can return second maximum number from an int array

    public static void main(String[] args) {
        int []arr ={100,40,500,50,30,-5,400,-100};
        Arrays.sort(arr);
        //int LastIndexNumber=arr.length-1;
        int secondLastNum=arr.length-2;

        int secondMaximum=arr[secondLastNum];
        System.out.println(secondMaximum);


        int []arr2={1,2,3,4,5,6,7,8};
        int sencondM=SecondMax(arr2);
        System.out.println(sencondM);

    }


    public static int SecondMax(int []arr){
        Arrays.sort(arr);
        //int LastIndexNumber=arr.length-1;
        int secondLastNum=arr.length-2;

        int secondMaximum=arr[secondLastNum];
        return secondMaximum;
    }






































}
