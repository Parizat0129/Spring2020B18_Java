package day05_Unary_ShoethandOperators;

import java.security.spec.RSAOtherPrimeInfo;

public class PostPre {
    public static void main(String[] args) {
        // pre : change the value of the varaible immediately

        int a =100;
        System.out.println(++a);//a=101
        System.out.println(a);//101

        int b=100;
        System.out.println(--b);//99
        System.out.println(b);//99

        // Post:first passes the current value,then eventually changes the variable's value

        int A=100;
        System.out.println(A++);// first print 100,then print 101
        System.out.println(A);//101

        int B=100;
        System.out.println(B--);//100
        System.out.println(B);//99

        /*
        Batch12 javangers
        Batch11 spartans
         */

        //Post& Pre examples:
        int z=10;
        int x=++z;//at line 32, x is incerase by 1
        System.out.println(x);//11
        System.out.println(z);//11

        int s=10;
        int f=s++;
        System.out.println(f);//10 after line 40,the value of s will increased by 1
        System.out.println(s);//11


        double t1=3.5;
        double t2=t1--;
        System.out.println(t2);//3.5 after line 46 t1 will be decreased by1
        System.out.println(t1);//2.5


        int num=35;
        System.out.println(num++);//35 after line 51 the value of num will be 36
        System.out.println(num--);//36 after line 52  the value of num will be 35






        long c =30l;
        long e =(short)c;
        System.out.println(e);


















    }



}
