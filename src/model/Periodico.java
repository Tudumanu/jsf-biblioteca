package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "periodico")
public class Periodico implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "publicacao")
    private String publicacao;

    @Column(name = "ano")
    private String ano;

    @Column(name = "mes")
    private String mes;

    @Column(name = "periodicidade")
    private String periodicidade; //mensal, bimestral, trimestral, quadrimestral, semestral, anual ou irregular

    @Column(name = "issn")
    private String issn; //pode ser nulo no caso de ser irregular

    public Periodico(){}

    // GETTERS AND SETTERS //

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
