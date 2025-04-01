package br.com.ph.composicao;


/*
@author Pedro Henrique Araujo
31/03/2025 
*/
public class Aplicacao {

    public static void main(String args []){

    Banco banco = new Banco();
    banco.setCodigo(10L);
    banco.setNome("Banco Itau");

    ContaCorrente cc = new ContaCorrente();
    cc.setBanco(banco);
    cc.setSaldo(10d);
    banco.add(cc);

    ContaPoupanca cp = new ContaPoupanca();
    cp.setBanco(banco);
    cp.setSaldo(10d);
    banco.add(cp);


    }
}
