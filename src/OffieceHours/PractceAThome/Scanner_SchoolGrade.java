package OffieceHours.PractceAThome;

import java.util.Scanner;

public class Scanner_SchoolGrade {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the Grader!");

        System.out.println("Please enter subject name number 1 and score for this subject");
        String subject1=input.nextLine();
        double grade1=input.nextDouble();

        input.nextLine();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2=input.nextLine();
        double grade2=input.nextDouble();

        input.nextLine();


        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3=input.nextLine();
        double grade3=input.nextDouble();

        input.nextLine();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4=input.nextLine();
        double grade4=input.nextDouble();

        input.nextLine();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5=input.nextLine();
        double grade5=input.nextDouble();

        String summary="Summary: "+ subject1+" - "+grade1+", "+subject2+" - "+grade2+", "+subject3+" - "+grade3+", "+subject4+" - "+grade4+", "+subject5+" - "+grade5;

        System.out.println(summary);

        double average=(grade1+grade2+grade3+grade4+grade5)/5;
        System.out.println("Your average score is: "+average);

        System.out.println("Thank you for using Grader!\nGoodbye!");










    }
}
