package beans;

import model.Livro;
import webservices.BuscaLivro;
import webservices.BuscaLivroService;

import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean
public class LivroServiceBean {
    private String stringBusca;
    private String buscarMessage;
    private DataModel listaObj;

    public LivroServiceBean() {
    }

    public String buscar() {
        BuscaLivroService service;
        BuscaLivro port;

        try {
            service = new BuscaLivroService();
            port = service.getBuscaLivroPort();
        } catch (Exception e) {
            buscarMessage = "Ocorreu um erro ao consultar o serviço, contate o administrador";
            return null;
        }

        try {
            int n = Integer.parseInt(stringBusca);

            //usando service
            webservices.Livro dadosTmp = port.obter(n);

            if(dadosTmp != null) {
                buscarMessage = "Foi encontrado o livro no webService: " +
                        dadosTmp.getId() + " " +
                        dadosTmp.getTitulo() + " " +
                        dadosTmp.getAutorPrincipal() + " " +
                        dadosTmp.getAno() + " " +
                        dadosTmp.getEditora() + " " +
                        dadosTmp.getIsbn() + " "
                ;
            } else
                buscarMessage = "Nenhuma livro encontrado com id: " + n;

        } catch (Exception e) {
            //usando o service
            listaObj = new ListDataModel<>(port.buscar(stringBusca));

            if (listaObj == null || listaObj.getRowCount() < 1)
                buscarMessage = "Nenhuma livro encontrado com titulo ou autorPrincipal: " + stringBusca;
        }

        return null; //permanece na mesma pagina
    }

    // GETTERS AND SETTERS //

    public String getStringBusca() {
        return stringBusca;
    }

    public void setStringBusca(String stringBusca) {
        this.stringBusca = stringBusca;
    }

    public String getBuscarMessage() {
        return buscarMessage;
    }

    public DataModel getListaObj() {
        return listaObj;
    }

}
