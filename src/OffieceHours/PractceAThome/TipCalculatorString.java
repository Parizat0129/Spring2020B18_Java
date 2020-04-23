package OffieceHours.PractceAThome;

import java.util.Scanner;

public class TipCalculatorString {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Split:");
        String split=input.nextLine();
        System.out.println("Number of people:");
        int numberOfPeople=input.nextInt();
        System.out.println("Check amount:");
        double amount=input.nextDouble();
        System.out.println("Service Quality:");
        String service=input.next();

        String result=(numberOfPeople==1)?"&":(numberOfPeople==2)?"&&"
                :(numberOfPeople==3) ?"&&&":(numberOfPeople==4)?"&&&&":"&&&&&";

        System.out.println("Number of people entered: "+result);
      double tip=0;
           if(service.equalsIgnoreCase("Poor")){
            tip=amount*0.05;
           }else if(service.equalsIgnoreCase("Fair")){
               tip=amount*0.10;
           }else if(service.equalsIgnoreCase("Good")){
               tip=amount*0.15;
           }else if(service.equalsIgnoreCase("Great")){
               tip=amount*0.20;
           }else{
               tip=amount*0.25;
           }


        System.out.println("Total to pay: "+(amount+tip));
        System.out.println("Total tip: "+tip);
        System.out.println("Total per person: "+(amount+tip)/numberOfPeople);
        System.out.println("Tip per person: "+tip/numberOfPeople);









    }
}
