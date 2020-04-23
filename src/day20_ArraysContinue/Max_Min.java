package day20_ArraysContinue;
/*
 write a program that can find the maximum number from any given int array
 write a program that can find the minimum number from any given int array
 */
public class Max_Min {
    public static void main(String[] args) {

        int []arr={1,2,3,4,5,6,7,8,9};
        //         0 1 2 3 4 5 6 7 8

        int lastIndex=arr.length-1;

        int max=arr[0];
        int min=arr[1];

         for(int i =0;i<=lastIndex;i++){

             if(arr[i]>max){//arrays's index are compared with each other,and whichever is greater will be assigned to the max
                 max=arr[i];
             }

             if(arr[i]<min){////arrays's index are compared with each other,and whichever is smaller will be assigned to the min
                 min=arr[i];
             }


         }
        System.out.println(max);
        System.out.println(min);




    }
}
