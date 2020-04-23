package OffieceHours.PractceAThome;
/*
Given an int variable n that has already been declared and initialized to a positive value, and another int variable j that has already been declared, use a for loop to print a single line consisting of n asterisks. Thus if n contains 5, five asterisks will be printed. Use no variables other than n and j.

Example:
input: 1
output: *

Example:
input: 3
output: ***

 */
public class Div3Forloop_EvenNumber {
    public static void main(String[] args) {


        for(int i=1;i<=20;i++)
            if(i%3==0){
                System.out.print(i+" ");
            }


        System.out.println();

        for(int n=1;n<=100;n++){
            if(n%2==0){
                System.out.print(n+",");
            }
        }




    }
}
