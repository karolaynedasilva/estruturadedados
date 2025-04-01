package estruturas;

import java.util.Arrays;

public class Vetor {

    public Integer[] elementos;
    private int tamanho;
    private int capacidade;

    // Definindo a capacidade do vetor através do construtor.
    public Vetor(int capacidade) {
        this.elementos = new Integer[capacidade];
        this.capacidade = capacidade;
        this.tamanho = 0;
    }

    // Se for necessário adicionar um valor na lista é preciso verificar a
    // capacidade.
    public void adicionar(Integer valor) {
        if (this.capacidade == this.tamanho) {
            this.aumentarCapacidade();
        }

        this.elementos[this.tamanho] = valor;
        this.tamanho++;
    }

    // Se a capacidade não for suficiente é preciso aumentar o tamanho da lista
    private void aumentarCapacidade() {
        int novaCapacidade = this.capacidade + (this.capacidade / 2);
        Integer[] novosElementos = new Integer[novaCapacidade];

        for (int i = 0; i < this.tamanho; i++) {
            novosElementos[i] = this.elementos[i];
        }

        this.elementos = novosElementos;
        this.capacidade = novaCapacidade;
    }

    // Método para mostrar os elementos da lista a
    public void mostrarElementos() {
        System.out.println("-----");
        System.out.println("Elementos no vetor");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(this.elementos[i]);
        }
        System.out.println("-----");
    }

    // Método para verificar se contem um item desejado
    public void contem(Integer valor) {
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i] == valor) {
                System.out.println("Valor encontrado");
                return;
            }
        }
        System.out.println("Valor não encontrado");
    }

    // Para remover é preciso informar a posição
    public void remover(int posicao) {
        if (posicao > this.tamanho) {
            System.out.println("Posição informada é inválida");
            return;
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;
    }

    // Método para remover o valor especifico da lista
    public void removerPorValor(Integer valor) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i] == valor) {
                this.remover(i);
                System.out.println("Item removido");
                return;
            }
        }

        System.out.println("Item não encontrado");
    }

    public int buscaBinaria(int valor) {
        System.out.println("Array atual: " + Arrays.toString(this.elementos));

        int inicio = 0;
        int fim = this.tamanho - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            // Exibir os valores da iteração atual
            System.out.println("Buscando: " + valor + " | Início: " + inicio + ", Fim: " + fim + ", Meio: " + meio
                    + ", Valor no meio: " + this.elementos[meio]);
            if (this.elementos[meio] == valor) {
                System.out.println("Valor encontrado na posição: " + meio);
                return meio; // Encontrou
            } else if (this.elementos[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        System.out.println("Valor não encontrado.");
        return -1; // Não encontrado
    }

    // Exercicio 1 - inserir valor no inicio
    public void inserirValorNoInicio(Integer valor) {
        if (this.capacidade == this.tamanho) {
            this.aumentarCapacidade();
        }

        for (int i = this.tamanho; i > 0; i--) {
            this.elementos[i] = this.elementos[i - 1];
        }

        this.elementos[0] = valor;
        this.tamanho++;
    }
}