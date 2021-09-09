package estruturas_de_repeticao.lacos_de_repeticao;

public class Whiles {
    public static void main(String[] args) {
        var x = 0;
        var y = 0;

        // Testa a condição antes
        while (x<1){
            System.out.println("Dentro do while...");
            x++;
        }

        // Testa a condição depois
        do{
            System.out.println("Dentro do do/while...");
        } while(y++<1);
    }
}
