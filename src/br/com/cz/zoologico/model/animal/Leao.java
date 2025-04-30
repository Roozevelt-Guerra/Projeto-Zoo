package br.com.cz.zoologico.model.animal;

public class Leao extends Animal{

    public String corDoPelo;
    public boolean possuiJuba;

    public Leao(
            int id,
            int quantidadeDePatas,
            String somEmitido,
            String corDoPelo,
            boolean possuiJuba
    ) {
        super(id, quantidadeDePatas, somEmitido);
        this.setCorDoPelo(corDoPelo);
        this.setPossuiJuba(possuiJuba);
    }

    public String getCorDoPelo() {
        return this.corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo){
        this.corDoPelo = corDoPelo;
    }

    public boolean isPossuiJuba() {
        return this.possuiJuba;
    }

    public void setPossuiJuba(boolean possuiJuba){
        this.possuiJuba = possuiJuba;
    }

    @Override
    public String toString() {
        return "Leao{" +
                "corDoPelo='" + corDoPelo + '\'' +
                ", possuiJuba=" + possuiJuba +
                '}';
    }
}
