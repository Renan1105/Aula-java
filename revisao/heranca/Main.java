import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<Professor> professor = new ArrayList<>();
    private static List<Aluno> aluno = new ArrayList<>();

    public static void main(String[] args) {

        professor.add(new Professor("Bolsonaro"));
        professor.add(new Professor("Lula"));
        professor.add(new Professor("Ciro"));

        for (Professor prof : professor) {
            System.out.println("nome: " + prof.getNome() + "\n");
        }

        aluno.add(new Aluno("Joao"));
        aluno.add(new Aluno("Maria"));
        aluno.add(new Aluno("Jose"));

        for (Aluno alun : aluno) {
            System.out.println("\n"+"nome: " + alun.getNome());
        }
    }
    
}
