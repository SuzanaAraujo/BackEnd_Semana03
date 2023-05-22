public enum Niveis {
    JUNIOR (0,"Junior"),
    PLENO (1,"Pleno"),
    SENIOR (2,"Sênior"),;

    private final int valor;
    private final String descricao;

    Niveis(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
