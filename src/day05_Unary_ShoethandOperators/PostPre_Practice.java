package day05_Unary_ShoethandOperators;

public class PostPre_Practice {
    public static void main(String[] args) {
        int a = 50;// 49
        a= --a +  a++  +    a--  +    a++;
        //49 +    49   +   50   +     49 =====>197
        System.out.println(a);//197
        System.out.println(++a);//198
        System.out.println(a++);//198
        System.out.println(a);//199

        int b =1;//0
           b = -b--  +  b++  / -b--   *--b ;
        // b=  -1    +  0     /-1  * -1
        // b=    -1 +0*-1
        b=-1;
        System.out.println(b);

        int x=4;//3
        int y= x*4  - x++    ;
//          y=16 -    4
        //y = 12;
        System.out.println(y);






    }
}
