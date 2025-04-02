import estruturas.Lista;
import estruturas.Vetor;

public class VetorApp {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);
        Lista listaduplamenteencadeada = new Lista();

        // Adicionando elementos ao vetor
        int[] valores = { 2, 7, 9, 12, 16, 21, 27, 33, 42, 54 };
        for (int valor : valores) {
            vetor.adicionar(valor);
        }

        // Exibindo os elementos da lista
        System.out.println("Lista inicial:");
        vetor.mostrarElementos();

        // Testando a busca binária
        System.out.println("-----");
        System.out.println("Buscando o valor 21:");
        vetor.buscaBinaria(21);

        System.out.println("-----");
        System.out.println("Buscando o valor 27:");
        vetor.buscaBinaria(27);

        // Testando a inserção no início da lista
        System.out.println("-----");
        System.out.println("Inserindo o valor 1 no início da lista:");
        vetor.inserirValorNoInicio(1);
        vetor.mostrarElementos();

        listaduplamenteencadeada.adicionarAoInicio(9);
        listaduplamenteencadeada.adicionarAoFim(10);
        listaduplamenteencadeada.adicionarAoFim(20);
        listaduplamenteencadeada.adicionarAoFim(30);

        // Exibindo o número de nós na lista
        System.out.println("Número de nós na lista: " + listaduplamenteencadeada.getTamanho());

        // Inserindo após um valor informado
        listaduplamenteencadeada.inserirApos(20, 25); // Inserindo 25 após 20
        listaduplamenteencadeada.inserirApos(10, 15); // Inserindo 15 após 10

        // Exibindo a lista 
        listaduplamenteencadeada.exibirLista();

        // Testando a remoção
        listaduplamenteencadeada.remover(20);
        listaduplamenteencadeada.exibirLista();


    }
}