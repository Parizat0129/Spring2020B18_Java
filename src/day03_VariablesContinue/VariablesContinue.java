package day03_VariablesContinue;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class VariablesContinue {
    public static void main(String[] args) {
        boolean result1 =true;
        boolean result2=false;

        boolean result3= 10>9; // true
        System.out.println(result3);

        System.out.println( true == false);

        System.out.println("parizat"=="Good Guy");//totally false
        //                 bad guy == good guy ==>false

        System.out.println("parizat"!="Good Guy");//true

        boolean r1 = true!=true;//false
        System.out.println(r1);//false

        boolean r2="batch 17"=="batch 18";//false
        System.out.println(r2);
        System.out.println("=======================");
        char ch1= 'A';
        System.out.println(ch1); //A
        char ch2=45000;
        System.out.println(ch2);

        char ch3 = 25000;
        System.out.println(ch3);

        char ch4 =100;//d
        System.out.println(ch4);

        char ch5 = 'D';//68
        System.out.println(ch5);//D

        int num1 = 'D';//number,
        System.out.println(num1);

        char a1='z';
        //byte b1=a1;//char is larger than byte
        byte b1='z';

        //short s1=a1;//char is larger than short

        int i1=a1;// int larger than char


        System.out.println(b1);










    }
}
