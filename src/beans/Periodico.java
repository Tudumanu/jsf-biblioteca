package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Periodico {
    private String titulo;
    private String publicacao;
    private int ano;
    private int mes;
    private String periodicidade; //diária, semanal, quinzenal, mensal, bimestral, trimestral, quadrimestral, semestral, anual ou irregular
    private String issn; //pode ser nulo no caso de ser irregular


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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
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
