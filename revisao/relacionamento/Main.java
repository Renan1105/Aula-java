public class Main {
    private static Professor professor; 
    
    public static void main(String[] args) {
        professor = new Professor("Bolsonaro");
        System.out.println("nome: " + professor.getNome());
    }
}
