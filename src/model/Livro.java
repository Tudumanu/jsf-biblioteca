package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "livro")
public class Livro implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "editora")
    private String editora;

    @Column(name = "autorPrincipal")
    private String autorPrincipal;

    @Column(name = "ano")
    private String ano;

    @Column(name = "isbn")
    private String isbn;

    public Livro() {
    }

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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
