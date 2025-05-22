package entities;

public  class FuncionarioCLT extends Funcionario{

    private final double bonusMensal;
    private final double salarioBase;

    public FuncionarioCLT(String nome, int idade, Categoria categoria,double salarioBase, double bonusMensal) {
        super(nome ,idade,categoria);
        this.salarioBase = salarioBase;
        this.bonusMensal = bonusMensal;
    }
    @Override
    public double calcularSalario() {
        return salarioBase + bonusMensal;
    }

}
