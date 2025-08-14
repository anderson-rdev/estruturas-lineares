package org.example;
import java.util.Queue;
import java.util.LinkedList;
    public class FilaLIFOeFIFO {
        private final Queue<String> fila;
        public FilaLIFOeFIFO() {
            fila = new LinkedList<>();
        }
        // Adicionar elementos (FIFO)
        public void adicionarFIFO(String elemento) {
            fila.add(elemento);
        }
        // Remover elementos (FIFO)
        public String removerFIFO() {
            return fila.poll();
        }
        // Adicionar elementos (LIFO)
        public void adicionarLIFO(String elemento) {
            fila.add(elemento);
        }
        // Remover elementos (LIFO)
        public String removerLIFO() {
            int tamanho = fila.size();
            for (int i = 0; i < tamanho - 1; i++) {
                fila.add(fila.poll());
            }
            return fila.poll();
        }
}
