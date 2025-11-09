// o garçom é quem interage com o cliente e envia a "ação" para o controller (Gerente)
public class Garcom {
    private final GerenteController gerente; 

    public Garcom(GerenteController gerente){
        this.gerente = gerente;
    }

    //simulo a anotação do pedido pra ser encaminhado pro Gerente

    public Pedido receberEncaminhar (String nomeCliente){
        System.out.println("Garçom está anotando o pedido do cliente " + nomeCliente);
        //Aplicação do Padrão Controller (método): gerente.iniciarPedido()
        Pedido novoPedido = gerente.iniciarPedido(); //Garçom inicia e o controller que vai lidar com o evento

        //Garçom vai passar quais os pedidos. O Gerente cria os objetos Prato
        //Aplicação do Padrão Controller (método):: gerente.adicionarPrato()
        gerente.adicionarPrato(novoPedido, "Macarronada", 45.00);
        gerente.adicionarPrato(novoPedido, "refrigerante zero", 8.00);

        System.out.println("Garçom enviou o pedido para o Gerente");
        return novoPedido;

    }
}
