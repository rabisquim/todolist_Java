package br.com.robson.todolist.principal;

import br.com.robson.todolist.menu.Menu;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Gerenciador de Tarefas!");
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();
        int opcao = -1;
        while (opcao != 0) {
            menu.exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // consome a quebra de linha
            switch (opcao) {
                case 1:
                    menu.adicionarTarefa();
                    break;
                case 2:
                    menu.removerTarefa();
                    break;
                case 3:
                    menu.listarTarefas();
                    break;
                case 4:
                    menu.marcarTarefaConcluida();
                    break;
                case 0:
                    System.out.println("Obrigado por usar o Gerenciador de Tarefas!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        }

    }
}


