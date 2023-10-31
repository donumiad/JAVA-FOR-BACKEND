public class Cliente {
    private String nome;
    private long cpf;
    private String endereco;
    private String telefonePrincipal;
    private String senha;
    
    public Cliente(String nome, long cpf, String endereco, String telefonePrincipal, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefonePrincipal = telefonePrincipal;
        this.senha = senha;
    }


    public String getNome() {
        return nome;
    }
    public long getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone1() {
        return telefonePrincipal;
    }
    public String getTelefone2() {
        return telefonePrincipal;
    }
    protected String getSenha() {
        return senha;
    }
}


