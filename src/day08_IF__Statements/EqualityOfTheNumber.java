package day08_IF__Statements;

public class EqualityOfTheNumber {
    public static void main(String[] args) {
        /*
        1.  write a program that can check the equality of the three given numbers
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are equal ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are equal ==> none of them are equal

         */

        double n1=100;
        double n2=200;
        double n3=100;
        if(n1==n2&& n1!=n3){
            System.out.println("ni is equal to n2");
        }
        if(n2==n3&&n1!=n3){
            System.out.println("n2 is equal to n3");
        }
        if(n3==n1&&n2!=n1){
            System.out.println("n3 is equal to n1");
        }
        if(n1==n2&&n2==n3){
            System.out.println("all of them are equal");
        }
        if(n1!=n2&&n2!=n3&&n1!=n3){
         System.out.println("none of them are equal");}









    }



}
