package Funcoes.Exemplo_3;

public class Main {
    static boolean ligarInterruptor(){

       if ( passarEletricidade() == true){
        if ( acenderLampada() == true){
            System.out.println("Lâmpada acendeu");
            return true;
        }else{
            System.out.println("Lâmpada queimou");
            return false;
        }
       }else{
        System.out.println("Problema no circuito");
        return false;
       }
    }
    static boolean acenderLampada( ){
        return true;
    }
    static boolean passarEletricidade(){
        return true;
    }
    public static void main(String[] args) {
        if ( ligarInterruptor() == true) {
            System.out.println("processo funcionou");
        }else{
            System.out.println("processo falhou");
        }

    }
        
}
    

