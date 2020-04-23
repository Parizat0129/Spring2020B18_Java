package OffieceHours.Practice_03_25_2020;

public class NestIf_Practice2 {
    public static void main(String[] args) {
/*
for the loan:
if this person has a job that pays>50000===>might be eligible
    if this person has good credit
    if job history is more than 2 yrs===>then eligible

 */
int salary = 65000;
int creditScore=450;
byte jobHistory=1;
if(salary>50000){//might be eligible

    if(creditScore>=650){// might be eligible
        if(jobHistory>=2){
            System.out.println("You are qualified");

        }else{
            System.out.println("You do not have enough job history,come back later");
        }

    }else{// not eligible due to credit score
        System.out.println("You do not have good credit score");
    }



}else {
    System.out.println("You need to have job that pays $5000");
}









    }

}
