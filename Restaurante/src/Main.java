public class Main { //aqui é o ponto de entrada da aplicação
    public static void main(String[] args) throws Exception {
        System.out.println("---Bem-vindo ao Restaurante---\n");
        GerenteController gerente = new GerenteController();
        //depois de inicializar, o garçom interage com o gerente
        Garcom garcom = new Garcom(gerente);

        //Garcom recebe e encaminha o pedido para o gerente(vai ser o evento de entrada)
        Pedido pedidoCliente = garcom.receberEncaminhar(("Karen Almeida"));

        //Agora o Gerente(Controller) vai coordenar o resto do processo
        gerente.finalizarPedido(pedidoCliente);
    }
}
