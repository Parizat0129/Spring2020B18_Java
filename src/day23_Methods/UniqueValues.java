package day23_Methods;

import java.util.Arrays;

/*
Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */
public class UniqueValues {
    public static void main(String[] args) {
String [] arr={"A", "A", "B", "C","C","D"};
//index         0    1    2    3   4
// solution 1:
          for(int j=0;j<arr.length;j++){

              int count=0;
              for(int i=0;i<arr.length;i++){
                  if(arr[i].equals(arr[j])){
                      count++;
                  }
              }
              if(count==1){
                  System.out.println(arr[j]);
              }
          }


        System.out.println("====================================");
    //solution 2:
        for(String each2:arr){
        int count1 =0;
        for(String each: arr){
            if(each.equals(each2)){
                count1++;
            }

        }
        if(count1==1){//if the character is unique
            System.out.println(each2);
        }


    }
        System.out.println("==================");

















    }
}
