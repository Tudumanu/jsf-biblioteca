package beans;

import javax.faces.bean.ManagedBean;
import java.util.Date;

@ManagedBean
public class Emprestimo {
    private String dataRetirada;
    private String dataDevolucao;
    private Pessoa pessoa;
    private String tipo; //Livro ou Periodico
    private String numeroItem;


    // GETTERS AND SETTERS //

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(String numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
