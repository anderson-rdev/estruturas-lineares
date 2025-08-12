package org.example;

public class Main {
    public static void main(String[] args) {

        Simulador sm = new Simulador(5);

        // Aplicando função de inserir
        sm.inserir(10);
        sm.inserir(20);
        sm.inserir(30);
        sm.inserir(54);

        // Bucando Item especifico
        // System.out.println("" + sm.buscar(20));

        // sm.excluir(10);
        // sm.exibir();

        // Contagem
        System.out.println("Quantidade: " + sm.contar());
    }
}