package beans;

import model.Livro;

import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean
public class LivroServiceBean {
    private Livro dados;

    private String stringBusca;
    private String buscarMessage;
    private DataModel listaObj;

    public LivroServiceBean() {
        dados = new Livro();
    }

    public String buscar() {
        try {
            int n = Integer.parseInt(stringBusca);

            //dados = dao.show(n); //usar service
            if(dados != null)
                return "livro";
            else
                buscarMessage = "Nenhuma livro encontrado com id: " + n;

        } catch (Exception e) {
            //listaObj = new ListDataModel<>(dao.search(stringBusca)); //usar service

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
