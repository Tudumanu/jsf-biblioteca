package beans;

import beans.dao.PessoaDAO;
import model.Pessoa;

import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean
public class PessoaBean {
    private Pessoa dados;
    private PessoaDAO dao;

    private String stringBusca;
    private String buscarMessage;
    private String cadastrarMessage;
    private DataModel listaObj;

    public PessoaBean() {
        dados = new Pessoa();
        dao = new PessoaDAO();
    }

    public String cadastrar() {
        System.out.println("CADASTRAR");
        if (dados.getId() <= 0) {
            cadastrarMessage = "Pessoa Cadastrada com SUCESSO, ID:";
            return dao.insert(dados) ? "pessoa" : "erro";
        } else {
            cadastrarMessage = "Pessoa Atualizada com SUCESSO, ID:";
            return dao.update(dados) ? "pessoa" : "erro";
        }
    }

    public String buscar() {
        System.out.println("BUSCAR");
        System.out.println(stringBusca);
        try {
            int n = Integer.parseInt(stringBusca);
            dados = dao.show(n);

            if(dados != null)
                return "pessoa";
            else
                buscarMessage = "Nenhuma pessoa encontrada com id: " + n;

        } catch (Exception e) {
            listaObj = new ListDataModel<>(dao.buscar(stringBusca));
            if (listaObj.getRowCount() < 1)
                buscarMessage = "Nenhuma pessoa encontrada com nome: " + stringBusca;
        }

        System.out.println("BUSCAR NULL");
        return null; //permanece na mesma pagina
    }

    public String excluir() {
        System.out.println("EXCLUIR");
        return dao.delete(dados) ? "excluido" : "erro";
    }

    /*public int getId() {
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        HttpServletRequest req = (HttpServletRequest) context.getRequest();

        Map a = req.getParameterMap();
        System.out.println("\n "+ a.get("busca"));
        System.out.println(a);

        System.out.println("\n REQUEST: "+ req.getParameter("id") +","+ req.getParameter("busca") +" \n");
        return 1;//Integer.parseInt(req.getParameter("id"));
    }*/

    // GETTERS AND SETTERS //

    public Pessoa getDados() {
        return dados;
    }

    public void setDados(Pessoa dados) {
        this.dados = dados;
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
}
