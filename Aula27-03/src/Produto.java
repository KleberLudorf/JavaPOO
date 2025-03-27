public class Produto {
    private String nome;
    private double preço;
    private int quantidade;

    /*gets */
    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    /*sets */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
