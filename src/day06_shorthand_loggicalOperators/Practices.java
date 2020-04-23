package day06_shorthand_loggicalOperators;

public class Practices {
    public static void main(String[] args) {


        int AppleCount = 20;
        int OrangeCount = 30;
        int PearsCount = 30;
        boolean comp = AppleCount < OrangeCount || OrangeCount >= PearsCount;

        System.out.println(comp);

        String OutsideWeather = "Shinny";
        int Degree = 70;
        boolean comp2=(!(OutsideWeather=="Rainy" || Degree==70));

        System.out.println(comp2);

        int b=2;
        boolean res= ++b ==2 || --b==2 && --b ==2;
        System.out.println(res);

        boolean x=true, z=true;
        int y=20;
        x=(y!=10) || (z=false);
        System.out.println(x);








    }
}
