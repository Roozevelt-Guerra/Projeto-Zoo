package br.com.cz.zoologico.model.zoologico;

import br.com.cz.zoologico.model.animal.Animal;
import br.com.cz.zoologico.model.habitat.Habitat;

import java.util.Arrays;

public class Recinto {

    public int id;
    public String nome;
    public Habitat habitat;
    public Animal[] animais;
    public int quantidadeDeAnimaisInseridos;

    public Recinto(
            int id,
            String nome,
            Habitat habitat,
            int capacidadeMaxima
    ){
        this.id = id;
        this.nome = nome;
        this.habitat = habitat;
        this.animais = new Animal[capacidadeMaxima];
        this.quantidadeDeAnimaisInseridos = 0;
    }

    public boolean inserirAnimal(Animal animal){
        if (this.quantidadeDeAnimaisInseridos >= this.animais.length){
            System.out.println("Recinto com capacidade máxima!");
            return false;
        }
        for (int i = 0; i < this.animais.length; i++){
            if (this.animais[i] == null){
                this.animais[i] = animal;
                this.quantidadeDeAnimaisInseridos++;
                return true;
            }
        }
        return false;
    }

    public boolean removerAnimalPorId(int id){
        for (int i = 0; i < this.animais.length; i++){
            if (this.animais[i] != null && this.animais[i].getId() == id){
                animais[i] = null;
                this.quantidadeDeAnimaisInseridos--;
                System.out.println("Animal removido com sucesso!");
                return true;
            }
        }
        System.out.println("Animal não encontrado!");
        return false;
    }

    public boolean atualizarAnimalPorID(int id, Animal novoAnimal){
        for (int i = 0; i < this.animais.length; i++){
            if (this.animais[i] != null && this.animais[i].getId() == id){
                this.animais[i] = novoAnimal;
                System.out.println("Animal atualizado com sucesso!");
                return true;
            }
        }
        System.out.println("Animal não encontrado!");
        return false;
    }

    public void exibirAnimais(){
        System.out.printf("Animais no recinto: %s", nome);
        for (Animal animal : this.animais){
            if (animal != null){
                System.out.println(animal);
            }
        }
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public Habitat getHabitat(){
        return this.habitat;
    }

    public int getcapacidadeMaxima(){
        return this.animais.length;
    }

    public int getQuantidadeDeAnimaisInseridos(){
        return this.quantidadeDeAnimaisInseridos;
    }

    @Override
    public String toString() {
        return "Recinto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", habitat=" + habitat +
                ", animais=" + Arrays.toString(animais) +
                ", quantidadeDeAnimaisInseridos=" + quantidadeDeAnimaisInseridos +
                '}';
    }
}
