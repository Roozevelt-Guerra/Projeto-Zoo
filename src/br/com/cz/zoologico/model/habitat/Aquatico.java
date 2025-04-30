package br.com.cz.zoologico.model.habitat;

public class Aquatico extends Habitat {

    public boolean aguaEstaLimpa;

    public Aquatico(
            boolean possuiLago,
            boolean possuiArvore,
            boolean possuiVegetecao,
            boolean aguaEstaLimpa
    ) {
        super(possuiLago, possuiArvore, possuiVegetecao);
        this.setAguaEstaLimpa(aguaEstaLimpa);
    }

    public boolean getAguaEstaLimpa(){
        return this.aguaEstaLimpa;
    }

    public void setAguaEstaLimpa(boolean aguaEstaLimpa) {
        this.aguaEstaLimpa = aguaEstaLimpa;
    }

    @Override
    public String toString() {
        return "Aquatico{" +
                "aguaEstaLimpa=" + aguaEstaLimpa +
                '}';
    }
}
