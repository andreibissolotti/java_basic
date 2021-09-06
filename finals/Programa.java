package finals;

public class Programa {
    
    public static void main(String[] args) {
        
        final CasualGamer casualGamer = new CasualGamer();

        final var game = "PUBG";

        //game = "WoW";

        System.out.println(casualGamer.play(game));
    }
}
