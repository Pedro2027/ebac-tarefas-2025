package br.com.ph.composicao;


/*
@author Pedro Henrique Araujo
31/03/2025 
*/
public class ContaPoupanca {
    private Banco banco;
    private Double saldo;



    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
