import java.util.ArrayList;
import java.util.Date;

public class Registro extends Morador {
    private static String resposta;
    private static Date data;
    static ArrayList<String> respostaLista = new ArrayList<String>();
    public Registro(String nome, String bloco, String apartamento, String resposta, Date data) {
        super(nome, bloco, apartamento);
        this.resposta = resposta;
        this.data = data;
    }

    public static String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        respostaLista.add(resposta);
        this.resposta = resposta;
    }

    public static Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "respostas:" + respostaLista.toString() + ", data: " + data;
    }
}
