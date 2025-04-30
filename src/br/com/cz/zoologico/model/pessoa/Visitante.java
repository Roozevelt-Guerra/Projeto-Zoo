package br.com.cz.zoologico.model.pessoa;

public class Visitante extends Pessoa {

    public boolean vip;

    public Visitante(int id, String cpf, String nome, int idade, boolean visitante){
        super(id, cpf, nome, idade);
        this.vip = vip;
    }

    public boolean getVip(){
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "vip=" + vip +
                '}';
    }
}
