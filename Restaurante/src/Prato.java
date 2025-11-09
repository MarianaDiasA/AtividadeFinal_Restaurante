// O que o cliente vai pedir
public class Prato {
    private String nome;
    private double preco;


    public Prato(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }

    @Override
    public String toString(){
        return nome + " (R$ " + preco + ")";
    }
}
