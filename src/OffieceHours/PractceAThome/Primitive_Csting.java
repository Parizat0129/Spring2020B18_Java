package OffieceHours.PractceAThome;

public class Primitive_Csting {
    public static void main(String[] args) {
     /*
     casting : converting larger primitive to smaller size.
                dateType variableName= (datatype)value
                casting: explicit& implicit

     primitives: byte,short,long,float,double .
      */

      int a =128;
      byte b=(byte)a;            // explicit casting.
        System.out.println(b);

       double DecimaNumber =10.5;
       float floatNumber= (int)DecimaNumber; // double >float
        // FloatNumber =10;

        System.out.println(floatNumber);
        long LongNumber =300L;
        //int IntNumber= (int)LongNumber;
        int InNumber = (short)LongNumber;// should  not using byte
        System.out.println(InNumber);

//  implicit casting:
        byte ByteNum=100;
        int IntNum2 =ByteNum;
        // same with :
        int IntNmu3=(int) ByteNum;

        short SHortNum =100;
        long LongNum2 = SHortNum;
        //  same with :
        long LongNum3 =(long)SHortNum;// auotomatically casts

        //explicit casting practices:


double LargestNumber = 100.8765;
byte ByteNumber = (byte)LargestNumber;

        System.out.println(ByteNumber);//100
        float Floatvalue =(float)LargestNumber;//100.
        System.out.println(Floatvalue);//100.8765
        float Floatvalue1 =(int)LargestNumber;
        float Floatvalue2 =(short)LargestNumber;
        float Floatvalue3 =(long)LargestNumber;

        float FloatNumber4 =500.67f;

        int number = (short)FloatNumber4;
        //            short===>  500
        //             int===>  500
        System.out.println(number);
        /*
        int num1=100;
        int num2=200;
        int num3=300;
        same with:
        */

        int num1=100, num2=200,num3=300;
        // local variables
        System.out.println(num1+ "\t"+ num2 + "\t" +num3);
        boolean result=true ;
        System.out.println(result);
        char charchter1='a';
        System.out.println(charchter1);

        boolean result1,
                result2,
                result3;
        //System.out.println(result1);












    }
}
