package pesquisa;

import java.util.Date;
import java.util.Scanner;

public class RegistroPesquisa extends RegistroFactory{
    int x = 0;
    String pergunta = Perguntas(x,perguntaLista.get(x));
    
    public RegistroPesquisa(String nome,String bloco, String apartamento,String pergunta, String resposta, Date data) {
        super(nome, bloco, apartamento, resposta, data);
        this.pergunta = pergunta;
    }
    public void registroPesquisa() {
        Scanner input = new Scanner(System.in);
        Date date = new Date();
        RegistroFactory registro = new RegistroFactory(getNome(),getBloco(),getApartamento(),getResposta(),getData());

        registro.setNome(getNome());
        registro.setBloco(getBloco());
        registro.setApartamento(getApartamento());

        System.out.println();
        setResposta(input.next());

        setData(date);
    }
}
