package org.example;

public class Main {
    public static void main(String[] args) {
        FilaLIFOeFIFO fila = new FilaLIFOeFIFO();
        // Adicionar elementos (FIFO)
        fila.adicionarFIFO("AA");
        fila.adicionarFIFO("B");
        fila.adicionarFIFO("C");
        // Remover elementos (FIFO)
        System.out.println("Removendo FIFO: " + fila.removerFIFO()); // A
        System.out.println("Removendo FIFO: " + fila.removerFIFO()); // B
        // Adicionar elementos (LIFO)
        fila.adicionarLIFO("A");
        fila.adicionarLIFO("E");
        fila.adicionarLIFO("F");
        // Remover elementos (LIFO)
        System.out.println("Removendo LIFO: " + fila.removerLIFO()); // F
        System.out.println("Removendo LIFO: " + fila.removerLIFO()); // E
    }
}
