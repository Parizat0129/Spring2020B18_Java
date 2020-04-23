package day12_JavaRecap;

import java.util.Scanner;

public class CalculateAreaOfCircle {
    public static void main(String[] args) {
        /*
        write a program that can calculate the area of circle
                needed information:
              1. radius of the circle
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double r=input.nextDouble();
        double area =3.14*(r*r);
        System.out.println("Area of the circle is: "+ area);





    }
}
