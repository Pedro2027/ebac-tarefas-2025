package br.com.ph;


/*
@author Pedro Henrique Araujo
03/04/2025 
*/
public class PessoaFisica extends Pessoa {

    private Long cpf;




    public Long getCpf() {
        return cpf;

    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public Long documento() {
        return cpf;
    }
}
