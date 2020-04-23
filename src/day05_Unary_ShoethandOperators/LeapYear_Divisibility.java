package day05_Unary_ShoethandOperators;

public class LeapYear_Divisibility {
    public static void main(String[] args) {
        short year =2020;
        boolean LeapYear = 2020%4==0;// if the year can be devided by 4 without any reminder, then it's leap year.
        //if returns true ===>leapYear,if it return false ==>not leapYear
        System.out.println(year+ " is Leap year: " + LeapYear);
        String result =year + " is leap year: "+ LeapYear;
        System.out.println(result);
/*
2. Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
			Ex:
				number = 65;  ==> int
				divisibleBy2 ==> true/false
				divisibleBy3 ==> true/false
				divisbileBy5 ==> true/false
			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
				number = 80;
			output:
				80 is divisible by 2: true
				80 is divisible by 3: false
				80 is divisible by 5: true
 */
        int number = 65;
        boolean divisibleBy2 = number%2==0;
        // if the number can be divided by 2 without any remainder,
        boolean divisibleBy3 =number%3==0;
        boolean divisibleBy5= number%5==0;

        String result1= number +" is divisible by 2 "+ divisibleBy2;//concatenation
        String result2 = number +" is divisible by 3 "+ divisibleBy3;
        String result3= number +" is divisible by 5 "+ divisibleBy5;
        String finalResult= result1+ "\n"+result2 +"\n"+ result3;
        System.out.println("\n");


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(finalResult);



        System.out.println("\n");

        System.out.println(number +" is divisible by 2: "+ divisibleBy2);

        System.out.println(number+ " is divisible by 3: "+ divisibleBy3);
        System.out.println(number+" is divisible by 5: "+divisibleBy5);

        System.out.println("\n");

        int b =80;
        boolean divisibleBy4 = b%2==0;
        boolean divisibleByn5 =b%3==0;
        boolean divisible6= b%5==0;
        System.out.println(b + " is divisible by 2: "+ divisibleBy4);
        System.out.println(b+ " is divisible by 3: "+ divisibleByn5);
        System.out.println(b+" is divisible by 5: "+divisible6);











    }
}
