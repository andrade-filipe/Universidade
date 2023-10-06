package main;

import java.util.Date;

public class Banco {
    private int id_B;
    private String cnpj_B;
    private String nome_B;
    private Date data_Cadastro_B;

    public Banco() {
    }

    public Banco(int id_B, String cnpj_B, String nome_B, Date data_Cadastro_B) {
        this.id_B = id_B;
        this.cnpj_B = cnpj_B;
        this.nome_B = nome_B;
        this.data_Cadastro_B = data_Cadastro_B;
        
        
    }
    
    public void cadastrarBanco(){
        
    }
    public void alterarBanco() {
        
    }
    public void consultarBancos() {
        
    }

    /**
     * @return the id_B
     */
    public int getId_B() {
        return id_B;
    }

    /**
     * @param id_B the id_B to set
     */
    public void setId_B(int id_B) {
        this.id_B = id_B;
    }

    /**
     * @return the cnpj_B
     */
    public String getCnpj_B() {
        return cnpj_B;
    }

    /**
     * @param cnpj_B the cnpj_B to set
     */
    public void setCnpj_B(String cnpj_B) {
        this.cnpj_B = cnpj_B;
    }

    /**
     * @return the nome_B
     */
    public String getNome_B() {
        return nome_B;
    }

    /**
     * @param nome_B the nome_B to set
     */
    public void setNome_B(String nome_B) {
        this.nome_B = nome_B;
    }

    /**
     * @return the data_Cadastro_B
     */
    public Date getData_Cadastro_B() {
        return data_Cadastro_B;
    }

    /**
     * @param data_Cadastro_B the data_Cadastro_B to set
     */
    public void setData_Cadastro_B(Date data_Cadastro_B) {
        this.data_Cadastro_B = data_Cadastro_B;
    }
}
