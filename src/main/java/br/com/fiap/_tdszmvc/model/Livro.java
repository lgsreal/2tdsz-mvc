package br.com.fiap._tdszmvc.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome do livro é obrigatório")
    private String nome;
    @NotBlank(message = "A autoria do livro é obrigatória")
    private String autoria;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "A categoria é obrigatória")
    private Categoria categoria;
    @DecimalMin(value = "0.99", message = "O preço deve ser no mínimo 0.99")
    private BigDecimal preco;
    private LocalDate dataPublicacao;
    @Pattern(regexp = "^970\\d{7}$|^970\\d{10}$", message = "ISBN fora do padrão")
    private String isbn;

    public Livro() {
    }

    public Livro(String nome, String autoria, Categoria categoria, BigDecimal preco, LocalDate dataPublicacao, String isbn) {
        this.nome = nome;
        this.autoria = autoria;
        this.categoria = categoria;
        this.preco = preco;
        this.dataPublicacao = dataPublicacao;
        this.isbn = isbn;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
