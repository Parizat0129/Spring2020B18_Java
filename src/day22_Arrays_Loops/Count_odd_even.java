package day22_Arrays_Loops;
/*
write a program that can count the even and odd number from an array of integers
                        MUST use for each loop and continue statement
 */
public class Count_odd_even {
    public static void main(String[] args) {
        int numbers[]={10,11,13,15,16,17,18,19,20};
       int countEven=0;
       int countOdd=0;
        for(int eachNumber:  numbers){
/*
            if(eachNumber%2==0){
                countEven++;
            }else{
                countOdd++;
            }


*/
       if(eachNumber%2==0){
           countEven++;
           continue;
       }


       countOdd++;

        }

        System.out.println("Even numbers: "+countEven);
        System.out.println("Odd numbers: "+countOdd);










    }
}
