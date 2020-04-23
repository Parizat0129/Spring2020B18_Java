package OffieceHours.Practice_04_01_2020;

public class StringMethod {
    public static void main(String[] args) {
     // charAt(indexNumber):returns the char at the given index, char primitive
        String str1="Java ";
        //index:     0123
           char ch1=str1.charAt(3);//a
        System.out.println(ch1);
        // char ch2=str1.charAt(4);// will get : String index out of range.
        //System.out.println(ch2);

        System.out.println("======================================================");


        //length(): return the total number of char, as int.
        String str2="Cybertek School";
        int num=str2.length();
        System.out.println(num);
        int maxIndex= str2.length()-1;
        System.out.println(maxIndex);
        char ch3=str2.charAt(14);
        System.out.println(ch3);

        System.out.println("=====================================================");

        //concat():concatenation,return new String,  + also does concatenation
        String str3="Cybertek";
                str3=str3.concat(" School");//"Cybertek School"
        System.out.println(str3);

        String str4="Java";
                 str4=str4.concat(" is fun");// "Java is fun
        System.out.println(str4);

        System.out.println("===============================================");


        //toLowerCase();  &  toUpperCase():change the case og the string to upper case or lower cases.
        //                                return new String

        String str5="CYBERTEK SCHOOL";
               str5=str5.toLowerCase();//"cybertek school"
        System.out.println(str5);

        String str6="muhtar";
        str6=str6.toUpperCase();// "MUHTAR"
        System.out.println(str6);

        System.out.println("=========================================");

        //trim() :clear the space ,removes the unused the (white )spaces from string,
        //        return new string object

        String str7="        Cybertek";
                  str7=str7.trim();
        System.out.println(str7);
        System.out.println(str7.length());//17//8

        String str8="      ";
        str8=str8.trim();
        System.out.println(str8.length());//0

        System.out.println("======================================================");

        //substring(beginning index,ending index):create substring from beginning index till end index
                                        //      ( ending index is not including)
        String s1="I like Java";
              //   0123456789..   10index number  we have give +1

              // last index number=10=length-1
        String word1 =s1.substring(7,s1.length());// java; if you wanna last index you can call the length()
        String word2=s1.substring(2,5+1);
        System.out.println(word2);
            //"likeJava
        String word3=s1.substring(2,6)+s1.substring(7,s1.length());
        System.out.println(word3);

        //substring(beginning): creates substring from beginning index till end of the string.
                           //   it will return us new string
        String s2="I like to learn Java";
               //  0123456789
        String word4=s2.substring(10);// "learn Java";
        System.out.println(word4);

        String r2="Java";//JaVa
                // 0123
        String r3=r2.substring(0,2);//Ja

        String r4=r2.substring(2,3);//v
        r4=r4.toUpperCase();//V

        String r5 =r2.substring(3);//a
        String result=r3+r4+r5; //JaVa
        System.out.println(result);

        System.out.println("================================================");



        // replace(old str,new str): replaces all the matching ones, returns new string

        String str="I like C#, C# is cool";
        str=str.replace("C#","Java");// I like Java, Java is cool

        System.out.println(str);


        //replaceFirst(old str,new str):replaces First the matching ones, returns new string

        String t1="Java is fun, Java is good";
          t1=t1.replaceFirst(", Java",", C#");//C# is fun,Java is good
        System.out.println(t1);

        System.out.println("======================================================");


        // indexOf(str):return the index of first matching character, as an int
        String y1="Today W is Wednesday";
        int a1=y1.indexOf("W");
        System.out.println(a1);// first W index' mum  6
        int a2=y1.indexOf("Wednesday");// 11
        System.out.println(a2);

        //lastIndexOf(str):return the index of last matching character, as an int
        String y2="Cybertek School, School";
        int a3=y2.lastIndexOf("S");// last S index number
        System.out.println(a3);//9...17















    }
}
