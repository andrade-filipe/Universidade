
package pesquisa;

import java.util.Date;

public class RegistroFactory extends CadastroMorador{
    private String bloco;
    private String apartamento;
    private String resposta;
    private Date data;

    public RegistroFactory(String nome, String bloco, String apartamento, String resposta, Date data) {
        super(nome, bloco, apartamento);
        this.resposta = resposta;
        this.data = data;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
