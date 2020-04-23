package OffieceHours.Practice_03_18_2020;

public class SinleIf_Practice1 {
    public static void main(String[] args) {
     int a =200;
     int b=200;
     boolean aGreater=a>b;
     boolean bGreater = b>a;
     //boolean aEqualB= a==b;
      //  boolean aEqualB = aGreater ==false && bGreater ==false;
        boolean aEqualB = aGreater ==bGreater;
    // IF A NOT greater than B and B is NOT greater than A, then it's Equal.


     if(aGreater) {
         System.out.println(a + "is greater number");
     }
     if(bGreater){
         System.out.println(b+"is greater number");
     }
     if(aEqualB) {
         System.out.println(a + " is equal to " + b);
     }



    }



}
