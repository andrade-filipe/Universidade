package pesquisa;

import java.util.Date;
import java.util.Scanner;

public class Menu {

    public void menu(){
        Scanner input = new Scanner(System.in);
        int escolha;

        System.out.println("""
                           1- cadastro de moradores \n 
                           2- consulta de moradores \n 
                           3- cadastro de perguntas \n 
                           4 consulta de perguntas \n 
                           5- responder pesquisa \n """);

        escolha = input.nextInt();

        switch(escolha){
            case 1 -> {
                CadastroMorador cadastroM = new CadastroMorador(getNome(),getBloco(),getApartamento());
                cadastroM.cadastroMorador();
                menu();
            }
            case 2 ->{
                System.out.println(moradorInfo());
                menu();
            }
            case 3 ->{
                CadastroPergunta cadastroP = new CadastroPergunta(0,Perguntas.getPergunta());
                cadastroP.cadastroPergunta();
                menu();
            }
            case 4 ->{
                toString();
                menu();
            }
            case 5 ->{
                registroPesquisa();
                menu();
            }
            default->{
            }
        }
    }
}
