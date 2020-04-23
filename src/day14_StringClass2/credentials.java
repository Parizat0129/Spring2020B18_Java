package day14_StringClass2;

import java.util.Scanner;

/* userName:cybertek
  passWord:cyberteksschool

 */
public class credentials {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String ValidUserName="cybertek";
        String validPassWord="cybertekschool";

        System.out.println("Enter your username");
        String inputUsername=input.next();
        System.out.println("Enter your password");
        String inputPassword=input.next();

        if(inputUsername.equals(ValidUserName)&&inputPassword.equals(validPassWord)){
            System.out.println("Log in successfully");
        }else{
            System.out.println("Invalid credentials");
        }




    }
}
