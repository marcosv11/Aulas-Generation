package Main;

public class AcessoGeral {
    private String nome;
    private String endereco;
    private String telefone;
    private int rg;
    private long cpf;


    public AcessoGeral(String nome, String endereco, String telefone, int rg, long cpf) {

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
    }


    public int getRg() {
        return rg;
    }


    public void setRg(int rg) {
        this.rg = rg;
    }


    public long getCpf() {
        return cpf;
    }


    public void setCpf(long cpf) {
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String entereco) {
        this.endereco = entereco;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



}