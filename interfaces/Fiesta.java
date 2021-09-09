package interfaces;

public class Fiesta implements Carro, Veiculo{
    
    @Override
    public String marca(){return "Ford";}

    @Override
    public String registro(){return "123AFG547TR";}
    
    @Override
    public Double valor(){return null;}

    @Override
    public void ligar(){
        Carro.super.ligar();

        //Veiculo.super.ligar();
    }
}
// Herança multipla de interface