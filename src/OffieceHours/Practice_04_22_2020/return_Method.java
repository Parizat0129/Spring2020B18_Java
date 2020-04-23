package OffieceHours.Practice_04_22_2020;

public class return_Method {
    public static void main(String[] args) {

        sum(10,20);

       int num1= sum2(10,20);
        System.out.println(num1);

        System.out.println("=====================");
        String str="Parizat";


        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }

        System.out.println(result);

        String str2="Anna";
        String result2=Revers(str2);
        System.out.println(result2);
        System.out.println(str2.equalsIgnoreCase(result2));

    }

public static String Revers(String str){
    String result="";
    for(int i=str.length()-1;i>=0;i--){
        result+=str.charAt(i);
    }
       return result;
}

public static void sum(int a,int b){
    System.out.println(a+b);
}

public static int sum2(int a, int b){
        return a+b;
}










}
