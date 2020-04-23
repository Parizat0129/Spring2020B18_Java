package day19_Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {

        String [] friends= {"Mike", "Anna", "Abby","Joy", "Alex", "Tim" };
         //                  0       1       2        3      4      5

        /*
        String name1=friends[2];

        System.out.println( friends[4]);
        //  or
        System.out.println(name1);
        */

       for(int i=0; i<=5; i++){
        String name =   friends[i];
           System.out.println(name);

       }



       String []emails={"cybertek@yahoo.com", "cybertek@gmail.com",  "cybertek@hotmail.com", "cybertek@outlook.com"  };

       // print put all the user who regesitered with their gmail
       //  max: 4

       for(int i=0;i<=3;i++){

           String email=   emails[i];

            if(email.endsWith("@gmail.com")) {
                System.out.println(email);
            }

       }









    }
}
