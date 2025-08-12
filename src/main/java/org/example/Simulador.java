package org.example;

public class Simulador {
    private int[] elementos; // Vetor que armazena os valores
    private int tamanho; // Quantos Elementos foram inseridos

    // Construtor - inicializa a lista com capacidade máxima
    public Simulador(int capacidade) {
        elementos = new int[capacidade];
        tamanho = 0;
    }

    // Inserir elemeto no final
    public void inserir(int valor) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("Lista Cheia!");
        }
    }

    public boolean excluir(int valor){
        for (int i = 0; i < tamanho; i++){
            if (elementos[i] == valor){
                // Mover todos os elementos para trás
                for (int j = i; j < tamanho - 1; j++){
                    elementos[j] = elementos[j + 1];
                }
                tamanho--;
                return true;
            }
        }
        return false;
    }

    // Buscar por um elemento específico
    public int buscar(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == valor) {
                return i; // Retorna o índice
            }
        }
        return -1; // Não encontrado
    }

    // Contagem de elementos
    public int contar(){
            return tamanho;
        }
        
    // Mostrar todos elementos
    public void exibir() {
         for (int i = 0; i < tamanho; i++){
             System.out.print(elementos[i] + "");
         }
         System.out.println();
        }
    }
