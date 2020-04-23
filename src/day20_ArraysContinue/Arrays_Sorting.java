package day20_ArraysContinue;
import java.util.Arrays;
public class Arrays_Sorting {
    public static void main(String[] args) {
        int [] arr1={9,8,7,6,5,4,3,2,1};

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println("First min number is "+ arr1[0]);

        System.out.println("Second min number is "+ arr1[1]);

        System.out.println("First maximum number is "+arr1[arr1.length-1]);

        System.out.println("Second maximum number is "+arr1[arr1.length-2]);

        System.out.println("==========================================");

        char [] ch={ 'z', 'd', 'e','a','b','f','c'};

        Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));

        String[]names={"Deniz", "Osman",  "Rustam","Ali","Ann","Adil"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
        System.out.println("====================");

        int[] arr={3,1,4,-100,100,155,200 };

        int[] arrDesc=new int[arr.length]; //[0,0,0,0,0,0,0,]
        //                   index :          0,1,2,3,4,5,6


        Arrays.sort(arr);  // [-100,1,3,4,100,155,200]
        //             index:   0,   1,2,3,4,  5,  6


        int k=0;

        for(int i=arr.length-1;i>=0;i--){



            arrDesc[k]=arr[i];

            k++;
        }


        System.out.println(Arrays.toString(arrDesc));











    }
}
