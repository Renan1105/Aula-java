import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<Professor> professor =new ArrayList<>(); 
    
    public static void main(String[] args) {
        professor.add(new Professor("Bolsonaro"));
        professor.add(new Professor("Lula"));
        professor.add(new Professor("Ciro"));
        
        for( Professor prof : professor) {
            System.out.println("nome: " + prof.getNome());
        }
    }
}
