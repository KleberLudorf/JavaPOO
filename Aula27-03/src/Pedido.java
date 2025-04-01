public class Pedido {
    private Produto[] itens;

    public Produto[] getProdutos() {
        return itens;
    }

    public void setItens(Produto[] produtos) {
        this.itens = produtos;
    }

    public double calcularvalorTotal() {
        double valor = 0.0;
        for (Produto produtos : itens) {
            valor += produtos.getPreço();
        }
        return valor;
    }

}
