package br.com.ph.agregacao;

public class Comprador {

    private Double verba;



    public String getNome() {
        return nome;
    }

    public Comprador(String nome, Double verba) {
        this.verba = verba;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    public Double getVerba() {
        return verba;
    }

    public void setVerba(Double verba) {
        this.verba = verba;
    }


    public void comprar(){
        System.out.println("Comprar!");
    }

}
