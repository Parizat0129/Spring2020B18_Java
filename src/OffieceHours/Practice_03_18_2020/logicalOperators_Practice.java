package OffieceHours.Practice_03_18_2020;

public class logicalOperators_Practice {
    public static void main(String[] args) {
        // ||   &&  !
        boolean r1="Parizat"  ==  "bad Guy"; // false
        System.out.println(r1);
        boolean r2="Parizat" !=  "Good Guy"; // true
        System.out.println(r2);

        boolean r3 = 10>=9; // true
        System.out.println(r3);

        boolean r4= !false ==!true;  // false
        //           true  == false
        System.out.println(r4);

     //    ||:
        boolean result1=9!=8 || 9==8;
        //              true  || false
        //                 true
        System.out.println(result1);

        boolean result2 = 'a'=='A' || 'A' =='b';
        //             false  ||  false
        System.out.println(result2);


        //   && :
        boolean result3 = 6>5 && 6<4;
        //              true  &&   false
        //              false
        System.out.println(result3);

        boolean result4 = !false !=false && !true == false;
        //                true != false && false ==false
        //                  true  &&   true======>true
        System.out.println(result4);





    }

}
