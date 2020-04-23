package OffieceHours.Practice_04_08_2020;

public class ForLoop_Task {
    public static void main(String[] args) {
        /*
        print 0~100 divisible 3 or 5
         */

        for(int i=0;i<=100;i++){

            if(i%3==0||i%5==0){
                System.out.print(i+" ");
            }

        }

        System.out.println();
        System.out.println("===========================");

        String name="parizat";
        //           01234567
        String result="";
        int lastIndex=name.length()-1;

        for(int i=lastIndex;i>=0;i--){
           // result+=name.charAt(i);
            result+=name.substring(i,i+1);

        }
        System.out.println(result);

        if(name.equalsIgnoreCase(result)){
            System.out.println(name+" is palindrome name");
        }else{
            System.out.println(name+" is not palindrome name");
        }














    }
}
