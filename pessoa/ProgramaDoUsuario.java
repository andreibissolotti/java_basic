package pessoa;

import usuario.SuperUsuario;

public class ProgramaDoUsuario {
    
    public static void main(String[] args) {
        final var batman = new SuperUsuario("batman", "1234");

        batman.getLogin();

        //batman.getSenha();        // Erro, por estar em outro pacote e ser "protected"

        //String nomeDoCliente = batiman.nome;      // default tbm não pode ser aessado de outro pacote
    }
}
