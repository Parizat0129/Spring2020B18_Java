package day15_ForLoop;

public class ReverseString {
    public static void main(String[] args) {
        String str="Java is fun";
        String reverse1=str.substring(3)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);

        int lastIndexNumber=str.length()-1;

        String reverse2=" ";
        for(int i=lastIndexNumber;i>=0;i--){
           // System.out.print( str.charAt(i));
            reverse2+=str.charAt(i);
        }
        System.out.println(reverse2);








    }
}
