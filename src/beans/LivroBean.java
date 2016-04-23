package beans;

import beans.dao.LivroDAO;
import model.Livro;

import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean
public class LivroBean {
    private Livro dados;
    private LivroDAO dao;

    private String stringBusca;
    private String buscarMessage;
    private String cadastrarMessage;
    private DataModel listaObj;

    public LivroBean() {
        dados = new Livro();
        dao = new LivroDAO();
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

    public String buscar() {
        //TODO: verificar se encontra livro ou periódico para redirecionar a tela correta
        System.out.println("BUSCAR");
        System.out.println(stringBusca);
        try {
            int n = Integer.parseInt(stringBusca);

            //verificar livro ou periodico
            dados = dao.show(n);

            if(dados != null)
                return "livro";
            else
                buscarMessage = "Nenhuma livro encontrado com id: " + n;

        } catch (Exception e) {
            //verificar livro ou periodico
            listaObj = new ListDataModel<>(dao.search(stringBusca));


            if (listaObj.getRowCount() < 1)
                buscarMessage = "Nenhuma livro encontrado com titulo ou autorPrincipal: " + stringBusca;
        }

        System.out.println("BUSCAR NULL");
        return null; //permanece na mesma pagina
    }

    public String excluir() {
        System.out.println("EXCLUIR");
        return dao.delete(dados) ? "excluido" : "erro";
    }

    // GETTERS AND SETTERS //

    public Livro getDados() {
        return dados;
    }

    public void setDados(Livro dados) {
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
