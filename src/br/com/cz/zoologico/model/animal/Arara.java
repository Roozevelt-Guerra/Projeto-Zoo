package br.com.cz.zoologico.model.animal;

public class Arara extends Animal {

    public String corDasPenas;
    public String comidaPreferida;

    public Arara(
            int id,
            int quantidadeDePatas,
            String somEmitido,
            String corDasPenas,
            String comidaPreferida
    ) {
        super(id, quantidadeDePatas, somEmitido);
        this.setCorDasPenas(corDasPenas);
        this.setComidaPreferida(comidaPreferida);
    }

    public String getCorDasPenas(){
        return this.corDasPenas;
    }

    public void setCorDasPenas(String corDasPenas){
        this.corDasPenas = corDasPenas;
    }

    public String getComidaPreferida(){
        return this.comidaPreferida;
    }

    public void setComidaPreferida(String comidaPreferida){
        this.comidaPreferida = comidaPreferida;
    }

    @Override
    public String toString() {
        return "Arara{" +
                "corDasPenas='" + corDasPenas + '\'' +
                ", comidaPreferida='" + comidaPreferida + '\'' +
                '}';
    }
}
