package org.example;

import java.util.Stack;

public class PilhaLIFOeFIFO {

    private Stack<String> pilha1;
    private Stack<String> pilha2;

    public PilhaLIFOeFIFO() {
        pilha1 = new Stack<>();
        pilha2 = new Stack<>();
    }

    // Adicionar elementos (LIFO)
    public void adicionarLIFO(String elemento) {
        pilha1.push(elemento);
    }

    // Remover elementos (LIFO)
    public String removerLIFO() {
        return pilha1.pop();
    }

    // Adicionar elementos (FIFO)
    public void adicionarFIFO(String elemento) {
        pilha1.push(elemento);
    }

    // Remover elementos (FIFO)
    public String removerFIFO() {
        if (pilha2.isEmpty()) {
            while (!pilha1.isEmpty()) {
                pilha2.push(pilha1.pop());
            }
        }
        return pilha2.pop();
    }
}