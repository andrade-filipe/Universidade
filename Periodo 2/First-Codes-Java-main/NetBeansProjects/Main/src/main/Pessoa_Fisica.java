package main;

import java.util.Date;

public class Pessoa_Fisica extends Cliente{
    private String cpf_C;

    public Pessoa_Fisica(
            String nome_C,
            String endereco_C,
            Date data_Nascimento_C,
            Date data_Cadastro_C,
            boolean status_C,
            String cpf_C) {
        
        super(nome_C, endereco_C, data_Nascimento_C, data_Cadastro_C, status_C);
        this.cpf_C = cpf_C;
    }

    public String getCpf_C() {
        return cpf_C;
    }

    public void setCpf_C(String cpf_C) {
        this.cpf_C = cpf_C;
    }
    
}
