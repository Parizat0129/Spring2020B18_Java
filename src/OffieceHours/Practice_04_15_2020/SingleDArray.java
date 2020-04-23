package OffieceHours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleDArray {
    public static void main(String[] args) {
        int []arr ={100,200,300};
      //index:     0   1    2

        System.out.println(arr[1]);

        for(int i=0;i<=arr.length-1;i++){// i: index number of element
           // System.out.println(arr[i]);
            // or
            int num=arr[i];
            System.out.println(num);
        }
        System.out.println("===============");
        int j =0;
        while(j<arr.length-1){
            int num1=arr[j];
            System.out.println(num1);
            j++;
        }
        System.out.println("====================");
        String [] names={"John",  "Aron", "Luoise"};
        //                  0        1     2


        int length=names.length;

        String [] namesRev=new String [length];//{null, null, null}
         //                                       0      1      2
        /*
//               i        k
        namesRev[0]=names[2];
        namesRev[1]=names[1];
        namesRev[2]=names[0];
*/
        int k=names.length-1;
        for(int i=0;i<length;i++){
            namesRev[i]=names[k];
            k--;
        }
/*
int i =0;
           int k = length-1; // max index number
           while(i < length){

               namesRev[i] = names[k];
               i++;
               k--;
           }


 */

        System.out.println(Arrays.toString(namesRev));


















    }
}
