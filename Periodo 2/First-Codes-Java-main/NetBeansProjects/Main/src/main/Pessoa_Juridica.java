package main;

import java.util.Date;

public class Pessoa_Juridica extends Cliente{
    private String cnpj_C;
    private String inscricao_Estadual;

    public Pessoa_Juridica(
            String nome_C,
            String endereco_C,
            Date data_Nascimento_C,
            Date data_Cadastro_C,
            boolean status_C,
            String cnpj_C,
            String inscricao_Estadual) {
        
        super(nome_C, endereco_C, data_Nascimento_C, data_Cadastro_C, status_C);
        this.cnpj_C = cnpj_C;
        this.inscricao_Estadual = inscricao_Estadual;
    }

    /**
     * @return the cnpj_C
     */
    public String getCnpj_C() {
        return cnpj_C;
    }

    /**
     * @param cnpj_C the cnpj_C to set
     */
    public void setCnpj_C(String cnpj_C) {
        this.cnpj_C = cnpj_C;
    }

    /**
     * @return the inscricao_Estadual
     */
    public String getInscricao_Estadual() {
        return inscricao_Estadual;
    }

    /**
     * @param inscricao_Estadual the inscricao_Estadual to set
     */
    public void setInscricao_Estadual(String inscricao_Estadual) {
        this.inscricao_Estadual = inscricao_Estadual;
    }
    
}
