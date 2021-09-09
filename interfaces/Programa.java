package interfaces;

public class Programa {
    
    public static void main(String[] args) {
        final Gol gol = new Gol();
        System.out.println("Marca do Gol: " + gol.marca());
        gol.ligar();

        final Fiesta fiesta = new Fiesta();

        System.out.println("marca do Fiesta: "+fiesta.marca());
        System.out.println("Registro do Fiesta: "+fiesta.registro());
        fiesta.ligar();
    }
}
