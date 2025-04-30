package br.com.cz.zoologico.model.habitat;

public class Terrestre extends Habitat {

    public boolean possuiBrinquedos;

    public Terrestre(
            boolean possuiLago,
            boolean possuiArvore,
            boolean possuiVegetecao,
            boolean possuiBrinquedos
    ) {
        super(possuiLago, possuiArvore, possuiVegetecao);
        this.setPossuiBrinquedos(possuiBrinquedos);
    }

    public boolean getpossuiBrinquedos(){
        return this.possuiBrinquedos;
    }

    public void setPossuiBrinquedos(boolean possuiBrinquedos){
        this.possuiBrinquedos = possuiBrinquedos;
    }

    @Override
    public String toString() {
        return "Terrestre{" +
                "possuiBrinquedos=" + possuiBrinquedos +
                '}';
    }
}
