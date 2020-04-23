package day12_JavaRecap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class SalaryReport {
    public static void main(String[] args) {
     /*
     ask the user enter salary
        ask the user enter full name
        ask the user to enter company name
        ask the user to enter SSN
        ask the user to enter JobTitle
      */
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your Salary:");//10000+Enter
        double salary=input.nextDouble();//10000

        input.nextLine();//  Enter

        System.out.println("Enter your Full Name:");
        String fullName=input.nextLine();

        System.out.println("Enter your company name:");
        String companyName=input.nextLine();

        System.out.println("Enter your SSN");
        long SSN=input.nextLong();

        input.nextLine();

        System.out.println("Enter your JobTitle ");
        String JobTitle=input.nextLine();

        System.out.println("Full name is: "+fullName);
        System.out.println("Job Title is: "+JobTitle);
        System.out.println("Company name is: "+companyName);
        System.out.println("SSN: "+SSN);
        System.out.println("Salary is: $"+salary);











    }
}
