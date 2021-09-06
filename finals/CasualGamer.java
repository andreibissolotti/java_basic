package finals;

public class CasualGamer extends Gamer{
    
    @Override
    public String keyboard(){return "Simple Keyboard...";}

    /*@Override
    public String mouse(){return super.mouse();} Erro pelo metodo ser final*/

    public String play(final String game){
        //game = "WoW";

        return "Jogando " + game;
    }
}
