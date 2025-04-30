package br.com.cz.zoologico.model.habitat;

public class Aereo extends Habitat{

    public int quantidadeDeArvores;

    public Aereo(
            boolean possuiLago,
            boolean possuiArvore,
            boolean possuiVegetecao,
            int quantidadeDeArvores
    ) {
        super(possuiLago, possuiArvore, possuiVegetecao);
        this.setPossuiArvores(possuiArvores);
    }

    public int getQuantidadeDeArvores(){
        return this.quantidadeDeArvores;
    }

    public void setQuantidadeDeArvores(int quantidadeDeArvores){
        this.quantidadeDeArvores = quantidadeDeArvores;
    }

    @Override
    public String toString() {
        return "Aereo{" +
                "quantidadeDeArvores=" + quantidadeDeArvores +
                '}';
    }
}
