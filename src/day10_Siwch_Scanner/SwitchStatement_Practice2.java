package day10_Siwch_Scanner;

public class SwitchStatement_Practice2 {
    public static void main(String[] args) {
        int num=0;//3
        switch (1){
            case 1:num+=3;
            break;

            case 2 :num+=2;
            break;

            case 3 :
                num+=10;
                break;

            default:
                num -=5;
                break;



        }

        System.out.println(num);














    }
}
