package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Periodico {
    private String titulo;
    private String publicacao;
    private String ano;
    private String mes;
    private String periodicidade; //mensal, bimestral, trimestral, quadrimestral, semestral, anual ou irregular
    private String issn; //pode ser nulo no caso de ser irregular

    public String cadastrar() {
        return "periodico";
    }

    // GETTERS AND SETTERS //

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }
}
