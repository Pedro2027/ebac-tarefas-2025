package br.com.ph;


/*
@author Pedro Henrique Araujo
03/04/2025 
*/
public class PessoaJuridica extends Pessoa{

    private Long cnpj;




    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public Long documento() {
        return cnpj;
    }
}
