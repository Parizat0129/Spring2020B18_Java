package OffieceHours.PractceAThome;

public class Review_IfStatement {
    public static void main(String[] args) {
        /*
        single if:
        if(boolean expression){//A
        }
  */
        if (9>8){
            System.out.println("9 is greater than 8");
        }
        // task01:
        int num1=900;
        int num2=900;
        int max=0;// local variable to be initial before use
        if(num1>num2){ // mean that num1 is greater than num2
           // false
            max+=num1;
            //max =num1;
        }
        if(num2>num1){
            max+=num2;
         //max=num2;
        }
        if(num1==num2){
            max+=num1;
           // max=num1;
            System.out.println("    both number are equal");

        }
        System.out.println("Maximum number between "+ num1+ " and "+num2+ " is "+max);

        System.out.println("=========================================================");
        int hours=25;
        int minutes=45;
        int seconds=30;


        String amOrPm="am";
        System.out.println(hours+ ":"+minutes+ ":"+seconds+" "+ amOrPm);


        System.out.println("====================================================");
//   solution1:
        int n1=1000;
        int n2=800;
        int n3=700;
        int maximum= 9;
        //in order n1 to be the maximum :n1>n2 && n1>n3;
        //in order n2 to be the maximum: n2>n1&&n2>n3
        //in order n3 to be the maximum: n3>n1&&n2>n3;
        if(n1>n2 && n1>n3){
            maximum=n1;
        }
        if(n2>n1&&n2>n3){
            maximum=n2;
        }
        if(n3>n1&&n3>n2){
            maximum=n3;
        }

        System.out.println("Maximum number between "
                +n1+", "+n2+" and "+n3+ " is "+maximum);

String result= "Maximum number between"+n1+", "+n2+","+n3+" is:"+maximum;
        System.out.println(result);

        //solution2:
        if(n1>n2&&n1>n3){
            System.out.println("Maximum number is "+n1);
        }
        if(n2>n1&&n2>n3){
            System.out.println("Maximum number is "+ n2);
        }
        if(n3>n1&&n3>n2){
            System.out.println("Maximum number is "+n3);
        }

        System.out.println("===============================================");
        

















    }
}
