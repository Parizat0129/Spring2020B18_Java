package day24_Methods;

import Resources.Library;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str="Patizat";

        String RevStr=Library.Reverse(str);

        System.out.println(RevStr);


        int [] arr={5,9,3,2,-1};
        int [] arr1=Library.sortDesending(arr);
        System.out.println(Arrays.toString(arr));

















    }
}
