package day14_StringClass2;

public class Practice {
    public static void main(String[] args) {
        String gmail="cybertekschool@gmail.com";

        String userinputGmail="CybertekSchool@gmail.com";

        boolean result=gmail.equalsIgnoreCase(userinputGmail);//false

        if(result){
            System.out.println("Logged in");
        }
        System.out.println("======================================");
/*
valid password MUST contain a special characters such as (!, $ ,_)
valid password should not contain spaces
 */
    String PassWord="mma sd1235";
    if(PassWord.contains(" ")){
        System.out.println("Password cannot have space in it");
    }else{
        System.out.println("valid password");
    }
        System.out.println("====================================");
    /*
    every website has "www." at the begenning of the web address
     */
       String webAddress="www.amazon.com";
        webAddress=webAddress.toLowerCase();

     if(webAddress.startsWith("www.")){
         System.out.println("Valid");
     }else{
         System.out.println("Invalid");
     }

        System.out.println("==========================================");
     /*
     every single gmail address ends with @gmail.com
      */

     String email="CybertekSchool@Yahoo.com";
     if(email.endsWith("@gmail.com")){
         System.out.println("Valid Gmail");
     }else{
         System.out.println("Invalid Gmail");
     }
/*
write a program that can validate if a web address is valid
valid web address:
MUST starts with www.
MUST ends with .com ,    .edu,  .net,  .Gov
 */
      String web="www.lydia.com";
      web=web.toLowerCase();

      /*if(web.startsWith("www.")&&web.endsWith(".com")){
            System.out.println("Valid Webs");
      }else{
          System.out.println("Invalid Web");
      }

       */

       boolean validEnding=web.endsWith(".edu")||web.endsWith(".gov");
       if(web.startsWith("www.")&&validEnding){
           System.out.println("Valid address");
       }else{
           System.out.println("Invalid address");
       }



    }
}
