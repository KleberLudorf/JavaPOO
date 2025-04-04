public class Cliente {
    private String nome;
    private String cpf;
    private Pedido[] pedidos;
    private int totalPedidos = 0;

    public Cliente() {
        pedidos = new Pedido[100];
        totalPedidos = 0;
    }

    /* gets */
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    /* sets */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos[totalPedidos] = pedido;
        totalPedidos++;
    }

    public Cliente(String nome, String cpf) {
        this();
        this.nome = nome;
        this.cpf = cpf;
    }

    public void relatorio(){
        int count = 1;
        System.out.println("Total de Pedidos : "+ totalPedidos);
        for(Pedido pedido : pedidos){
            if(pedido == null){
                break;
            }
            System.out.println("Pedido: [" +count + "] total de compra: " + pedido.calcularvalorTotal());
        }
    }
    

}
