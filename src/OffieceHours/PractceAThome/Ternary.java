package OffieceHours.PractceAThome;



public class Ternary {
    public static void main(String[] args) {
        int num=0;
        if (true)
            num=100;
        else
            num=50;

        System.out.println(num);
        /*
        Ternary:
        if (condition)==>(Condition)?
        else        =====>     :
        else if(Condition)      =====> :(Condition) ?
         */
        num=(true)?100:50;
        System.out.println(num);








    }
}
