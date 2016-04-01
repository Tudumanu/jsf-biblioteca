package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String tipo; //aluno, funcionario, professor


    public String cadastrar() {
        return "pessoa";
    }

    // GETTERS AND SETTERS //

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
