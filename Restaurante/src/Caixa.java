//o caixa vai executar a cobrança
public class Caixa {
    public void cobrar(Pedido pedido){
        System.out.println("\nCaixa recebeu a instrução de cobrar o cliente");
        System.out.println("Total da compra: R$"+ pedido.calcularTotal());
    }
}
