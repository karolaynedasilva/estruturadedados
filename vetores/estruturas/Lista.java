package estruturas;

public class Lista {

    public No inicio;
    private int tamanho;

    public void Lista() {
        this.inicio = null;
        this.tamanho = 0;
    }
    // adiciona um valor ao inicio da lista
    public void adicionarAoInicio(int valor) {
        No no = new No(valor);

        if (this.inicio == null) {
            this.inicio = no;
            return;
        }

        this.inicio.anterior = no;

        no.proximo = this.inicio;
        this.inicio = no;
    }
    //mostra os nos - iterador
    public void mostrarNos() {
        Iterador iterador = this.getIterador();
        
        while (iterador.getAtual() != null) {
            iterador.display();
        }
    }
    //remove um valor da lista
    public void remover(int valor) {
        No noAux = this.inicio;
        // Percorre a lista até encontrar o valor 
        while (noAux != null && noAux.dado != valor) {
            noAux = noAux.proximo;
        }
        // se o valor nao for encontrado, retorna null
        if (noAux == null) {
            System.out.println("Valor não encontrado");
            return;
        }

        // se o valor for o primeiro da lista, atualiza o inicio
        noAux.anterior.proximo = noAux.proximo;
        noAux.proximo.anterior = noAux.anterior;
    }
    public int getTamanho() {
    return tamanho;
}
    public Iterador getIterador() {
        return new Iterador(this, this.inicio);
    }
    // Adiciona um valor ao final da lista
    public void adicionarAoFim(int valor) {
        No novo = new No(valor);
    
        if (this.inicio == null) {
            this.inicio = novo;
            return;
        }
    
        No atual = this.inicio;
    
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
    
        atual.proximo = novo;
        novo.anterior = atual;
    }
    // Adiciona um valor em uma posição específica da lista
    public int contarNos() {
        int contador = 0;
        No atual = this.inicio;
    
        while (atual != null) {
            contador++;
            atual = atual.proximo;
        }
    
        return contador;
    }
    // Adiciona um valor em uma posição específica da lista
    public void inserirApos(int valorExistente, int novoValor) {
        No atual = this.inicio;
    
        while (atual != null && atual.dado != valorExistente) {
            atual = atual.proximo;
        }
    
        if (atual == null) {
            System.out.println("Valor não encontrado na lista.");
            return;
        }
    
        No novo = new No(novoValor);
    
        novo.proximo = atual.proximo;
        novo.anterior = atual;
        atual.proximo = novo;
    
        if (novo.proximo != null) {
            novo.proximo.anterior = novo;
        }
    }
    public void exibirLista() {
        No noAux = inicio;
        System.out.print("Lista: ");
        while (noAux != null) {
            System.out.print(noAux.dado + " <-> ");
            noAux = noAux.proximo;
        }
        System.out.println("null");
    }
}
