package br.com.robson.todolist.modelos;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa (String descricao) {

        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }
    public boolean foiConcluida() {
        return concluida;
    }
    public void marcarConcluida() {
        this.concluida = true;
    }

}
