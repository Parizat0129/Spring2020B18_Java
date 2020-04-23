package day07_IfStatements;

public class MinNumber {
    /*
    write a java program that accepts three numbers
    and return the minimum number
				(assume that none of them are equal)
     */
    public static void main(String[] args) {
        double a=100000.454;
        double b=121231.432;
        double c=34234.33;
        boolean aMinNumber=a<b &&a<c;
        boolean bMinNumber=b<a && b<c;
        boolean cMinNumber= c<a && c<b;
        if(aMinNumber){
            System.out.println(a+ " is the minimum number");
        }
        if(bMinNumber){
            System.out.println(b+ "is the minimum number");
        }
        if(cMinNumber){
            System.out.println(c + " is the minimum number");
        }









    }



}
