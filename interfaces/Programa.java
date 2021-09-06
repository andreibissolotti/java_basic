package interfaces;

public class Programa {
    
    public static void main(String[] args) {
        final Gol gol = new Gol();
        System.out.println("Marca do Gol: " + gol.marca());
        gol.ligar();

        
    }
}
