package br.com.ph.agregacao;


import java.util.ArrayList;
import java.util.List;

/*
@author Pedro Henrique Araujo
31/03/2025 
*/
public class Venda {
    private Comprador comprador;
    private Vendedor vendedor;
    private List<Produto> produtos;

    public Venda(){
        this.produtos = new ArrayList<>();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public  List<Produto> getProdutos() {
        return produtos;
    }

    public void add(Produto produto){
        this.produtos.add(produto);
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void concretizarVenda(){
        System.out.println("Comprador " + this.comprador.getNome());
        System.out.println("Comprou os itens: ");
        for (Produto prod : this.produtos){
            System.out.println("Nome do produto: " + prod.getNome() + " Valor do produto: " + prod.getPreco());

        }
        System.out.println("Vendedor: " + vendedor.getNome());

    }

    public void cancelarVenda(){
        System.out.println("Venda cancelada!");


    }

    @Override
    public String toString() {
        return "Venda{" +
                "comprador=" + comprador.getNome() +
                ", vendedor=" + vendedor.getNome() +
                ", produtos=" + produtos +
                '}';
    }
}
