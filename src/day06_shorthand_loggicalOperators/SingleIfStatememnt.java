package day06_shorthand_loggicalOperators;

public class SingleIfStatememnt {
    public static void main(String[] args) {
        boolean coldWather = true;
        if(coldWather){
            // true
            System.out.println("wear your hat");
            System.out.println("waer you jacket");
        }



        boolean coronaDetected = !false;
        if (coronaDetected){
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more Java coding");
        }


        System.out.println("==================================================");
        int a= 201;
        boolean evenNumber= a%2==0; // if a number can be divided by 2 without the reminder
       // boolean oddNumber = a%2!=0;// if a number cannot be divided by 2 evenly
        if (evenNumber){
            System.out.println(a + " is even number");

        }
        if (!evenNumber){ // if the number is not even number, then it must be odd
            System.out.println(a +" is odd number ");
        }





    }





}
