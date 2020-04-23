package OffieceHours.Practice_03_25_2020;

public class Multi_Branch_if_Practice {
    public static void main(String[] args) {
       int number=0;
       if(number>0){
           System.out.println("it's positive number");
       }else if(number<0){
           System.out.println("it's negative number");
       }else{
           System.out.println("it's zero");
       }



       int num1=100;
       int num2=200;
       if(num1>num2){
           System.out.println(num1+" is greater than "+ num2);
       }else if(num2>num1){
           System.out.println(num2+" is greater than "+ num1);
       }else{
           System.out.println(num1+" is equal to "+ num2);
       }
        System.out.println("==========================================");

       String browseName=" ";
       if(browseName=="Firefox"){
           System.out.println("Firefox browse is opening");
       }else if(browseName=="Chrome"){
           System.out.println("Chrome browse is opening");
       }else if(browseName=="Internet Explore"){
           System.out.println("IE is opening");
       }else if(browseName=="Safari"){
           System.out.println("Sfari is opening");
       }else if(browseName=="Opera"){
           System.out.println("Opera is opening");
       }else{
           System.out.println("Invalid Browse Name");
       }








    }
}
