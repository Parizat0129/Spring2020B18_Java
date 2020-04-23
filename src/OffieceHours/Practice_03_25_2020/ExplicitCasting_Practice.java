package OffieceHours.Practice_03_25_2020;

public class ExplicitCasting_Practice {
    public static void main(String[] args) {
        byte bnum=100;
        short snum=bnum;// implicit

        int iNum=200;
        short sNmu=(short)iNum;// explicit casting

        float fNum=(float)0.5;
        System.out.println(fNum);//0.5

        float fNum2=(long)0.5;
        System.out.println(fNum2);//0.0
     // long int short byte ===> only accepts whole numbers
        long lNum1=(int)4.5;
        //           long or short byte;
        System.out.println(lNum1);//4

        System.out.println(9/2);//4
        System.out.println(9/(float)2);//4.5
        System.out.println(10.0/3);//3.33333333














    }

}
