public class GerenteController {
    private Cozinheiro cozinheiro = new Cozinheiro();
    private Caixa caixa = new Caixa();

    //inicia o "Fazer pedido"
    public Pedido iniciarPedido(){
        return new Pedido();
    }

    /**
     * Padrão GRASP Controller:
     * Gerente (Controller)
     * - Atribui a responsabilidade de lidar com todos os eventos do sistema
     * (iniciar pedido, adicionar prato, fechar conta) a esta classe.
     * - Centraliza o controle;
     * - Não executa a lógica (não calcula o total, não cozinha, não cobra).
     */
    public void adicionarPrato(Pedido pedido, String nomePrato, double preco){
        //Padrão creator: o Gerente cria o objeto prato
        Prato novPrato = new Prato(nomePrato, preco);
        //Padrão Controller: o Gerente passa a responsabilidade de adicionar o Prato ao Pedido
        pedido.adicionarPrato(novPrato);
    }
    //coordena a finalização do pedido
    public void finalizarPedido(Pedido pedido){
        System.out.println("\nGerente está coordenando a execução do pedido...");
        //vai mandar o cozinheiro preparar e o caixa cobrar
        cozinheiro.prepararPratos(pedido);
        caixa.cobrar(pedido);
        System.out.println("Gerente finalizou. Pedido concluido!\n");
    }
    
}
