

public class Main {
    public static void main(String[] args) {
        Fatec aluno0 = new Fatec("Luis Inacio Lula da Silva","luisinacioluladasilva@gmail.com" );
        Fatec aluno1 = new Fatec("Jair Messias Bolsonaro","jairbolsonaro@gmail.com" );
        Fatec aluno2 = new Fatec("Renan Santos","renansantos@gmail.com" );
        Fatec aluno3 = new Fatec("Ciro Gomes","cirogomes@gmail.com" );

        Fatec[] alunos = {aluno0, aluno1, aluno2, aluno3};

        for(Fatec candidatos : alunos) {
            System.out.println("Aluno: " + candidatos.aluno);
            System.out.println("Email: " + candidatos.email);
        
    }
    
}
}