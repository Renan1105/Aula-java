public class Main {
    public static void main(String[] args) {
        Personagem persona = new Personagem();
        persona.nome = "Flavio Bolsonaro";
        persona.idade = 67;
        persona.poder = 22;
        System.out.println(persona.nome);
        System.out.println(persona.idade);
        System.out.println(persona.poder);
        persona.pular();
        persona.correr();
      
    }
}
   