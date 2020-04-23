package day22_Arrays_Loops;
// write a program that sort the array in descending order
import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        // 1.sort the arr in asceding
        //2 reverse the array that's sort in ascending===>descending
        int []arr ={100,20,50,130,22,69};

        Arrays.sort(arr);//[20, 22, 50, 69, 100, 130]
      //  System.out.println(Arrays.toString(arr));// sort in ascending order

        int []RevArr=new int[arr.length];
        int j=arr.length-1;
        for(int i=0;i<=arr.length-1;i++){
            RevArr[i]=arr[j];
            j--;
        }


        System.out.println(Arrays.toString(RevArr));//[130, 100, 69, 50, 22, 20]






































    }
}
