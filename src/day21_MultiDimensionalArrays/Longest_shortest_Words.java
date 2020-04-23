package day21_MultiDimensionalArrays;
/*
       write a program that can return the logest string of text from an array
	   write a program that can return the shortest string of text from an array
 */
public class Longest_shortest_Words {
    public static void main(String[] args) {
        String [] names={"Reem","Omer","Muhatar", "Emrah","Mohammed","Ana","patizat Aize" };
        int maxLengthString=names[0].length();//4,
        int minLengthString=names[0].length();

        String longestWord="";
        String shoresWord="";
        for(int i=0;i<= names.length-1;i++){

            if(names[i].length()>maxLengthString){
                maxLengthString =names[i].length();

                longestWord=names[i];
            }

            if(names[i].length()<minLengthString){
                minLengthString=names[i].length();
                shoresWord=names[i];
            }

        }
        System.out.println(longestWord);
        System.out.println(shoresWord);


















    }
}
