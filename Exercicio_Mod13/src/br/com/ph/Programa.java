package br.com.ph;

public class Programa {
    public static void main(String[] args) {


        PessoaFisica pessoaF = new PessoaFisica();
        pessoaF.setNome("Pedro");
        pessoaF.setSobrenome("Araujo");
        pessoaF.setIdade(27d);
        pessoaF.setCpf(75485233697L);
        pessoaF.setTipo("Pessoa Fisica CPF:");
        imprimir(pessoaF);

        PessoaJuridica pessoaJ = new PessoaJuridica();
        pessoaJ.setNome("Thaina");
        pessoaJ.setSobrenome("Zamperlim");
        pessoaJ.setIdade(27d);
        pessoaJ.setTipo("Pessoa Juridica CNPJ:");
        pessoaJ.setCnpj(35468701000125L);
        imprimir(pessoaJ);
    }

    public static void imprimir(Pessoa pessoa){
        System.out.println("Nome: " + pessoa.getNome()+ " " + pessoa.getSobrenome()+ "\n"+ pessoa.getTipo()
                + pessoa.documento());
        System.out.println(" ");
    }
}