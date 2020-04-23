package OffieceHours.Practice_04_08_2020;

public class nestedLoop_Practice {

    public static void main(String[] args) {

        for(int z=1;z<=5;z++){


            for ( int i=10;i<50;i+=10){
                System.out.print(i+" ");
            }
            System.out.println();


        }

        System.out.println("================================");

        int i1=5;
        while(i1<10){

            for ( int i=10;i<50;i+=10){
                System.out.print(i+" ");
            }
            System.out.println();


            i1++;
        }

        System.out.println("=============================================");
/*
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *

 */

        for(int a=0;a<=5;a++){

            for(int k=0;k<=20;k++){
                System.out.print("* ");
            }
            System.out.println();


        }

        System.out.println("=================================================");
/*
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *

 */

        for(int b=1;b<8;b++){

            for(int a=0;a<b;a++){
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("=================");
     /*
      * * * * * * * *
      * * * * * * *
      * * * * * *
      * * * * *
      * * * *
      * * *
      * *
      *

      */



        for(int b=8;b>0;b--){

            for(int a=0;a<b;a++){
                System.out.print("* ");
            }
            System.out.println();

        }
























    }}
