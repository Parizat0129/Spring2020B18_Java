package day09_NestedIf_Ternary;

public class Loan_NestedIf {
    public static void main(String[] args) {
        double salary =20000;
        byte workHistory =1;
        if(salary>=30000){
            if(workHistory>=2){
                System.out.println("You are qualified for loan");
            }else{
                System.out.println("You must have been on job at lease 2");
            }

        }else {
            System.out.println("Your are not qualify,You must earn at least $3000");
        }





























    }
}
