//o Cozinheiro vai apenas executar a preparação
public class Cozinheiro {
    public void prepararPratos(Pedido pedido) {
        System.out.println("\nCozinheiro recebeu a instrução de preparar o prato");
        System.out.println("Cozinheiro preparando "+ pedido.getItens());
    }
    
}
