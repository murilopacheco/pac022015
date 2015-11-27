package br.ufg.inf.fabrica.pac.persistencia.stub;

import br.ufg.inf.fabrica.pac.negocio.dominio.Andamento;
import br.ufg.inf.fabrica.pac.negocio.dominio.Estado;
import br.ufg.inf.fabrica.pac.negocio.dominio.Pacote;
import br.ufg.inf.fabrica.pac.negocio.dominio.Projeto;
import br.ufg.inf.fabrica.pac.negocio.dominio.Usuario;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Danillo
 */
public class RepositorioStub {
    
    private Pacote buscaPacote(Pacote pacote){
        return null;
    }
    
    private List<Pacote> buscaPacotes(Usuario responsavel){
        return null;
    }
    
    public RepositorioStub(){

        //Cria estados
        Estado estadoNovo = new Estado();
        estadoNovo.setDescricao("Atribuido");
        estadoNovo.setNome("Atribuido");
        estadoNovo.setEstadoFinal(false);
        
        Estado estadoAtribuido = new Estado();
        estadoAtribuido.setDescricao("Atribuido");
        estadoAtribuido.setNome("Atribuido");
        estadoAtribuido.setEstadoFinal(false);
        
        Estado estadoContratado = new Estado();
        estadoContratado.setDescricao("Contratado");
        estadoContratado.setNome("Contratado");
        estadoContratado.setEstadoFinal(false);

        //Cria projeto
        Projeto projeto = new Projeto();
        projeto.setDataInicio(new Date());
        projeto.setDataTermino(new Date( new Date().getTime()+365*24*60*60*1000));
        projeto.setDescricao("Gestor de pacotes 2015");
        projeto.setNome("pac2015");
        projeto.setPatrocinador("Eduardo Simões");
        projeto.setStakeholders("Danillo, Afonso, Juliano, Maycon, Murilo, Mariana");
        
        
        //Cria usuarios
        Usuario membro = new Usuario();
        membro.setAtivo(true);
        membro.setId(0);
        
        Usuario gerente = new Usuario();
        gerente.setAtivo(true);
        membro.setId(1);
        
        //Cria pacotes
        Pacote pacoteAtribuido = new Pacote();
        pacoteAtribuido.setAndamentos(null); //tratar setAndamentos;
        pacoteAtribuido.setAbandonado(false);
        pacoteAtribuido.setDataCriacao(new Date());
        pacoteAtribuido.setDataPrevistaRealizacao(new Date( new Date().getTime()+24*60*60*1000));
        pacoteAtribuido.setDescricao("Implementar requisito de software RS100");
        pacoteAtribuido.setNome("rs100");
        pacoteAtribuido.setIdEstado(estadoAtribuido.getId());
        pacoteAtribuido.setIdProjeto(projeto.getId());
        pacoteAtribuido.setIdUsuario(membro.getId());
            //Cria andamentos do pacote atribuido
            Andamento andamento = new Andamento();
            andamento.setDescricao("Criação do pacote");
            andamento.setIdEstado(estadoNovo.getId());
            andamento.setIdPacote(pacoteAtribuido.getId());
            andamento.setUsuario(gerente.getId());
            pacoteAtribuido.getAndamentos().add(andamento.getId());
            //Distribuido
            andamento = new Andamento();
            andamento.setDescricao("Distribuicao do pacote");
            andamento.setIdEstado(estadoAtribuido.getId());
            andamento.setIdPacote(pacoteAtribuido.getId());
            andamento.setUsuario(membro.getId());
            pacoteAtribuido.getAndamentos().add(andamento.getId());
        
        Pacote pacoteContratado = new Pacote();
        pacoteContratado.setAndamentos(null); //tratar setAndamentos;
        pacoteContratado.setAbandonado(false);
        pacoteContratado.setDataCriacao(new Date());
        pacoteContratado.setDataPrevistaRealizacao(new Date( new Date().getTime()+86400000));
        pacoteContratado.setDescricao("Implementar requisito de software RS101");
        pacoteContratado.setNome("rs101");
        pacoteContratado.setIdEstado(estadoContratado.getId());
        pacoteContratado.setIdProjeto(projeto.getId());
        pacoteContratado.setIdUsuario(membro.getId());
            //Cria andamentos do pacote atribuido
            andamento = new Andamento();
            andamento.setDescricao("Criação do pacote");
            andamento.setIdEstado(estadoNovo.getId());
            andamento.setIdPacote(pacoteContratado.getId());
            andamento.setUsuario(gerente.getId());
            pacoteAtribuido.getAndamentos().add(andamento.getId());
            //Distribuido
            andamento = new Andamento();
            andamento.setDescricao("Distribuicao do pacote");
            andamento.setIdEstado(estadoAtribuido.getId());
            andamento.setIdPacote(pacoteContratado.getId());
            andamento.setUsuario(membro.getId());
            pacoteAtribuido.getAndamentos().add(andamento.getId());
            //Contratado
            andamento = new Andamento();
            andamento.setDescricao("Pacote aceito");
            andamento.setIdEstado(estadoContratado.getId());
            andamento.setIdPacote(pacoteContratado.getId());
            andamento.setUsuario(membro.getId());
            pacoteAtribuido.getAndamentos().add(andamento.getId());
    }
    
}
