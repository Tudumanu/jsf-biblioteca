package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {
    private String titulo;
    private String editora;
    private String autorPrincipal;
    private String ano;
    private String isbn;

    public String cadastrar() {
        return "livro";
    }

    public String buscar() {
        //TODO: verificar se encontra livro ou periódico para redirecionar a tela correta
        return "livro";
    }


    // GETTERS AND SETTERS //

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
