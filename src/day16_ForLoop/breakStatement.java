package day16_ForLoop;

public class breakStatement {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){// 1, 2, 3, 4, 5

            if(i==3){
                break;
            }

            System.out.println("Hello World");


            for(char n='a';n<='z';n++){

                if(n=='d') {
                    break;
                }
                System.out.println('d');

            }



        }
















    }
}
