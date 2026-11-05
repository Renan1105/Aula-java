public abstract class Animal {
    String nome;
    
    public abstract void som();
    public void acordar() {
        System.out.println(this.nome + " acordou!");
    }
    public void dormir() {
        System.out.println(this.nome + " dormiu!");
    }
    
}
