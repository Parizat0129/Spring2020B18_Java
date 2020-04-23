package day23_Methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_MiniNumber {
    public static void main(String[] args) {
       int []arr1={3,2,5,2,10};
       MaximumNumber(arr1);
       MinimumNumber(arr1);



    }



    public static void MaximumNumber(int[]arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max);
            max=arr[i];
        }
        System.out.println(max);
    }
public static void MinimumNumber(int[]numbers){
        int minimum=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<=minimum){
                minimum=numbers[i];
            }
        }
    System.out.println(minimum);
}
}
/*
 1   creat a function that can print the maximum number from any given array
2    creat a function that can print the minimum number from any given array
 */