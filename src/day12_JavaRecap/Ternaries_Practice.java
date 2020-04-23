package day12_JavaRecap;

import java.util.Scanner;

public class Ternaries_Practice {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter status code: ");

        int statusCodes=scan.nextInt();
        String result=" ";
        if(statusCodes==200){
            result="ok";
        }else if(statusCodes==201){
            result="Created";
        }else if(statusCodes==202){
            result="Accepted";
        }else{
            result="Invalid Status Code";
        }
        System.out.println(result);
        System.out.println("===================================================");
        String result2=(statusCodes==200)? "ok":(statusCodes==201)?"Created":
                (statusCodes==202)?"Accepted":"Invalid Status code";
        System.out.println(result2);




    }
}
