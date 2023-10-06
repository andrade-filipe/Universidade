package pesquisa;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPergunta extends Perguntas{
     ArrayList<Integer> idLista = new ArrayList<Integer>();
     ArrayList<String>  perguntaLista= new ArrayList<String>();
    
    public CadastroPergunta(Integer id, String pergunta) {
        super(id, pergunta);
    }
    
    public void cadastroPergunta() {
        /*scanner input*/
        Scanner input = new Scanner(System.in);

        int quantPergunta;
        int x = 0;

        System.out.println("digite a quantidade de perguntas: \n");
        quantPergunta = input.nextInt();

        while (x <= quantPergunta) {

            CadastroPergunta pergunta = new CadastroPergunta(x, getPergunta());

            System.out.println("digite sua pergunta: \n");
            pergunta.setPergunta(input.next());
            perguntaLista.add(pergunta.getPergunta());

            pergunta.setId(x);
            idLista.add(pergunta.getId());
            x++;
        }
    }
}

