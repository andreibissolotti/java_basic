package estruturas_de_repeticao.condicionais;

public class Condicionais {
    public static void main(String[] args) {
        final var condicao = true;

        if (condicao){
            System.out.println("A condição é verdadeira!");
        }/*else if (condição){
            Código
        }*/ else {
            System.out.println("A condição é falsa!");
        }

        if (condicao)
            System.out.println("Uma única linha..."); // Se o codigo executado tiver apenas uma linha, não precisa de {}

        final var ternario = condicao ? "É verdadeira" : "É falsa";

        System.out.println(ternario);


    }
}
