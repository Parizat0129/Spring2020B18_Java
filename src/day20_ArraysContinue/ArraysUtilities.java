package day20_ArraysContinue;
import java.util.Arrays;
public class ArraysUtilities {
    public static void main(String[] args) {

        int[]arr = {1,2,3};

        String r=Arrays.toString(arr);
        System.out.println(r);

      //  System.out.println(arr);  // Arrays Must be converted to string before we print

        String []name={"a","b","c"};
        String r1=Arrays.toString(name);

        System.out.println(r1);

        //or

        System.out.println(Arrays.toString(name));

        double [] nums={10,20,30,40,50};

        System.out.println(Arrays.toString(nums));

        System.out.println ( nums[0]+1 );










    }
}
