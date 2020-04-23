package day23_Methods;

public class Methods_WithParameter2Reverse {
    // create a function revers any string

    // "Muhatar"==>rathuM,  "Cybertek"===>ketrebyC

    public static void main(String[] args) {

        String names="Parizat";
        ReverseString(names);
        System.out.println("Hello");

        String name2="Cybertek School";
        ReverseString(name2);

    }

    public static void ReverseString(String str){

        for (int i= str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));

        }
        System.out.println();
    }




}
