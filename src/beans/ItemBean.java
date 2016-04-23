package beans;

import beans.dao.LivroDAO;
import beans.dao.PeriodicoDAO;
import model.Livro;
import model.Periodico;

import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean
public class ItemBean {
    private Livro dados;
    private LivroDAO dao;
    private Periodico periodicoDados;
    private PeriodicoDAO periodicoDao;

    private String stringBusca;
    private String tipoBusca;
    private String buscarMessage;
    private String cadastrarMessage;
    private DataModel listaObj;

    public ItemBean() {
        dados = new Livro();
        dao = new LivroDAO();
        periodicoDados = new Periodico();
        periodicoDao = new PeriodicoDAO();
    }

    public String cadastrar() {
        System.out.println("CADASTRAR");
        if (dados.getId() <= 0) {
            cadastrarMessage = "Livro Cadastrada com SUCESSO, ID:";
            return dao.insert(dados) ? "livro" : "erro";
        } else {
            cadastrarMessage = "Livro Atualizada com SUCESSO, ID:";
            return dao.update(dados) ? "livro" : "erro";
        }
    }

    public String cadastrarPeriodico() {
        System.out.println("CADASTRAR");
        if (periodicoDados.getId() <= 0) {
            cadastrarMessage = "Periodico Cadastrada com SUCESSO, ID:";
            return periodicoDao.insert(periodicoDados) ? "periodico" : "erro";
        } else {
            cadastrarMessage = "Periodico Atualizada com SUCESSO, ID:";
            return periodicoDao.update(periodicoDados) ? "periodico" : "erro";
        }
    }

    public String buscar() {
        System.out.println("BUSCAR");
        System.out.println(stringBusca);
        try {
            int n = Integer.parseInt(stringBusca);

            //verificar livro ou periodico
            if (tipoBusca.equalsIgnoreCase("livro")) {
                dados = dao.show(n);
                if(dados != null)
                    return "livro";
                else
                    buscarMessage = "Nenhuma livro encontrado com id: " + n;
            } else {
                periodicoDados = periodicoDao.show(n);
                if(periodicoDados != null)
                    return "periodico";
                else
                    buscarMessage = "Nenhuma periodico encontrado com id: " + n;
            }

        } catch (Exception e) {
            //verificar livro ou periodico
            if (tipoBusca.equalsIgnoreCase("livro")) {
                listaObj = new ListDataModel<>(dao.search(stringBusca));

                if (listaObj.getRowCount() < 1)
                    buscarMessage = "Nenhuma livro encontrado com titulo ou autorPrincipal: " + stringBusca;
            } else {
                listaObj = new ListDataModel<>(periodicoDao.search(stringBusca));

                if (listaObj.getRowCount() < 1)
                    buscarMessage = "Nenhum periodico encontrado com titulo ou publicacao: " + stringBusca;
            }
        }

        System.out.println("BUSCAR NULL");
        return null; //permanece na mesma pagina
    }

    public String excluir() {
        System.out.println("EXCLUIR");
        return dao.delete(dados) ? "excluido" : "erro";
    }

    public String excluirPeriodico() {
        System.out.println("EXCLUIR");
        return periodicoDao.delete(periodicoDados) ? "excluido" : "erro";
    }

    // GETTERS AND SETTERS //

    public Livro getDados() {
        return dados;
    }

    public void setDados(Livro dados) {
        this.dados = dados;
    }

    public Periodico getPeriodicoDados() {
        return periodicoDados;
    }

    public void setPeriodicoDados(Periodico periodicoDados) {
        this.periodicoDados = periodicoDados;
    }

    public void setStringBusca(String stringBusca) {
        this.stringBusca = stringBusca;
    }

    public String getStringBusca() {
        return stringBusca;
    }

    public String getBuscarMessage() {
        return buscarMessage;
    }

    public DataModel getlistaObj() {
        return listaObj;
    }

    public String getCadastrarMessage() {
        return cadastrarMessage;
    }

    public void setTipoBusca(String tipoBusca) {
        this.tipoBusca = tipoBusca;
    }

    public String getTipoBusca() {
        return tipoBusca;
    }
}
