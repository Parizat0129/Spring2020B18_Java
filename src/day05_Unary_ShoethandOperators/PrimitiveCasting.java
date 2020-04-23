package day05_Unary_ShoethandOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {

        //implicit casting: done automatically
       int a =10;
       long b=a;// implicit casting is done automatically
       //b=10l
        //int c =b; //b is still long datatype
        int a1=100;
        long b1=(long)a1;//manually doing the doing the implicit casting

        //Explicit casting:casting larger primitive type to smaller type .

        int Inum =100;
        byte Bnum=(byte)Inum;
        short Snum=(short)Inum;// also byte

        double Dnum=5.5;
        float Fnum=(int)Dnum;//5.0
        //      Fnum=(int)5.5
        //      Fnum=5 ;
        //      Fnum=5.0  ;
        System.out.println(Fnum);

        double D1=10.5;
      //  long L1 = (long)((float)D1);
        long L1= (int)D1;
        System.out.println(L1);

        float F1=60.5f;
        int I1=(int)F1; //prefered
        System.out.println(I1);

        long largeNum=999999999l;
        int intNum=(int)largeNum;
        System.out.println(intNum);// it give a different number  coz 9is out of int range

        char ch1='a';
        short sh1=(short)ch1;
        System.out.println(sh1);

        char ch2=23456;
        double dbl1=ch2;
        System.out.println(ch2);//23456.0
        System.out.println(dbl1);

        int z1=10;
        double t1b=z1;//  10.0
        System.out.println(t1b);

        short y1= (short)z1; // 10
        System.out.println(y1);









    }
}
