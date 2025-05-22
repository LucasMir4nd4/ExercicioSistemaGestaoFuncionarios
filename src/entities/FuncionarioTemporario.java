package entities;

public  class FuncionarioTemporario extends Funcionario{

    private final int diasTrabalhados;
    private final double valorDia;

    public FuncionarioTemporario(String nome, int idade,Categoria categoria, int diasTrabalhados, double valorDia) {
        super(nome,idade,categoria);
        this.diasTrabalhados = diasTrabalhados;
        this.valorDia = valorDia;
    }

    @Override
    public double calcularSalario() {
        return diasTrabalhados * valorDia;
    }

}
