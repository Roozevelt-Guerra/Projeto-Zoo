package br.com.cz.zoologico.model.pessoa;

public abstract class Pessoa {

    private int id;
    private String cpf;
    protected String nome;
    protected int idade;

    public Pessoa(int id, String cpf, String nome, int idade){
        this.setId(id);
        this.setCpf(cpf);
        this.setNome(nome);
        this.setIdade(idade);
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf){
        String pt1Cpf = cpf.substring(0,3);
        String pt2Cpf = cpf.substring(8,11);
        String novoCpf = String.format("%s*****%s", pt1Cpf, pt2Cpf);
        this.cpf = novoCpf;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
