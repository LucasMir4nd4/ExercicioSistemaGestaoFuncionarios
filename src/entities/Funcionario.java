package entities;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private int idade;

    public Funcionario() {
    }

    public Funcionario(String nome, double salarioBase, int idade){
        this.nome= nome;

    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
