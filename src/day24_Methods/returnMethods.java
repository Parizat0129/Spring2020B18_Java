package day24_Methods;

public class returnMethods {

    public static void maxNum(int a, int b){
        if(a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static void main(String[] args) {


        //maxNum(10,20);

        int result=Addition(10,20);

        System.out.println(result);//30

        int result2=result+20;//50

    }

    public static int Addition(int a,int b){
       // System.out.println(a+b);
        return  a+b;
    }

}
