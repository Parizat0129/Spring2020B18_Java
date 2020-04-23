package day08_IF__Statements;

public class MulitBranch_if {
    public static void main(String[] args) {
      double score=87.5;
      //max score is 100
        boolean AGrade= score>=90 && score <=100;
        boolean BGrade =score >=80&& score <90;
        boolean CGrade= score>=70 && score<80;
        boolean DGrade = score>=60 && score <70;
        char grade = ' ';
        // also can be in the ""  there has a space between "" or''
        // ===>String  grade=" ";

        if(AGrade){
            grade ='A';
        }else if(BGrade){
          grade= 'B' ;
        } else if(CGrade){
            grade='C';
        } else if(DGrade){
            grade='D';
        }else{
            grade='F';
        }
        System.out.println("Score "+ score+ " is "+ grade);






    }
}
