package day10_Siwch_Scanner;

public class days_Nested {
    public static void main(String[] args) {
/*
2. write a program that can
display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF

 */
byte num=6;
String result=" ";
if(num>=1&&num<=7){
    if(num==1){
        result="Monday";
    }else if(num==2){
        result="Tuesday";
    }else if(num==3){
        result="Wednesday";
    }else if(num==4){
        result="Thursday";
    }else if (num==5){
        result="Friday";
    }else if(num==6){
        result="Saturday";
    }else{
        result="Sunday";
    }

}else{
    result="Invalid Entry";
}
        System.out.println(result);
        System.out.println("================================================");
        String result2=" ";

            result2=(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday"
                    :(num==4)?"Thursday":(num==5)?"Friday":(num==6)?"Saturday"
                    :(num==7)?"Sunday":"Invalid";
        System.out.println(result2);
        System.out.println("=================================================");

        String result3= " ";
        if(num>0 &&num<8){
            result3=(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday"
                    :(num==4)?"Thursday":(num==5)?"Friday":(num==6)?"Saturday"
                    :"Sunday";
        }else {
            result3="Invalid";
        }
        System.out.println(result3);












    }
}
