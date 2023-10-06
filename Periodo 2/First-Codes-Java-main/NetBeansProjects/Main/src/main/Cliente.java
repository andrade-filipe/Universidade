package main;

import java.util.Date;

public class Cliente {
    private String nome_C;
    private String endereco_C;
    private Date data_Nascimento_C;
    private Date data_Cadastro_C;
    private boolean status_C;

    public Cliente() {
    }

    public Cliente(String nome_C,
            String endereco_C,
            Date data_Nascimento_C,
            Date data_Cadastro_C,
            boolean status_C) {
        
        this.nome_C = nome_C;
        this.endereco_C = endereco_C;
        this.data_Nascimento_C = data_Nascimento_C;
        this.data_Cadastro_C = data_Cadastro_C;
        this.status_C = status_C;
    }

    /**
     * @return the nome_C
     */
    public String getNome_C() {
        return nome_C;
    }

    /**
     * @param nome_C the nome_C to set
     */
    public void setNome_C(String nome_C) {
        this.nome_C = nome_C;
    }

    /**
     * @return the endereco_C
     */
    public String getEndereco_C() {
        return endereco_C;
    }

    /**
     * @param endereco_C the endereco_C to set
     */
    public void setEndereco_C(String endereco_C) {
        this.endereco_C = endereco_C;
    }

    /**
     * @return the data_Nascimento_C
     */
    public Date getData_Nascimento_C() {
        return data_Nascimento_C;
    }

    /**
     * @param data_Nascimento_C the data_Nascimento_C to set
     */
    public void setData_Nascimento_C(Date data_Nascimento_C) {
        this.data_Nascimento_C = data_Nascimento_C;
    }

    /**
     * @return the data_Cadastro_C
     */
    public Date getData_Cadastro_C() {
        return data_Cadastro_C;
    }

    /**
     * @param data_Cadastro_C the data_Cadastro_C to set
     */
    public void setData_Cadastro_C(Date data_Cadastro_C) {
        this.data_Cadastro_C = data_Cadastro_C;
    }

    /**
     * @return the status_C
     */
    public boolean isStatus_C() {
        return status_C;
    }

    /**
     * @param status_C the status_C to set
     */
    public void setStatus_C(boolean status_C) {
        this.status_C = status_C;
    }
}