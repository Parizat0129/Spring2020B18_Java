package day14_StringClass2;

import java.util.Scanner;

public class credentials2 {
    public static void main(String[] args) {
    /*
    valid credential are
    username: cybertek
    password:cybertekschool

    precondition username and password not empty
    if they are empty ==>please enter the credentials

    if user entered both valid username and password ==>log in
    if valid password, invalid username ==>username is incorrect
    if valid password, invalid password ==>password is incorrect
    if both password and username are invalied ==> invalid username and password
     */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUsername = input.nextLine();
        System.out.println("Enter your password");
        String inputPassword = input.nextLine();
        boolean logedIn = inputUsername.equals("Cybertek") && inputPassword.equals("cybertekschool");
        boolean InvalidUserName = !inputUsername.equals("Cybertek") && inputPassword.equals("cybertekschool");
        boolean InvalidPassWord = inputUsername.equals("Cybertek") && !inputPassword.equals("cybertekschool");


        if (!inputUsername.isEmpty() && !inputPassword.isEmpty()) {// user and password not empty

            if (logedIn) {
                System.out.println("Logged in");
            } else if (InvalidUserName) {
                System.out.println("Password is correct, username is incorrect");
            } else if (InvalidPassWord) {
                System.out.println("Password is incorrect, username is correct");
            } else {
                System.out.println("Both username and password are incorrect");
            }
        }else{
            System.out.println("Please enter the credentials");
        }


            }
        }
