package day10_Siwch_Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        /*
        write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12
         */
        byte month=12;
        String days=" ";
        if(month>=1&&month<=12){
            if(month==1||month==3 || month==5
                    ||month==7 ||month==8 ||month==10||month==11 ||month==12){
                days="Days in this month are 31 days";
            }else if(month==2){
                days="Days in this month are 28 days";
            }else{
                days="Days in this month are 30 days ";
            }

        }else{
            days="Invalid Entry";
        }
        System.out.println(days);
        System.out.println("======================================================");
        int num=12;
        boolean days28=num==28;
        boolean days30=num==4||num==6||num==9||num==11;
        String result="";
        if(num>0&&num<13){
            result=(days28)?"Has 28 days":(days30)?"Has 30 days":"Has 31 days";

        }else{
            result="Invalid";
        }
        System.out.println(result);


















    }


}
