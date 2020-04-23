package OffieceHours.Practice_03_18_2020;

public class UnaryOperators_Practice {
    public static void main(String[] args) {
        // post :
        int a =20;//21
        System.out.println(a++);//20
        System.out.println(a);//21

        int b=30;
        int c=b--; // c ==30
        System.out.println(b);// b==29
        System.out.println(c);//c==30

        int d=40;
        int e=d++;
        // e==40  d==41
        System.out.println(e); // 40
        System.out.println(d);//41

        // post: changes the value immediately

        int x=200;
        System.out.println(--x);// x=199
        System.out.println(x);// 199
        System.out.println(x--);//199
        System.out.println(x);// 198

        int z = 100;//101//100// 99 //100
        z = z++ + --z - z-- + ++z; //======>200
     //z=   100 + 100  - 100  +  100
     //z  =  200-100+100
     // z=  200
        System.out.println(z);


     int u = 900;//901//902// 903
     int r = - ++u +  ++u + -u++;
     //  r= -901  + 902  +  -902
        // r=-901
        System.out.println(r);// -901
        System.out.println(u);// 903











    }

}
