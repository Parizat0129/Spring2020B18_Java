package day08_IF__Statements;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        int a =-9;
       /*
        boolean zero=a==0;
        boolean negative= a<0;
        boolean positive=a>0;

        if(zero){
            System.out.println("zero");
        }
        if(negative){
            System.out.println("Negative");
        }
        if(positive){
            System.out.println("Positive");
        }

        */
        if(a==0){
        System.out.println("zero");
        }else if(a>0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }






    }

}
