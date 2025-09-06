package br.com.ph.facade;


/*
@author Pedro Henrique Araujo
05/09/2025 
*/
public class ApartamentoService implements IApartamentoService{

    @Override
    public boolean CadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isApartamentoCadastrado();
        Boolean isCamposValidos = isCamposValidos(apartamento);
        if(isCadastrado && isCamposValidos){
            return false;
        }

        cadastrarNoBanco(apartamento);

        return cadastrarNoBanco(apartamento);
    }

    private Boolean cadastrarNoBanco(Apartamento apartamento){
        //Logica de cadastro
        return true;

    }

    private Boolean isApartamentoCadastrado(){

        //Verifica se ja está cadastrado
        return false;
    }

    private Boolean isCamposValidos(Apartamento apartamento){

        return true;
    }

}
