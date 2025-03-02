/**
 * @author Pedro Henrique
 * @date 26/02/2025 23:48
 */


public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String sexo;
    private String cor;

    Public Pessoa (){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String retornaNomePessoa(){
        return ("Pedro Henrique Araujo");
    }

    public void imprimirCpf(){
        System.out.println(this.cpf);
    }
}
