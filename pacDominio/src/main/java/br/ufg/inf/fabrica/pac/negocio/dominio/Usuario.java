package br.ufg.inf.fabrica.pac.negocio.dominio;

/**
 *
 * @author danilloguimaraes
 */
public class Usuario {
    private String login;
    private String idProjeto;

    public String getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(String idProjeto) {
        this.idProjeto = idProjeto;
    }
    
    //Transient
    private String senha;
    //Transient
    private String nome;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
