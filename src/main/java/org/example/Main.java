package org.example;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] opcoes = {
                "Inserir",
                "Buscar",
                "Excluir",
                "Exibir",
                "Contar",
                "Sair"
        };
        int escolha;

        Simulador sm = new Simulador(5); // Capacidade de 5
        Scanner sc = new Scanner(System.in);

        do {
            escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:",
                    "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0:
                    opcaoInserir(sm);
                    break;
                case 1:
                    opcaoBuscar(sm);
                    break;
                case 2:
                    opcaoExcluir(sm);
                    break;
                case 3:
                    sm.exibir();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Quantidade: " + sm.contar());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (escolha != 5);

        sc.close();
    }

    public static void opcaoInserir(Simulador sm) {
        String input = JOptionPane.showInputDialog("Digite o número a ser inserido:");
        try {
            int valor = Integer.parseInt(input);
            sm.inserir(valor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida.");
        }
    }

    public static void opcaoBuscar(Simulador sm) {
        String input = JOptionPane.showInputDialog("Digite o número a ser buscado:");
        try {
            int valor = Integer.parseInt(input);
            int encontrado = sm.buscar(valor);

            String msg = (encontrado != -1)
                    ? "Valor encontrado: " + encontrado
                    : "Valor não encontrado.";

            JOptionPane.showMessageDialog(null, msg);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida.");
        }
    }

    public static void opcaoExcluir(Simulador sm) {
        String input = JOptionPane.showInputDialog("Digite o número a ser excluído:");
        try {
            int valor = Integer.parseInt(input);
            boolean removido = sm.excluir(valor);
            String msg = removido ? "Valor excluído!" : "Valor não encontrado.";
            JOptionPane.showMessageDialog(null, msg);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida.");
        }
    }
}
