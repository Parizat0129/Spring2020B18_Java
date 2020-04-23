package OffieceHours.PractceAThome;

import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter item1, count and ite price:");
        String item1=input.nextLine();
        int count1=input.nextInt();
        double price1=input.nextDouble();


           input.nextLine();
        System.out.println("Enter item2, count and ite price:");
        String item2=input.nextLine();
        int count2=input.nextInt();
        double price2=input.nextDouble();


        input.nextLine();
        System.out.println("Enter item3, count and ite price:");
        String item3=input.nextLine();
        int count3=input.nextInt();
        double price3=input.nextDouble();


        double total1=count1*price1;
        double total2=count2*price2;
        double total3=count3*price3;
        String report=" ";
        if(count1!=0&&count2!=0&&count3!=0){
           report="Item1: "+item1+" Price: "+total1+", Item2: "+item2+" Price: "+total2+", Item3: "+item3+" Price: "+total3;

        }else if(count1!=0&&count2==0&&count3!=0){
            report="Item1: "+item1+" Price: "+total1+", Item3: "+item3+" Price: "+total3;
        }else if(count1!=0&&count2!=0&&count3==0){
            report="Item1: "+item1+" Price: "+total1+", Item2: "+item2+" Price: "+total2;
        }else if(count1==0&&count2!=0&&count3!=0){
            report="Item2: "+item2+" Price: "+total2+", Item3: "+item3+" Price: "+total3;
        }
        System.out.println(report);

        double total=total1+total2+total3;
        System.out.println("Total price: "+total);




    }
}
