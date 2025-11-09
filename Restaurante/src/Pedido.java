import java.util.ArrayList;
import java.util.List;

// pedido anotado pelo garçom (pedido tem uma lista de pratos)
public class Pedido {
    private List<Prato> itens;

    /**
     * Padrão GRASP: Creator (Criador)
     * O principio Creator sugere que um objeto B (a lista de itens) deve ser criado por um objeto A 
     * (a classe Pedido) se A agrega, contém ou registra B. 
     * Como o Pedido contem a lista de Pratos, ele é o responsável natural pela 
     * criação e inicialização dessa lista, o que promove o baixo acoplamento da lista.
     */

    public Pedido(){
        this.itens = new ArrayList<>();
    }

    /**
     * Padrão GRASP: Information Expert
     * O Pedido é a classe que possui todas as informações passadas (a lista de 'itens') para 
     * realizar o cálculo do total, tornando-o o "Information Expert" para esta tarefa. 
     * Isso concentra as responsabilidades relacionadas aos dados em uma única classe, 
     * demonstrando Alta Coesão.
     */

    public double calcularTotal(){
        double total = 0;
        for(Prato item : itens){
            total += item.getPreco();
        }
        return total;
    }

    public void adicionarPrato(Prato prato){
        this.itens.add(prato);
    }

    public List<Prato> getItens(){
        return itens;
    }
    
}
