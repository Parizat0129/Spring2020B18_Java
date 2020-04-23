package OffieceHours.PractceAThome;

public class IfStatement_Practice {
    public static void main(String[] args) {
        /*
   1. A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares three integers as angles and check whether a triangle is valid or not.
	2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
	3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
	4. write a java program that accepts three numbers and rteurn the mediam number
				(assume that none of them are equal)
	5. write a java program that can identify if a person is eligible to vote for Donald Trump
	Note : use single if statements


     */
        int angleA=60;
        int angleB=60;
        int angleC=60;
        int triangle=angleA+ angleB+ angleC;
        if(triangle==180){
            System.out.println("Triangle is valid");
                }
        if(triangle!=180){
            System.out.println("Triangle is not valid");

        }
        int age=18;
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        if(age<18){
            System.out.println("Not eligible to vote");
        }






    }
}