public class Produto {
    private String nome;
    private double preço;
    private int quantidade;

    /* gets */
    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    /* sets */
    public Produto(String nome, Double preço, int quantidade){
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public Produto(String nome, Double preço){
        this(nome, preço, 0);
    } 
}
