package day13_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {
        String str ="I like java programming john";
        //           01234567
        int num1=str.indexOf("john");
        System.out.println(num1);


        String str2="Cybertek school is awesome";
        //           0123456789
        int firsts=str2.indexOf("s"); // 9
        int seconds=str2.indexOf("is")+1;
        //   str2 indexOf("is") returns the index number of i
        System.out.println(firsts);
        System.out.println(seconds);

        int maxIndenumber = "Cybertek".length()-1;//8-1
        System.out.println(maxIndenumber);


        String names = "Muhtar";
                int a1=names.indexOf("Good Guy");
        System.out.println(a1);



        String fullname="Parizat Aiziz";
        String firstname=fullname.substring(0, fullname.indexOf(" "));
        String lastname=fullname.substring(fullname.indexOf(" ")+1);

        System.out.println(firstname);
        System.out.println(lastname);



    }
}
