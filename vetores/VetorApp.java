import estruturas.Lista;
import estruturas.Vetor;

public class VetorApp {

    public static void main(String[] args) {

        // Criando um vetor
        Vetor lista = new Vetor(10);

        // Adicionando elementos ao vetor
        int[] valores = { 2, 7, 9, 12, 16, 21, 27, 33, 42, 54 };
        for (int valor : valores) {
            lista.adicionar(valor);
        }

        // Exibindo os elementos da lista
        System.out.println("Lista inicial:");
        lista.mostrarElementos();

        // Testando a busca binária
        System.out.println("Buscando o valor 21:");
        lista.buscaBinaria(21);

        System.out.println("Buscando o valor 27:");
        lista.buscaBinaria(27);

        // Testando a inserção no início da lista
        System.out.println("Inserindo o valor 1 no início da lista:");
        lista.inserirValorNoInicio(1);
        lista.mostrarElementos();

        // Lista lista = new Lista();

        // lista.adicionarAoInicio(28);
        // lista.adicionarAoInicio(27);
        // lista.adicionarAoInicio(24);
        // lista.adicionarAoInicio(21);
        // lista.adicionarAoInicio(32);
        // lista.adicionarAoInicio(12);
        // lista.adicionarAoInicio(2);

        // lista.mostrarNos();

        // System.out.println("-----");

        // lista.remover(21);
        // lista.mostrarNos();
    }
}