package br.com.cz.zoologico.model.pessoa;

public class Funcionario extends Pessoa{

    private double salario;

    public Funcionario(int id, String cpf, String nome, int idade, double salario){
        super(id, cpf, nome, idade);
        this.setSalario(salario);
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                '}';
    }
}
