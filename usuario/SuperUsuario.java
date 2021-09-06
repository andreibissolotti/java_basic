package usuario;

public class SuperUsuario {
    
    private String login;           // modificador de acesso "private"
    private String senha;
    String nome;                    // modificador não definido = "default"

    public SuperUsuario(final String login, final String senha){
        this.login = login;
        this.senha = senha;
    }

    public String getLogin(){
        return login;
    }

    protected String getSenha(){
        return senha;
    }
}
