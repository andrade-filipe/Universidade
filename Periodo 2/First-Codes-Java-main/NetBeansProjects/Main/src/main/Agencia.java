package main;

import java.util.Date;

public class Agencia {
    private int id_Banco;
    private int id_Agencia;
    private String cnpj_A;
    private String nome_A;
    private Date data_Abertura;
    private String endereco_A;
    private Funcionario gerente;

    public Agencia() {
    }

    public Agencia(int id_Banco,
            int id_Agencia,
            String cnpj_A,
            String nome_A,
            Date data_Abertura,
            String endereco_A,
            Funcionario gerente) {
        
        this.id_Banco = id_Banco;
        this.id_Agencia = id_Agencia;
        this.cnpj_A = cnpj_A;
        this.nome_A = nome_A;
        this.data_Abertura = data_Abertura;
        this.endereco_A = endereco_A;
        this.gerente = gerente;
    }

    /**
     * @return the id_Banco
     */
    public int getId_Banco() {
        return id_Banco;
    }

    /**
     * @param id_Banco the id_Banco to set
     */
    public void setId_Banco(int id_Banco) {
        this.id_Banco = id_Banco;
    }

    /**
     * @return the id_Agencia
     */
    public int getId_Agencia() {
        return id_Agencia;
    }

    /**
     * @param id_Agencia the id_Agencia to set
     */
    public void setId_Agencia(int id_Agencia) {
        this.id_Agencia = id_Agencia;
    }

    /**
     * @return the cnpj_A
     */
    public String getCnpj_A() {
        return cnpj_A;
    }

    /**
     * @param cnpj_A the cnpj_A to set
     */
    public void setCnpj_A(String cnpj_A) {
        this.cnpj_A = cnpj_A;
    }

    /**
     * @return the nome_A
     */
    public String getNome_A() {
        return nome_A;
    }

    /**
     * @param nome_A the nome_A to set
     */
    public void setNome_A(String nome_A) {
        this.nome_A = nome_A;
    }

    /**
     * @return the data_Abertura
     */
    public Date getData_Abertura() {
        return data_Abertura;
    }

    /**
     * @param data_Abertura the data_Abertura to set
     */
    public void setData_Abertura(Date data_Abertura) {
        this.data_Abertura = data_Abertura;
    }

    /**
     * @return the endereco_A
     */
    public String getEndereco_A() {
        return endereco_A;
    }

    /**
     * @param endereco_A the endereco_A to set
     */
    public void setEndereco_A(String endereco_A) {
        this.endereco_A = endereco_A;
    }

    /**
     * @return the gerente
     */
    public Funcionario getGerente() {
        return gerente;
    }

    /**
     * @param gerente the gerente to set
     */
    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }
    
}
