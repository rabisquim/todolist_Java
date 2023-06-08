package br.com.robson.todolist.menu;

import java.util.ArrayList;
import java.util.Scanner;
import br.com.robson.todolist.modelos.Tarefa;

public class Menu {
    private ArrayList<Tarefa> listaDeTarefas;
    private Scanner scanner;

    public Menu() {
        listaDeTarefas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarTarefa() {
        System.out.print("Digite a descrição da tarefa: ");
        String descricao = scanner.nextLine();
        Tarefa novaTarefa = new Tarefa(descricao);
        listaDeTarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void removerTarefa() {
        System.out.print("Digite o índice da tarefa que deseja remover: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // consome a quebra de linha
        if (indice >= 0 && indice < listaDeTarefas.size()) {
            Tarefa tarefaRemovida = listaDeTarefas.remove(indice);
            System.out.println("Tarefa \"" + tarefaRemovida.getDescricao() + "\" removida com sucesso!");
        } else {
            System.out.println("Índice inválido. Tente novamente.");
        }
    }

    public void exibirMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Remover tarefa");
        System.out.println("3 - Listar tarefas");
        System.out.println("4 - Marcar tarefa como concluída");
        System.out.println("0 - Sair");
        System.out.print("Opção escolhida: ");
    }


    public void listarTarefas() {
        System.out.println("\nLista de tarefas:");
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            Tarefa tarefa = listaDeTarefas.get(i);
            String status = tarefa.foiConcluida() ? "[Concluída]" : "[Pendente]";
            System.out.println(i + " - " + tarefa.getDescricao() + " " + status);
        }
    }

    public void marcarTarefaConcluida() {
        System.out.print("Digite o índice da tarefa que deseja marcar como concluída: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // consome a quebra de linha
        if (indice >= 0 && indice < listaDeTarefas.size()) {
            Tarefa tarefaConcluida = listaDeTarefas.get(indice);
            if (!tarefaConcluida.foiConcluida()) {
                tarefaConcluida.marcarConcluida();
                System.out.println("Tarefa \"" + tarefaConcluida.getDescricao() + "\" marcada como concluída!");
            } else {
                System.out.println("Tarefa já concluída.");
            }
        } else {
            System.out.println("Índice inválido. Tente novamente.");
        }
    }



}
