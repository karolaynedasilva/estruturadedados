import estruturas.Iterador;
import estruturas.Lista;
import estruturas.Vetor;

public class VetorApp {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);
        Lista listaduplamenteencadeada = new Lista();

        // Adicionando elementos ao vetor 
        vetor.adicionar(2);
        vetor.adicionar(7);
        vetor.adicionar(9);
        vetor.adicionar(12);
        vetor.adicionar(16);
        vetor.adicionar(21);
        vetor.adicionar(27);
        vetor.adicionar(33);
        vetor.adicionar(42);
        vetor.adicionar(54);

        // Exibindo os elementos da lista
        System.out.println("Vetor inicial:");
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
        System.out.println("Inserindo o valor no início da lista:");
        vetor.inserirValorNoInicio(1);
        vetor.mostrarElementos(); //mostrar a lista com o novo valor no inicio

        //adicionando itens a lista
        listaduplamenteencadeada.adicionarAoInicio(9);
        listaduplamenteencadeada.adicionarAoInicio(10);
        listaduplamenteencadeada.adicionarAoInicio(20);
        listaduplamenteencadeada.adicionarAoInicio(30);
        
       
        System.out.println("Nós da lista:");
        System.out.println("------");
        listaduplamenteencadeada.mostrarNos();

        // Exibindo o número de nós na lista
        System.out.println("------");
        System.out.println("Número de nós na lista: " + listaduplamenteencadeada.contarNos());

        // Inserindo após um valor informado
        listaduplamenteencadeada.inserirApos(20, 25); // Inserindo 25 após 20
        listaduplamenteencadeada.inserirApos(10, 15); // Inserindo 15 após 10
        listaduplamenteencadeada.exibirLista();

        // Testando a remoção
        listaduplamenteencadeada.remover(20);
        listaduplamenteencadeada.exibirLista();
        
        //Inserindo ao final da lista
        System.out.println("Inserindo no fim da lista:");
        listaduplamenteencadeada.adicionarAoFim(10);
        listaduplamenteencadeada.adicionarAoFim(20);
        listaduplamenteencadeada.adicionarAoFim(30);
        listaduplamenteencadeada.mostrarNos();

        System.out.println("------");
        System.out.println("Número de nós na lista: " + listaduplamenteencadeada.contarNos());

        //Inserindo ap´s um valor especifico
        System.out.println("Inserindo 55 após o 10...");
        listaduplamenteencadeada.inserirApos(10, 55);
        listaduplamenteencadeada.mostrarNos();
        System.out.println("------");

        System.out.println("Insere 60 após o atual:");
        Iterador it = listaduplamenteencadeada.getIterador(); //inicializando
        it.proximo(); // anda para o segundo nó (índice 1)
        it.inserirAposAtual(60);
        listaduplamenteencadeada.mostrarNos();
        System.out.println("------");

        System.out.println("Remove o nó após o atual:");
        it = listaduplamenteencadeada.getIterador();
        it.proximo(); // volta ao segundo nó
        it.removerAposAtual(); // remove o 99
        listaduplamenteencadeada.mostrarNos();
        System.out.println("------");

        System.out.println("Inserindo 55 antes do nó atual:");
        it = listaduplamenteencadeada.getIterador();
        it.proximo(); // vai pro segundo nó
        it.inserirAntesAtual(55);
        listaduplamenteencadeada.mostrarNos();
        System.out.println("------");

        System.out.println("Removendo o nó antes do atual:");
        it = listaduplamenteencadeada.getIterador();
        it.proximo(); // vai pro segundo nó
        it.removerAntesAtual();
        listaduplamenteencadeada.mostrarNos();
        System.out.println("------");

    }
}