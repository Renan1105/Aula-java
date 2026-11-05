
public class Main {
    public static void main(String[] args) {
        Dog cao = new Dog();
       Cat gato = new Cat();
       
       cao.nome = "Mel";
       gato.nome = "Ambrosio";

       cao.som();
       gato.som();

       cao.dormir();
       cao.acordar();
       
       gato.dormir();
       gato.acordar();

    }
    
}
