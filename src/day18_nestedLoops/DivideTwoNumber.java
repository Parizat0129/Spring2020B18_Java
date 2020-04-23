package day18_nestedLoops;
/*
write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators
			10/3==>3 with a remainder of 1
			10-3-3-3 =1
		a=	a-b=7;
		a=a-b=  4;
		a=a-b=1;
		count =3, a=1
 */
public class DivideTwoNumber {
    public static void main(String[] args) {

        int a=20;
        int b=0;
        int count =0;// count the execution of the loop
       if(b==0){
           System.out.println("Divisor can not be zero");
           System.exit(0);
       }


        while (a>=b){
            a-=b;
            count++;
        }
        if(a==0) {
            System.out.println("The result is " + count);
        }else{
            System.out.println("The result is "+count+" with a reminder of "+a);
        }



















    }
}
