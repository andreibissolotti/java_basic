package usuario;

public class ProgramaSuperUsuario {
    
    public static void main(String[] args) {
        final var superUsuario = new SuperUsuario("root", "1234");

        superUsuario.getLogin();                // getLogin modificado como publico
        superUsuario.getSenha();                // getSenha é protect mas ta na mesma pasta ("Pacote")

        String root = superUsuario.nome;        // nome é default

        //var senha = superUsuario.senha;         // Erro pq a "senha" é privada na classe "SuperUsuario"
    }
}
