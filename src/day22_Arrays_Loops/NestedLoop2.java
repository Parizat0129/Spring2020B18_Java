package day22_Arrays_Loops;

public class NestedLoop2 {
    public static void main(String[] args) {
        int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
//   index                      0        1             2
 /*
                               k
                        number[0]===>{9,8,7,} number[0][i] i needs to repeat 3 times
                        number[1]===>{6}      number[1][i] i  need to repeat 1 time
                        number[2]===>{5,4,3,2,1,0}number[2][i] i  need to repeat 6 times

  */

        for (int k = 0; k < numbers.length; k++) {

            for (int i = 0; i < numbers[k].length; i++) {
                System.out.print(numbers[k][i] + " ");
            }
            System.out.println();
        }
        ;

        System.out.println("==================================");

// number={{9,8,7}, {6}, {5,4,3,2,1,0}}
//           0       1           2
// 7,8,9,6,0,1,2,3,4,5


        for (int k = 0; k < numbers.length; k++) {// k: index num of iD arrays
            for (int i = numbers[k].length - 1; i >= 0; i--) {// i:index numb of element in1D
                System.out.print(numbers[k][i] + " ");//7 8 9 6 0 1 2 3 4 5

            }
        }
        ;

        System.out.println();
        System.out.println("===========================");

// number={{9,8,7}, {6}, {5,4,3,2,1,0}}
//           0       1           2

//5 4 3 2 1 0 6 9 8 7
        for (int k = numbers.length - 1; k >= 0; k--) {// k: index num of 1D arrays (reversed)

            for (int i = 0; i < numbers[k].length; i++) {//i:index num of element in 1D array
                System.out.print(numbers[k][i] + " ");//5 4 3 2 1 0 6 9 8 7

            }

        }
        System.out.println();
        System.out.println("================");

        // number={{9,8,7}, {6}, {5,4,3,2,1,0}}
//           0       1           2
        //0 1 2 3 4 5 6 7 8 9
        for (int k = numbers.length - 1; k >= 0; k--) {// k: index num of 1D arrays (reversed)

            for (int i = numbers[k].length - 1; i >= 0; i--) {//i: index number of element in 1D arrays (reversed)

                System.out.print(numbers[k][i]+" ");


            }


        }
    }}