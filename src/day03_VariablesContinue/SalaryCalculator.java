package day03_VariablesContinue;

public class SalaryCalculator {
   /*
    int rate = 55;
    double stateTax = 0.04;
    double federalTax =0.22;
    int weeklyHours = 40;
    int totalWeek = 48;
    */
    public static void main(String[] args) {

        //dateType varibleName=date;

        double hourlyRate = 65;
        double stateTaxRate=0.04;
        double federalTaxRate=0.22;
        byte weeklyHours = 45;
        byte totalweeks = 48;
        // salary hourlyRate * weeklyHours * 52

        double salary = hourlyRate * weeklyHours *totalweeks;
        //salary before tax

        //stateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;

        // federalTax = salary * federalTaxRate
        double federalTax = salary * federalTaxRate;

        // totalTax = stateTax +federalTax
        double totalTax = stateTax +federalTax;
        //salaryAfterTax = salary - stateTax - federalTax;
        double salaryAfterTax= salary- stateTax - federalTax;

        System.out.println("Your salary is $"+salary); //concatenation
/*
        System.out.println("9"+3);//93,concatenation.
        System.out.println(9+"3");//93,concatenation.
        System.out.println(9+3);//12,addition
*/

        System.out.println("State tax is: $"+ stateTax);//concatenation
        System.out.println("Federal Tax is $"+federalTax);
        System.out.println("Total Tax is "+totalTax);
        //                                  String +  stateTax
        System.out.println("Salary After Tax is $"+ salaryAfterTax);











    }



}
