package day04_JavaRecap;

public class VariablePractice {
    public static void main(String[] args) {
        //DateType variableName =  Data;

        byte num1 = 127;
        short num2 = num1;// double > float > long >int > short > byte
       // byte num3=num2;
         int num4=num2;//int is prefered by the compiler
         long num5=99999999l;
         float num6=100l;
        System.out.println(num6);//  100.0
        float num7=0.5f;
        System.out.println(num7);//0.5
        double num8=num7;
        double num9=99999999l;
        double num10=100.5;
        System.out.println(num9);
        System.out.println(num10);
        char ch1='$';//every single character has a corresponding number
        System.out.println(ch1);//$
        char ch2=2500;//0 ~65565
        System.out.println(ch2);
        int a1='8';
        System.out.println(a1);//56
        int a2 = 'z';
        System.out.println(a2);//122
        double d1='z'+'8';
        System.out.println(d1);//178.0
        char ch3=178;
        System.out.println(ch3);
        char ch4='z'+'8';
        System.out.println(ch4);

        boolean bool1=true;
        boolean bool2=false;

        System.out.println(9>10);//false
        System.out.println(9>=9);//true
        System.out.println(9 != 9);//true
        System.out.println('a'=='b');//false
        //System.out.println('a'=="a") ' ' not match with ""
        System.out.println('a'=='b'-1);//true
                  //        97==98-1===>true
        System.out.println("parizat" == "good ppl");//false

        System.out.println("parzat"!="good ppl");//true

        System.out.println("Parizat" =="parizat");//false

        boolean r1=!true;//false
        System.out.println(r1);
        System.out.println(!r1);

        System.out.println(!true==false);//true
        System.out.println(!true != !false);//true


     float a =10L;











    }











    }






