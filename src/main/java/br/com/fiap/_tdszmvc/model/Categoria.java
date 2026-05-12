package br.com.fiap._tdszmvc.model;

public enum Categoria {
    TERROR("Terror"),
    ROMANCE("Romance"),
    COMEDIA("Comédia"),
    FICCAO("Ficção"),
    SUSPENSE("Suspense"),
    FANTASIA("Fantasia"),
    BIOGRAFIA("Biografia"),
    TECNOLOGIA("Tecnologia");

    private final String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
