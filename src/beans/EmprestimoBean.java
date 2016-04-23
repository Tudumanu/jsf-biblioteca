package beans;

import beans.dao.EmprestimoDAO;
import model.Emprestimo;

import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import java.util.Date;

@ManagedBean
public class EmprestimoBean {
    private Emprestimo dados;
    private EmprestimoDAO dao;

    private String numPessoaBusca;
    private String numItemBusca;
    private String numEmprestimo;
    private String tipoBusca;
    private String buscarMessage;
    private String cadastrarMessage;
    private DataModel listaObj;

    public EmprestimoBean() {
        dados = new Emprestimo();
        dao = new EmprestimoDAO();
    }

    public String cadastrar() {
        if (dados.getId() <= 0) {
            cadastrarMessage = "Emprestimo Cadastrado com SUCESSO, ID:";
            dados.setDataRetirada(String.valueOf(new Date()));
            return dao.insert(dados) ? "emprestimo" : "erro";
        } else {
            cadastrarMessage = "Emprestimo Atualizado com SUCESSO, ID:";
            return dao.update(dados) ? "emprestimo" : "erro";
        }
    }

    public String buscar() {
        try {
            int n = Integer.parseInt(numEmprestimo);
            dados = dao.show(n);

            if(dados != null)
                return "emprestimo";
            else
                buscarMessage = "Nenhum emprestimo encontrado com id: " + n;

        } catch (Exception e) {
            int numPessoa = 0;
            int numItem = 0;

            try {
                if (!numPessoaBusca.isEmpty())
                    numPessoa = Integer.parseInt(numPessoaBusca);

                if (!numItemBusca.isEmpty())
                    numItem = Integer.parseInt(numItemBusca);
            } catch (Exception ex) {}
            finally {
                listaObj = new ListDataModel<>(dao.search(tipoBusca, numPessoa, numItem));
                if (listaObj.getRowCount() < 1)
                    buscarMessage = "Nenhum emprestimo encontrado com tipo: " + tipoBusca
                            +" com número Pessoa: "+ numPessoa +" e número Item: "+ numItem;
            }
        }

        return null; //permanece na mesma pagina
    }

    public String devolver() {
        dados.setDataDevolucao(String.valueOf(new Date()));
        cadastrarMessage = "Emprestimo Devolvido com SUCESSO, ID:";
        return dao.update(dados) ? "emprestimo" : "erro";
    }

    // GETTERS AND SETTERS //

    public Emprestimo getDados() {
        return dados;
    }

    public void setDados(Emprestimo dados) {
        this.dados = dados;
    }

    public String getNumPessoaBusca() {
        return numPessoaBusca;
    }

    public void setNumPessoaBusca(String numPessoaBusca) {
        this.numPessoaBusca = numPessoaBusca;
    }

    public String getNumItemBusca() {
        return numItemBusca;
    }

    public void setNumItemBusca(String numItemBusca) {
        this.numItemBusca = numItemBusca;
    }

    public String getNumEmprestimo() {
        return numEmprestimo;
    }

    public void setNumEmprestimo(String numEmprestimo) {
        this.numEmprestimo = numEmprestimo;
    }

    public String getTipoBusca() {
        return tipoBusca;
    }

    public void setTipoBusca(String tipoBusca) {
        this.tipoBusca = tipoBusca;
    }

    public String getBuscarMessage() {
        return buscarMessage;
    }

    public String getCadastrarMessage() {
        return cadastrarMessage;
    }

    public DataModel getlistaObj() {
        return listaObj;
    }
}
