package day21_MultiDimensionalArrays;
/*
write a program that can return the average number from an array of integers
            ex:
                [1,2,3]
                average: 2
                [10, 15, 5, 6]
                average: 9
                [4, 5, 6, 7, 8, 10, 20, 30, 0]

 */
import java.text.DecimalFormat;
import java.util.Arrays;
public class AverageNumber {
    public static void main(String[] args) {
        DecimalFormat DF=new DecimalFormat("0.00");
        int[] arr={10, 20, 30, 40, 50,60,40,25};
       // average: sum of all numbers/length

       int length= arr.length;// total number of the elements;

        int sum=0;

                 //or 0<=length-1
        for(int i=0;i<length;i++){

            int eachNum=arr[i];
            sum+=eachNum;

        }
        System.out.println(sum);
  double average = sum/length;
        System.out.println(average);

        System.out.println(DF.format(average));

/*
        int[]arr2={1,2,2};
        System.out.println(5/3);
        System.out.println(5/(double)3);

*/
























    }
}
