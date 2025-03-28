package br.com.ph.abstratas;


/*
@author Pedro Henrique Araujo
27/03/2025 
*/
public class Comissionado extends Empregado{

    private Double totalComissao;

    private Double totalVenda;



    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Double getTotalComissao() {
        return totalComissao;
    }

    public void setTotalComissao(Double totalComissao) {
        this.totalComissao = totalComissao;
    }



    @Override
    public Double vencimento() {
        return totalVenda * totalComissao;
    }
}
