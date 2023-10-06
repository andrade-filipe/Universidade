package main;

import java.util.Date;

public class Funcionario {
    private String cpf;
    private String nome_F;
    private Date data_Nascimento_F;
    private String endereco_F;
    private Date data_Cadastro_F;
    private boolean status_F;
    private int salario;
    private String cargo;
    private int code_Banco;

    public Funcionario() {
    }

    public Funcionario(String cpf,
            String nome_F,
            Date data_Nascimento_F,
            String endereco_F,
            Date data_Cadastro_F,
            boolean status_F,
            int salario,
            String cargo,
            int code_Banco) {
        
        this.cpf = cpf;
        this.nome_F = nome_F;
        this.data_Nascimento_F = data_Nascimento_F;
        this.endereco_F = endereco_F;
        this.data_Cadastro_F = data_Cadastro_F;
        this.status_F = status_F;
        this.salario = salario;
        this.cargo = cargo;
        this.code_Banco = code_Banco;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome_F
     */
    public String getNome_F() {
        return nome_F;
    }

    /**
     * @param nome_F the nome_F to set
     */
    public void setNome_F(String nome_F) {
        this.nome_F = nome_F;
    }

    /**
     * @return the data_Nascimento_F
     */
    public Date getData_Nascimento_F() {
        return data_Nascimento_F;
    }

    /**
     * @param data_Nascimento_F the data_Nascimento_F to set
     */
    public void setData_Nascimento_F(Date data_Nascimento_F) {
        this.data_Nascimento_F = data_Nascimento_F;
    }

    /**
     * @return the endereco_F
     */
    public String getEndereco_F() {
        return endereco_F;
    }

    /**
     * @param endereco_F the endereco_F to set
     */
    public void setEndereco_F(String endereco_F) {
        this.endereco_F = endereco_F;
    }

    /**
     * @return the data_Cadastro_F
     */
    public Date getData_Cadastro_F() {
        return data_Cadastro_F;
    }

    /**
     * @param data_Cadastro_F the data_Cadastro_F to set
     */
    public void setData_Cadastro_F(Date data_Cadastro_F) {
        this.data_Cadastro_F = data_Cadastro_F;
    }

    /**
     * @return the status_F
     */
    public boolean isStatus_F() {
        return status_F;
    }

    /**
     * @param status_F the status_F to set
     */
    public void setStatus_F(boolean status_F) {
        this.status_F = status_F;
    }

    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the code_Banco
     */
    public int getCode_Banco() {
        return code_Banco;
    }

    /**
     * @param code_Banco the code_Banco to set
     */
    public void setCode_Banco(int code_Banco) {
        this.code_Banco = code_Banco;
    }
    
}
