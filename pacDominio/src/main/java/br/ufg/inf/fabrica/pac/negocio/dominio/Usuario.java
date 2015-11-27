package br.ufg.inf.fabrica.pac.negocio.dominio;

/**
 *
 * @author danilloguimaraes
 */
public class Usuario {
    private long id;
    private String login;
    private String idProjeto;
    private boolean ativo;
    
    //Transient
    private String senha;
    private String nome;

    public String getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(String idProjeto) {
        this.idProjeto = idProjeto;
    }
    
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
    
    public boolean isAtivo(){
        return this.ativo;
    }
    
    public void setAtivo(boolean value){
        this.ativo = value;
    }

    public void setId(long id){
        this.id = id;
    }
    
    public long getId(){
        return this.id;
    }
}
