package br.com.ph.agregacao;


/*
@author Pedro Henrique Araujo
31/03/2025 
*/
public class Programa {

    public static void main (String args[]){
        Produto produtoTV = criarProduto(1L,50d,"TV");
        Produto produtoCel = criarProduto(2L, 1300d, "Iphone");

        Vendedor vendedor = criarVendedor("Pedro",10d);

        Comprador comprador = criarComprador("Thaina", 1200d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoTV);
        venda.add(produtoCel);

        venda.concretizarVenda();

        venda.cancelarVenda();
        System.out.println(venda);
        venda = null;
        System.out.println(venda);
        System.out.println(produtoTV.getNome());

    }

    private static Comprador criarComprador(String nome, double verba) {
        return new Comprador(nome, verba);

    }

    private static Vendedor criarVendedor(String nome, double comissao) {
        Vendedor vendedor  = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;

    }

    public static Produto criarProduto(Long codigo, Double valor, String nome){
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;


    }
}
