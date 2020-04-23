package day07_IfStatements;

public class If_Else_Statements {
    public static void main(String[] args) {
        int number =137;
        if(number%2==0){
            System.out.println(number +" is even number");
        }
        if(number%2!=0){
            System.out.println(number+ " is odd number");
        }
        System.out.println("==============================================");
        boolean evenNumber =number%2==0;

        if(evenNumber){
            System.out.println(number + " is even number");
        } else{
            System.out.println(number + " is odd number");
        }

        int age =30;
        if(age>=21){
            System.out.println("Here is your Wine");
        }else{
            System.out.println("Here is your Coca Cola");
        }

        boolean testedPositiveForCorona=true;
        if(!testedPositiveForCorona){
            System.out.println("Buy more toilet paper and stay home");
        }else{
            System.out.println("Come to work");
        }










    }
}
