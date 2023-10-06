import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
public class Menu {
    /* Arrays necessários*/
    ArrayList<String> moradorNomeLista = new ArrayList<String>();
    ArrayList<String> moradorBlocoLista = new ArrayList<String>();
    ArrayList<String> moradorApLista = new ArrayList<String>();
    ArrayList<Integer> idLista = new ArrayList<Integer>();
    ArrayList<String>  perguntaLista= new ArrayList<String>();
    public void menu(){
        Scanner input = new Scanner(System.in);
        int escolha;

        System.out.println("""
                           1. cadastro de moradores \n
                           2. consulta de moradores \n
                           3. cadastro de perguntas \n
                           4. consulta de perguntas \n
                           5. responder pesquisa \n
                           6. resultados da pesquisa""");

        escolha = input.nextInt();

        switch(escolha){
            case 1 -> {
                cadastroMorador();
                menu();
            }
            case 2 ->{
                int i = 0;
                while (i < moradorNomeLista.size()) {
                    System.out.print("\n" +
                            "Morador:" + i + "\n" +
                            "Nome:" + moradorNomeLista.get(i) + "\n" +
                            "Bloco:" + moradorBlocoLista.get(i) + "\n" +
                            "Apartamento:" + moradorApLista.get(i) + "\n"
                            );
                    i++;
                }
                menu();
            }
            case 3 ->{
                cadastroPergunta();
                menu();
            }
            case 4 ->{
                int i = 0;
                while (i < idLista.size() ) {
                    System.out.println(
                            "Id:" + idLista.get(i) + "\n" +
                            "Pergunta:" + perguntaLista.get(i) + "\n");
                    i++;
                }
                menu();
            }
            case 5 ->{
                registroPesquisa();
                menu();
            }
            case 6 ->{
                printPesquisa();
                menu();
            }
            default->{
                System.out.println("numero inválido");
                menu();
            }
        }
    }


    public void cadastroMorador() {

        /* Salvar informações do morador*/
        Scanner input = new Scanner(System.in);

        /* Construtor */
        Morador morador = new Morador(" ", " "," ");

        System.out.println("Digite seu Nome:");
        morador.setNome(input.next().toLowerCase().trim());
        moradorNomeLista.add(morador.getNome());

        System.out.println("Digite seu Bloco:");
        morador.setBloco(input.next().toLowerCase().trim());
        moradorBlocoLista.add(morador.getBloco());

        System.out.println("Digite o número do seu Apartamento:");
        morador.setApartamento(input.next().toLowerCase().trim());
        moradorApLista.add(morador.getApartamento());

    }
    public void cadastroPergunta() {
        /*scanner input*/
        Scanner input = new Scanner(System.in);

        int quantPergunta;
        int setId = 0;

        System.out.println("digite a quantidade de perguntas da pesquisa:");
        quantPergunta = input.nextInt();

        while (setId <= quantPergunta - 1) {
            Perguntas pergunta = new Perguntas(setId, " ");

            System.out.println("digite sua pergunta:");
            pergunta.setPergunta(input.next().toLowerCase().trim());
            perguntaLista.add(pergunta.getPergunta());

            pergunta.setId(setId);
            idLista.add(pergunta.getId());
            setId++;
        }
    }
    public void registroPesquisa() {
        Scanner input = new Scanner(System.in);
        Date data = new Date();

        System.out.println("Digite seu Nome:");
        String nome = input.next().toLowerCase().trim();

        if (moradorNomeLista.contains(nome)){
            System.out.println("Digite seu Bloco:");
            String bloco = input.next().toLowerCase().trim();

            if (moradorBlocoLista.contains(bloco)){
                System.out.println("Digite o seu apartamento:");
                String apartamento = input.next().toLowerCase().trim();

                if (moradorApLista.contains(apartamento)){
                    Registro registro = new Registro(nome,bloco,apartamento," ", data);

                    int i = 0;

                    while (i < perguntaLista.size()) {
                        System.out.println(perguntaLista.get(i));
                        registro.setResposta(input.next().toLowerCase().trim());
                        i++;
                    }
                }
            }
        }
    }
    public void printPesquisa(){
        int i = 0;
        while (i < moradorNomeLista.size()){
            Registro resultado = new Registro(
                    moradorNomeLista.get(i),
                    moradorBlocoLista.get(i),
                    moradorApLista.get(i),
                    Registro.getResposta(),
                    Registro.getData());

            System.out.println(
                    "Nome do Morador:" + moradorNomeLista.get(i) + "\n" +
                    "Bloco:" + moradorBlocoLista.get(i) + "\n" +
                    "Apartamento:" + moradorApLista.get(i) + "\n" +
                            "data: " + Registro.getData() + "\n");
            int k = 0;
            while (k < perguntaLista.size()) {
                System.out.print("Pergunta:" + perguntaLista.get(k) + "\n" +
                                 "Resposta:" + resultado.respostaLista.get(k) + "\n");
                k++;
            }
            i++;
        }
    }
}

