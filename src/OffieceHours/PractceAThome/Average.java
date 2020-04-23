package OffieceHours.PractceAThome;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()};

        int length=temps.length;

        for(int i=0; i<=length-1;i++){
            double eachNum =temps[i];
            total+=eachNum;
        }

        avgTemp=total/length;
        System.out.println(avgTemp);


















    }
}
