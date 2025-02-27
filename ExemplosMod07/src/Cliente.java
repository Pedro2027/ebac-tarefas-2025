public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;

    public Cliente() {
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarEndereco(String endereco) {
        this.setEndereco(endereco);
    }

    public void imprimirEndereco() {
        System.out.println(this.endereco);
    }

    public String retornarNomeCliente() {
        return "Endereço do Pedro";
    }

    public int getValorTotal() {
        return 20;
    }
}
