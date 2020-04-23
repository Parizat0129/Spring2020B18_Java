package day22_Arrays_Loops;

import java.util.Arrays;

/*
 write a program that can reverse the array
 */
public class ReverseArray {
    public static void main(String[] args) {

    int []arr={1,2,3,4,5,6,7,8};

    for(int i=arr.length-1;i>=0;i--){
       int eachNum=arr[i];
        System.out.println(eachNum);

    }
        System.out.println("=====================================================");
    //[5,4,3,2,1]

    int[] revArr=new int[arr.length];//[0,0,0,0,0]
/*
 index number: i      j
        revArr[0]=arr[4];
        revArr[1]=arr[3];
        revArr[2]=arr[2];
        revArr[3]=arr[1];
        revArr[4]=arr[0];
*/

        int j=arr.length-1;
        for(int i=0;i<=arr.length-1;i++){
            revArr[i]=arr[j];
            j--;

        }

        System.out.println(Arrays.toString(revArr));

















    }
}
