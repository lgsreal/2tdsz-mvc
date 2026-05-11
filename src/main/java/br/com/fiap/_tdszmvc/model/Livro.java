package br.com.fiap._tdszmvc.model;

public class Livro {
    String nome;
    String autoria;

    public Livro() {
    }

    public Livro(String nome, String autoria) {
        this.nome = nome;
        this.autoria = autoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutoria() {
        return autoria;
    }

    public void setAutoria(String autoria) {
        this.autoria = autoria;
    }
}
