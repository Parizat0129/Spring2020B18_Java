package OffieceHours.PractceAThome;

public class Number_plus {
    public static void main(String[] args) {

        System.out.println(5+7+"8");//128
        //                 12+8====>128
        System.out.println("8"+5+7);//857
        //               "85"+7
        //                857
        System.out.println(5 +7 +"8" + 5 +7);//12857
        //                 12+ "8" +5 +7
        //                  "128"+ 5+7
        //                   "1285"+7
        //                12857

        System.out.println(5+7+"8"+ (5+7));//12812
        //                 12+"8" +12

        System.out.println(1+11+"3"=="123");
        //                  12+"3"=="123"
        //                   123="123"

    

    }
}
