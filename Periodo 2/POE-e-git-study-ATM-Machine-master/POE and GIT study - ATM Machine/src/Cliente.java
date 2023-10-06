public class Cliente {
    private String nome;
    private String email;
    private String senha;
    private String pessoa;
    private double saldo;
    private boolean tipoConta;
    private boolean pessoaConta;
    private int conta;

    public Cliente(int conta,String nome, String email, String senha, String pessoa, double saldo, boolean tipoConta, boolean pessoaConta) {
        this.conta = conta;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.pessoa = pessoa;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.pessoaConta = pessoaConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(boolean tipoConta) {
        this.tipoConta = tipoConta;
    }

    public boolean getPessoaConta() {
        return pessoaConta;
    }

    public void setPessoaConta(boolean pessoaConta) {
        this.pessoaConta = pessoaConta;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }
}