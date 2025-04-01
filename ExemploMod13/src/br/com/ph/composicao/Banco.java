package br.com.ph.composicao;


import java.util.HashSet;
import java.util.Set;

/*
@author Pedro Henrique Araujo
31/03/2025 
*/
public class Banco {
    private Long codigo;
    private String nome;
    private Set<ContaCorrente> contasCorrentes;
    private Set<ContaPoupanca> contasPoupanca;

    public Banco(){
        this.contasCorrentes = new HashSet<>();
        this.contasPoupanca = new HashSet<>();
    }

    public void add(ContaCorrente cc){
        this.contasCorrentes.add(cc);
    }

    public void add(ContaPoupanca cp){
        this.contasPoupanca.add(cp);
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
