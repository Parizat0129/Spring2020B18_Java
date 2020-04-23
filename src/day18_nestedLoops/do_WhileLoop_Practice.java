package day18_nestedLoops;
/*
print all the even number0~100 in the same line seperated by space
 */
public class do_WhileLoop_Practice {
    public static void main(String[] args) {
        int num=0;

        do{
            if(num%2==0){
                System.out.print(num+" ");
            }

            num++;
        }while(num<=100);

        System.out.println();
        System.out.println("=====================================");

        int i=1;
        do{
        i++;
            System.out.println(i);

        }while(i<=5);
        System.out.println("=========================");

        int z=1;
        do{

            System.out.println(z);
            if(z==2){
                break;
            }
            z++;
        }while(z<=5);
        System.out.println("======================================");

        int y=1;//3
        do{

            if(y==3){
                y++;// need to make sure that iterator NOT SKIPPING ,SO that condition will eventually be false
                continue;
            }

            System.out.println(y);// 1 ,2,
            y++;

        }while(y<=5);
        // 2<=5  , 3<=5  ,


        System.out.println("=====================================================");

            int t=1;
            do{
                if(t%2!=0){
                    t++;
                    continue;

                }

                System.out.print(t+" ");
                t++;
            }while(t<=100);

















    }
}
