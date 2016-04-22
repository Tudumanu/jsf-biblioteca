package beans;

import beans.dao.PessoaDAO;
import model.Pessoa;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PessoaBean {
    private Pessoa dados;
    private PessoaDAO dao;

    public PessoaBean() {
        dados = new Pessoa();
        dao = new PessoaDAO();
    }

    public String cadastrar() {
        return dao.insert(dados) ? "pessoa" : "erro";
    }

    public String buscar() {
        return "pessoa";
    }

    // GETTERS AND SETTERS //

    public Pessoa getDados() {
        return dados;
    }

    public void setDados(Pessoa dados) {
        this.dados = dados;
    }
}
