package day22_Arrays_Loops;
/*
 write a program that can return the number of
 appearances of "java" and "python" anywhere in the sentence
   (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
 */
public class Java_Python {
    public static void main(String[] args) {
        String sentence="I like java and javascript python python";

        int countJava=0; //2
        int countPython=0;

        String[] words=sentence.split(" ");//[I, like, java, and, javascript]
          sentence=sentence.toLowerCase();

        for(String eachWords : words){
            if(eachWords.contains("java")){
                countJava++;
            }

            if(eachWords.contains("python")){
                countPython++;
            }

        };
        System.out.println(countJava);
        System.out.println(countPython);

        System.out.println(countJava==countPython);//false



























    }
}
