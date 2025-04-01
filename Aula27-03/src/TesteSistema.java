public class TesteSistema {

    public static void main(String[] args) throws Exception {
        var p1 = new Produto("Produto 1", 6.00, 10);
        var p2 = new Produto("Produto 2", 5.99);
        var p3 =  new Produto("Produto 3 ", 10.00);
        var p4 =  new Produto("Produto 4" ,3.98 );

        Produto[] Lista1 = {p1,p2};
        Produto[] Lista2 = {p3,p4};

        var Pedido1 = new Pedido();
        var Pedido2 = new Pedido();

        Pedido1.setItens(Lista1);
        Pedido2.setItens(Lista2);

        var joao = new Cliente("João", "111.111.111-11");
        var maria = new Cliente("Maria", "222.222.222-22");

        System.out.println("Pedidos do João");

        joao.adicionarPedido(Pedido1);
        joao.adicionarPedido(Pedido2);
        joao.relatorio();

        System.out.println("Pedidos da Maria");
        
        maria.adicionarPedido(Pedido2);
        maria.relatorio();
    
        
    }
}
