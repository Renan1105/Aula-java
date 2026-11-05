package exemplo1;
public class Main{
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        p.nome = "Robertinho do gelo";
        p.setIdade(45);
        System.out.println(p.nome);
        System.out.println(p.getIdade());
    }
}