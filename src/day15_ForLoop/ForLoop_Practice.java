package day15_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {
        /*
        odd number between0~100 in a single line spearted by a space
                          1,3,5,7...
                 */
             String resultOdd="";
        for(int num=1;num<=100;num+=2){
            resultOdd+=num+" ";
            // or System.out.print(num+" ");
        }
        System.out.println(resultOdd);
        /*
        evenNumber between 0~100
                           2,4,6,8,10...
         */
        String resultEven="";
        for(int number=0;number<=100;number+=2){
            resultEven += number+" ";
        }

        System.out.println(resultEven);
















    }
}
