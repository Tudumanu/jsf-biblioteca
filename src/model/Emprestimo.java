package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "emprestimo")
public class Emprestimo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "dataRetirada")
    private String dataRetirada;

    @Column(name = "dataDevolucao")
    private String dataDevolucao;

    @Column(name = "tipo")
    private String tipo; //Livro ou Periodico

    @Column(name = "numeroPessoa")
    private int numeroPessoa;

    @Column(name = "numeroItem")
    private int numeroItem;

    public Emprestimo() {
    }

    // GETTERS AND SETTERS //

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroPessoa() {
        return numeroPessoa;
    }

    public void setNumeroPessoa(int numeroPessoa) {
        this.numeroPessoa = numeroPessoa;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }
}
