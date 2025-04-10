import java.util.ArrayList;
import java.util.InputMismatchException;
public class Candidates {
    String name;
    double pretendedSalary;
    boolean isValid = false;
    double baseSalary = 2000.0;

    public static ArrayList<Candidates> candidates = new ArrayList<>();

    public Candidates(String name, double pretendedSalary) throws InputMismatchException{
        this.name = name;
        this.pretendedSalary = pretendedSalary;
        if(pretendedSalary <= baseSalary){
            this.isValid = true;
        }
        candidates.add(this);
    }

    public static ArrayList<Candidates> catchCandidates(){
        return candidates;
    }

}
