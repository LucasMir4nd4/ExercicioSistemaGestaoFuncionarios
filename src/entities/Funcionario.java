package entities;

public abstract class Funcionario {
    private String nome;
    private int idade;
    private Categoria categoria;

    public Funcionario() {
    }

    public Funcionario(String nome,int idade, Categoria categoria){
        this.nome= nome;
        this.idade = idade;
        this.categoria= categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                " Nome = " + nome +
                " Categoria = "+ categoria +
                " Salario = "+ String.format("%.2f",calcularSalario())+
                " Age = " + idade +
                '}'+ "COMMIT";
    }
}
