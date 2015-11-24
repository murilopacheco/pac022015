package br.ufg.inf.fabrica.negocio.dominio;

/**
 *
 * @author danilloguimaraes
 */
public class Estado {
    
    private String nome;
    private boolean estadoFinal;
    private String descricao;
    //private boolean permiteDelegacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEstadoFinal() {
        return estadoFinal;
    }

    public void setEstadoFinal(boolean estadoFinal) {
        this.estadoFinal = estadoFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
