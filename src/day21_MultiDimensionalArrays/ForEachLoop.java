package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int []nums={1, 2, 3, 4};

        for (int eachElement:nums){
            System.out.println(eachElement);
        }

        String [] students={"Muhatar", "Asiya", "Mutodil"};

        for(String eachNames:students){
            System.out.print(eachNames+" ");
        }
        System.out.println();
        System.out.println("=========================================");
        int[]arr1={1,2,10,4,5,6,7,8,9,13};

        Arrays.sort(arr1);// sort first
        for(int eachNumber:arr1){

            if(eachNumber<5){
                continue;
            }
            System.out.println(eachNumber);
        }

        System.out.println("=====================================");
        String sentence="i like java";//"java like i"

        String []words=sentence.split(" ");//[I, like, java]


        for(int i=words.length-1;i>=0;i--){
            System.out.println(words[i]);

        }
        System.out.println("================");
        for(int i=0;i<=words.length-1;i++){
            System.out.println(words[i]);

        }





















    }


}
