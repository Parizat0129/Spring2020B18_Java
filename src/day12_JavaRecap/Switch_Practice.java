package day12_JavaRecap;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

public class Switch_Practice {
    public static void main(String[] args) {

     switch(2){
         case 1:
             System.out.println("Case 1");
            break; //exits switch statement.
         case 2:
             System.out.println("Case 2");
             break;

         default:
             System.out.println("Invalid Case");
             break;

     }
     System.out.println("================================================");
     int statusCodes=404;
     switch (statusCodes){
         case 202:
             System.out.println("ok");
             break;
         case 201:
             System.out.println("Created");
              break;
         case 200:
             System.out.println("Accepted");
             break;
         default:
             System.out.println("Invalid Code");


     }








    }
}
