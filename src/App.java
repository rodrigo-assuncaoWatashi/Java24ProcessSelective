import java.util.ArrayList;
import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        GenerateCandidates.generate();
        System.out.println();
        candidatures();
    }

    static void candidatures(){
        ArrayList<Candidates> candidates = Candidates.catchCandidates();
        for(Candidates candidate : candidates){
            if(candidate.isValid == true){
                if(candidate.pretendedSalary == candidate.baseSalary){
                    System.out.printf("--------------\nCalling to [%s] \n", candidate.name);
                }else{
                    System.out.printf("--------------\nCalling to [%s] with a propost \n",  candidate.name);
                }
            }

        }
    }
}