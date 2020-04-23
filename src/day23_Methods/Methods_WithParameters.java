package day23_Methods;

import java.util.Scanner;

public class Methods_WithParameters {

    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scan= new Scanner(System.in);
        byte age=scan.nextByte();
        EligibleToBuyAlcohol(age);

    }


    public static void EligibleToBuyAlcohol(int age){
        if(age>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Eligible to buy milk");
        }
    }


}
