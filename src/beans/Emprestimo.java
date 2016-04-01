package beans;

import javax.faces.bean.ManagedBean;
import java.util.Date;

@ManagedBean
public class Emprestimo {
    private String dataRetirada;
    private String dataDevolucao;
    private String numeroPessoa;
    private String tipo; //Livro ou Periodico
    private String numeroItem;

    public Emprestimo() {
        this.setDataRetirada(String.valueOf(new Date()));
    }

    public String cadastrar() {
        return "emprestimo";
    }

    public String buscar() {
        return "emprestimo";
    }

    public String devolver() {
        this.setDataDevolucao(String.valueOf(new Date()));
        return "emprestimo";
    }

    // GETTERS AND SETTERS //

    public String getNumeroPessoa() {
        return numeroPessoa;
    }

    public void setNumeroPessoa(String numeroPessoa) {
        this.numeroPessoa = numeroPessoa;
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
