package day17_WhileLoops;

public class Frequency {
    public static void main(String[] args) {
      String str="java java java"  ;// is fun,java is cool


        int count=0; // 2

        String word="Java";  // to ignoring the case sensitivetiy by vonverting both to lowercase or uppercase

        while(str.contains(word)){

            count++;

            str=str.replaceFirst(word,"");

        }

        System.out.println(count);







    }

}
