import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Date;

public class Colaborador {
    private String nome;
    private Date dtAdmissao;
    private Date dtDesligamento;
    private Cargo cargo;
    private Double salario;

    public Colaborador(String nome, Date dtAdmissao, Cargo cargo) {
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
        this.cargo = cargo;
        this.salario = cargo.getSalarioBase();
    }

                public void determinarSalario(double acrescimo){
                    this.salario += acrescimo;
                }

    // GETTERS ___________________________________
    public String getNome() {
        return nome;
    }

    public Date getDtAdmissao() {
        return dtAdmissao;
    }

    public Date getDtDesligamento() {
        return dtDesligamento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Double getSalario() {
        return salario;
    }

    // SETTERS ___________________________________

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDtAdmissao(Date dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public void setDtDesligamento(Date dtDesligamento) {
        this.dtDesligamento = dtDesligamento;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n" + "Nome do colaborador: " + nome +
                ", data de admissão: " + dtAdmissao +
                ", data de desligamento: " + dtDesligamento +
                ", cargo " + cargo.getDescricao() + " - " + cargo.getNivel() +
                ", salario " + salario;
    }
}
