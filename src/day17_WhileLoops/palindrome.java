package day17_WhileLoops;

public class palindrome {
    public static void main(String[] args) {
        String str="Level";
        String reversedStr=""; // store the reversed version of str


        int lastIndex=str.length()-1;  //last index number

        while(lastIndex>=0){
           reversedStr+= str.charAt(lastIndex);
            lastIndex--;
        }
        boolean palindrome=reversedStr.equalsIgnoreCase(str);
        System.out.println(palindrome);






























    }
}
