package day19_Arrays;
/*
2. write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"
	Hint: You need nested loops
 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="AABCC";//"A2B1C2"
        String result="";//"A2B1C2"

        String nonDuplicates="";//ABC

        for(int i=0;i<=str.length()-1;i++){
            if(!nonDuplicates.contains(""+str.charAt(i))){//ig the character at index i is not contained in nonDup,then it will be concated
               nonDuplicates+=str.charAt(i);
            }
        }

        // nonDup =ABC; str =AABCC;====>result=A2B1C2;

        for(int j=0;j<=nonDuplicates.length()-1;j++){
           char ch= nonDuplicates.charAt(j);

            int count=0;  // count the total of occurence of each chararter form str

            for(int i=0;i<=str.length()-1;i++){
                if( str.charAt(i)==ch){
                    count++;
                }
            }
            result+=""+ch+count;



        }


        System.out.println(result);

























    }
}
