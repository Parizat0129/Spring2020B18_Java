package day21_MultiDimensionalArrays;

public class zoo {
    public static void main(String[] args) {

        String [] WildAnimals={"Tiger",  "Lion", "Monkey", "Turtle", "Corcodile"};
        String [] birds={"Eagle", "Ducks", "Peacock", "Chicken"};
        //                 0        1          2          3

        String [][] zoo={WildAnimals,birds};
        //               0              1


        String kfc= zoo[1][3];
        System.out.println(kfc);
        System.out.println("=====================================");
        for(String eachBirds:zoo[1]){

            if(eachBirds.equalsIgnoreCase("Chicken")){
                continue;
            }
            System.out.println(eachBirds);
        }
        System.out.println("=======================================");

        for(String eachWildsAnm:zoo[0]){

            if(eachWildsAnm.equalsIgnoreCase("Turtle")){
                continue;
            }
            System.out.println(eachWildsAnm);
        }
















    }
}
