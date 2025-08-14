package org.example;

public class Main {
    public static void main(String[] args) {

        PilhaLIFOeFIFO pilha = new PilhaLIFOeFIFO();

        // Adicionar elementos (LIFO)
        pilha.adicionarLIFO("A");
        pilha.adicionarLIFO("B");
        pilha.adicionarLIFO("C");

        // Remover elementos (LIFO)
        System.out.println("Removendo LIFO: " + pilha.removerLIFO()); // C
        System.out.println("Removendo LIFO: " + pilha.removerLIFO()); // B

        // Adicionar elementos (FIFO)
        pilha.adicionarFIFO("D");
        pilha.adicionarFIFO("E");
        pilha.adicionarFIFO("F");

        // Remover elementos (FIFO)
        System.out.println("Removendo FIFO: " + pilha.removerFIFO()); // D
        System.out.println("Removendo FIFO: " + pilha.removerFIFO()); // E
    }
}