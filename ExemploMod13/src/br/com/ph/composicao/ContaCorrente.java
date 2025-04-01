package br.com.ph.composicao;


/*
@author Pedro Henrique Araujo
31/03/2025 
*/
public class ContaCorrente {


    private Banco banco;
    private Double saldo;
    private Double chequeEspecial;



    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
