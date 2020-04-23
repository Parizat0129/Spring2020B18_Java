package day21_MultiDimensionalArrays;

public class ScrumTeam {
    public  static void main(String[] args) {
//                             0       1         2        3
        String [] DevTeam={"Zeynep", "Haider", "Jovid", "Muhtar" };

        String [] TestersTeam={"Rahman", "Aishan", "Osman", "Ali"};

        String [] PO ={"Barzy", "Donald"};
        //                 0       1

        String [] TestersTeam2={"Ilham", "Zarina", "Aizhan","Asinab" };



        String [] []ScrumTeam={DevTeam,TestersTeam,PO};
        //                       0       1          2

              ScrumTeam[0][3]="Jean";

              ScrumTeam[1]=TestersTeam2;

        System.out.println(ScrumTeam[0][3]);//  jean
        String info = ScrumTeam[1][2];// osman
        System.out.println(info);
        System.out.println("================================================");

        for( String eachEmployee:ScrumTeam[1]  ){
            System.out.println(eachEmployee);
        }

        System.out.println(ScrumTeam[2][1]);





















    }
}
