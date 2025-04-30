package br.com.cz.zoologico.model.habitat;

public abstract class Habitat {

    protected boolean possuiLago;
    protected boolean possuiArvores;
    protected boolean possuiVegetacao;

    public Habitat(boolean possuiLago, boolean possuiArvores, boolean possuiVegetacao){
        this.possuiLago = possuiLago;
        this.possuiArvores = possuiArvores;
        this.possuiVegetacao = possuiVegetacao;
    }

    public boolean getPossuiLago() {
        return this.possuiLago;
    }

    public void setPossuiLago(boolean possuiLago) {
        this.possuiLago = possuiLago;
    }

    public boolean getPossuiArvores() {
        return this.possuiArvores;
    }

    public void setPossuiArvores(boolean possuiArvores){
        this.possuiArvores = possuiArvores;
    }

    public boolean getPossuiVegetacao() {
        return this.possuiVegetacao;
    }

    public void setPossuiVegetacao(boolean possuiVegetacao) {
        this.possuiVegetacao = possuiVegetacao;
    }

    @Override
    public String toString() {
        return "Habitat{" +
                "possuiLago=" + possuiLago +
                ", possuiArvores=" + possuiArvores +
                ", possuiVegetacao=" + possuiVegetacao +
                '}';
    }
}
