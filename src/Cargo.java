public class Cargo {
    private String descricao;
    private Double salarioBase;
    private Niveis nivel;

    public Cargo(String descricao, Double salarioBase, Niveis nivel) {
        this.descricao = descricao;
        this.salarioBase = salarioBase;
        this.nivel = nivel;
    }

// GETTERS ________________________________________

    public String getDescricao() {
        return descricao;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public Niveis getNivel() {
        return nivel;
    }

// SETTERS ________________________________________


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setNivel(Niveis nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "\n" + descricao + " " +
                nivel.getDescricao() + ", salário base: " +
                salarioBase;
    }
}
