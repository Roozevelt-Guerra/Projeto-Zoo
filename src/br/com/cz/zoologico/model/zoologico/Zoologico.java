package br.com.cz.zoologico.model.zoologico;

import br.com.cz.zoologico.model.pessoa.Funcionario;
import br.com.cz.zoologico.model.pessoa.Visitante;

import java.util.Arrays;

public class Zoologico {

    private String nome;
    private Recinto[] recintos;
    private int quantidadeDeRecintosInseridos;
    private Funcionario[] funcionarios;
    private int quantidadeDeFuncionariosInseridos;
    private Visitante[] visitantes;
    private int quantidadeDeVisitantesInseridos;

    public Zoologico(
            String nome,
            int limiteRecintos,
            int limiteFuncionarios,
            int limiteVisitantes
    ) {
        this.nome = nome;
        this.recintos = new Recinto[limiteRecintos];
        this.funcionarios = new Funcionario[limiteFuncionarios];
        this.visitantes = new Visitante[limiteVisitantes];
    }

    public boolean inserirRecinto(Recinto recinto) {
        if (this.quantidadeDeRecintosInseridos == this.recintos.length) {
            System.out.println("Recinto está cheio!");
            return false;
        }
        for (int i = 0; i < recintos.length; i++) {
            if (this.recintos[i] == null) {
                this.recintos[i] = recinto;
                this.quantidadeDeRecintosInseridos++;
                return true;
            }
        }
        return false;
    }

    public boolean removerRecintoPorId(int id) {
        for (int i = 0; i < this.recintos.length; i++) {
            if (this.recintos[i] != null && this.recintos[i].getId() == id) {
                this.recintos[i] = null;
                this.quantidadeDeRecintosInseridos--;
                System.out.println("Recinto removido");
                return true;
            }
        }
        System.out.println("Recinto não encontrado");
        return false;
    }

    public boolean atualizarPorId(int id, Recinto novoRecinto) {
        for (int i = 0; i < this.recintos.length; i++) {
            if (this.recintos[i] != null && this.recintos[i].getId() == id) {
                this.recintos[i] = novoRecinto;
                System.out.println("Recinto atualizado!");
                return true;
            }
        }
        return false;
    }

    public boolean inserirFuncionario(Funcionario funcionario){

        if (this.quantidadeDeFuncionariosInseridos == this.funcionarios.length) {
            System.out.println("A capacidade de funciomários está cheia!");
            return false;
        }

        for (int i = 0; i < this.funcionarios.length; i++){
            if (this.funcionarios[i] == null){
                this.funcionarios[i] = funcionario;
                this.quantidadeDeFuncionariosInseridos++;
                return true;
            }
        }
        return false;
    }

    public boolean removerFuncionarioPorId(int id){
        for (int i = 0; i < this.funcionarios.length; i++){
            if (this.funcionarios[i] != null && this.funcionarios[i].getId() == id){
                this.funcionarios[i] = null;
                this.quantidadeDeFuncionariosInseridos--;
                return true;
            }
        }
        return false;
    }

    public boolean atualizarFuncionariosPorId(int id, Funcionario novoFuncionario){
        for (int i = 0; i < this.funcionarios.length; i++){
            if (this.funcionarios[i] != null && this.funcionarios[i].getId() == id){
                this.funcionarios[i] = novoFuncionario;
                System.out.println("Funcionário atualizado");
                return true;
            }
        }
        return false;
    }

    public void exibirFuncionarios(){
        for (int i = 0; i < this.funcionarios.length; i++){
            System.out.println(this.funcionarios[i]);
        }
    }

    public boolean inserirVisitante(Visitante visitante){
        if (this.quantidadeDeVisitantesInseridos == this.visitantes.length){
            System.out.println("Capacidade máxima de visitantes!");
            return true;
        }

        for (int i = 0; i < this.visitantes.length; i++){
            if (this.visitantes[i] == null){
                this.visitantes[i] = visitante;
                this.quantidadeDeVisitantesInseridos++;
                System.out.println("Visitante inserido!");
                return true;
            }
        }
        return false;
    }

    public boolean removerVisitantePorId(int id){
        for (int i = 0; i < this.visitantes.length; i++){
            if (this.visitantes[i] != null && this.visitantes[i].getId() == id){
                this.visitantes[i] = null;
                this.quantidadeDeVisitantesInseridos--;
                System.out.println("Visitante removido!");
                return true;
            }
        }
        return false;
    }

    public boolean atualizarVisitantePorId(int id, Visitante novoVisitante){
        for (int i = 0; i < this.visitantes.length; i++){
            if (this.visitantes[i] != null && this.visitantes[i].getId() == id){
                this.visitantes[i] = novoVisitante;
                System.out.println("Visitante Atualizado");
                return true;
            }
        }
        return false;
    }

    public void exibirVisitantes(){
        for (int i = 0; i < this.visitantes.length; i++){
            System.out.println(this.funcionarios[i]);
        }
    }

    @Override
    public String toString() {
        return "Zoologico{" +
                "nome='" + nome + '\'' +
                ", recintos=" + Arrays.toString(recintos) +
                ", quantidadeDeRecintosInseridos=" + quantidadeDeRecintosInseridos +
                ", funcionarios=" + Arrays.toString(funcionarios) +
                ", quantidadeDeFuncionariosInseridos=" + quantidadeDeFuncionariosInseridos +
                ", visitantes=" + Arrays.toString(visitantes) +
                ", quantidadeDeVisitantesInseridos=" + quantidadeDeVisitantesInseridos +
                '}';
    }
}
