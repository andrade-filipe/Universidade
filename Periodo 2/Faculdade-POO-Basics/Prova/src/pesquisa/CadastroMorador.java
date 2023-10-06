package pesquisa;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroMorador extends Morador {

    ArrayList<String> moradorLista = new ArrayList<String>();

    public CadastroMorador(String nome, String bloco, String apartamento) {
        super(nome, bloco, apartamento);
    }

    public void cadastroMorador() {

        /* Salvar informações do morador*/
        Scanner input = new Scanner(System.in);

        /* Construtor */
        Morador morador = new Morador(getNome(), getBloco(), getApartamento());

        System.out.println("Digite seu Nome:");
        morador.setNome(input.next());
        moradorLista.add(morador.getNome());

        System.out.println("Digite seu Bloco:");
        morador.setBloco(input.next());
        moradorLista.add(morador.getBloco());

        System.out.println("Digite o número do seu Apartamento:");
        morador.setApartamento(input.next());
        moradorLista.add(morador.getApartamento());
    }
}

