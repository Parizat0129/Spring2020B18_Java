package day06_shorthand_loggicalOperators;

public class Warmup_task {
    public static void main(String[] args) {
        /*
        convert gallons to gallons
        1 gallon =3.785 liters
        1 litter = 1/3.785
         */

        double numberGallons=1;
        double gallonToLiters=numberGallons*3.785;
        String result = numberGallons + " gallons is equal to: " + gallonToLiters + " liters";
        System.out.println(result);

        System.out.println("=================================================");
        //liters to gallons:
        double numberOfLiters=1;
        double literToGalions= numberOfLiters/3.785;
        String result2= numberOfLiters +" liters equal to: "+ literToGalions + " galons";
        System.out.println(result2);


        System.out.println("====================================================");

        int a =200;//201,  200,  199
        int b= -a++ + - --a * a-- % 2;
        //b=   -200 + -200 * 200%2
        //b= -200  + - 40000%2
        //b=-200 +0
        //b= -200
        System.out.println(b);
        System.out.println(a);//199

        System.out.println("================================================================");

        int x = 300;
        int y =400;
        int z =x  +  y -    x*y +       x/y;   //-119300
        //z=   300 + 400 -  300*400  +   300/400
        // z=  300 + 400  - 120000 + 300/400
        //z= 300 + 400 -120000 +0          int =300/400===>0.75; ==>0
        //z= 700 - 120000
        System.out.println(z);










    }


}
