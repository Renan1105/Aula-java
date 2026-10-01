public class Main {
    public static void main(String[] args){
        Veiculo carro1 = new Veiculo("Fiat","Uno");        
        Veiculo carro2 = new Veiculo("BYD","Compact 2026");        
        Veiculo carro3 = new Veiculo("Toyota","Supra mk4");        
        Veiculo carro4 = new Veiculo("Honda","Civic G6");        
        Veiculo carro5 = new Veiculo("Volkswagen","Gol");  
        // System.out.println("Carro 1: " + carro3.marca);
        Veiculo[] estacionamento = {carro1, carro2, carro3, carro4, carro5};
        
        for(Veiculo item : estacionamento){
            System.out.println("Marca: " + item.marca);
            System.out.println( "Modelo: " + item.modelo);
        }
    }
    
}
