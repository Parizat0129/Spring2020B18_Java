package OffieceHours.Practice_03_18_2020;

public class shortHand_Practice {
    public static void main(String[] args) {
        // +=: addition assignment

        int a=100;
        //a=a+200;===>300
        a+=200;//  a=300
        System.out.println(a);
        a+=200*3;// 900
        // a+=600
        //  a=600+300====>900
        System.out.println(a);

        //-= : subtraction assignment
        //   a=a-400===>500
        a-=400;// 500
        System.out.println(a);

        int b =300;
        b-=3*40;
        // b-=120
        // b=300-120 =====>180
        System.out.println(b);

        //*= : multiplication assignment
        int x=5;
        //  x=x*3; ===>15
        x*=3;//====>15
        System.out.println(x);
        x *=2+1;
        // x *= 3
        //  x=3*15  ====>45
        System.out.println(x);

        // /= : division assignment
        int n=900;
        // n=n/3===>300
        n/=3;  // ====>300
        System.out.println(n);

        n/= 3*5;
        // n/= 15
        // n=300/15===>20
        System.out.println(n);

        // %= : remainder assignment
        //  remainder : numerator - (denominator * whole Number for the result)

        int m=10;
        //    m=m%3;====>1
        m %=3; // m =1
        System.out.println(m);
        int y=300;
        y%=3*5;
        // y%=15;
        // y=300%15 ====>0
        System.out.println(y);

        int t=400;
        t%=10*2;
        //  t%=20
        //t=400%20
        //t = 0
        System.out.println(t);









    }
}
