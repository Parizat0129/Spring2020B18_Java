package day13_StringClass;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringManipulations2 {
    public static void main(String[] args) {
      String str = "Cybertek School is the best";
      //            012345678
      String schoolName=str.substring(0,8);
        System.out.println(schoolName);

        String fullName="Kuzaat Altay";
        //               0123456789..11
        String firstName=fullName.substring(0,6);
        String lastName=fullName.substring(7,11+1);
        System.out.println(firstName);
        System.out.println(lastName);

        //full name=firstname + lastname
        // gmail:lastname_firstname@gmail.com
        String Murtaza="Murtaza Nazeeri";
        //              0123456789      14
        String firstname=Murtaza.substring(0,6+1);
        System.out.println(firstname);
        String lastname=Murtaza.substring(8,14+1);
        System.out.println(lastname);

        //String gmail=lastname.concat("_").concat(firstname).concat("@gmail.com");
        String gmail=lastname+"_"+firstname+"@gmail.com";
        //String gmail=Murtaza.substring(8,14+1)+Murtaza.substring(0,6+1)+"@gmail.com";

        System.out.println(gmail);

        String s1="I lobe Java Programming Language";
        //         0123456789
            String className=s1.substring(7);
            System.out.println(className);

              String s2="I like C# Programming C# C#";
              s2= s2.replace("C#","Java");
              System.out.println(s2);

              String name="COVID 18";
              name=name.replace("8","9");
              System.out.println(name);


              String r1="I like C#, C# is fun, C# is cool";
              r1=r1.replaceFirst("C#","Java");
        System.out.println(r1);

        String r2="Tomorrow is Monday, Tomorrow is Tuesday";
        r2=r2.replaceFirst("Tomorrow","Today");
        System.out.println(r2);










    }
}
