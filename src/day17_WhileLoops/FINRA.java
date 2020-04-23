package day17_WhileLoops;

public class FINRA {
    public static void main(String[] args) {
        /*
        write a program which prints out the numbers from 1 to 30:
			1. for numbers which are divisible by 3, print "FIN" instead of the number.
			2. for numbers which are divisible by 5, print "RA" instead of the number
			3. for numbers which are a divisible by both 3 and 5, print "FFINRA" instead of the number
		Ex:
			1 2 FIN 4 RA FIND .... FINDRA

         */

   String result="";
        for(int i=1;i<=30;i++){// print the number that are divisible by both 3&5
            if(i%3==0&&1%5==0){
               // System.out.println("FINRA");
                result+="FINRA ";
            }else if(i%3==0){// print the number that are only  divisible by 3

                result+="FIN ";
                //System.out.print("FIN"+" ");
            }else if(i%5==0){ // print the number that are only  divisible by 5

                result+="RA ";
               // System.out.print("RA"+" ");
            }else{ // print the number that are not  divisivele by either3 or 5
                //System.out.print(i+" ");
                result+=i+" ";
            }


        }
        System.out.println(result);























    }
}
