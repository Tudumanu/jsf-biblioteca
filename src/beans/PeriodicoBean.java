package beans;

import beans.dao.PeriodicoDAO;
import model.Periodico;

import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;

@ManagedBean
public class PeriodicoBean {
    private Periodico dados;
    private PeriodicoDAO dao;

    private String cadastrarMessage;

    public PeriodicoBean() {
        dados = new Periodico();
        dao = new PeriodicoDAO();
    }

    public String cadastrar() {
        System.out.println("CADASTRAR");
        if (dados.getId() <= 0) {
            cadastrarMessage = "Periodico Cadastrada com SUCESSO, ID:";
            return dao.insert(dados) ? "periodico" : "erro";
        } else {
            cadastrarMessage = "Periodico Atualizada com SUCESSO, ID:";
            return dao.update(dados) ? "periodico" : "erro";
        }
    }

    public String excluir() {
        System.out.println("EXCLUIR");
        return dao.delete(dados) ? "excluido" : "erro";
    }

    // GETTERS AND SETTERS //

    public Periodico getDados() {
        return dados;
    }

    public void setDados(Periodico dados) {
        this.dados = dados;
    }

    public String getCadastrarMessage() {
        return cadastrarMessage;
    }
}
