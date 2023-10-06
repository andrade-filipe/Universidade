import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        /*Instanciando a classe genérica Vetor e nesse momento informando
		que ela é do tipo Aluno*/
        Vetor<Aluno> vetor = new Vetor<Aluno>(2);

        //Instanciando um aluno
        Aluno aluno = new Aluno("ANA", 30);
        Aluno aluno2 = new Aluno("MARIA", 35);

        //Adicionando o aluno no vetor pelo iterador
        vetor.adicionarIterator(aluno);
        vetor.adicionarIterator(aluno2);

        //imprimindo os dados do aluno
        System.out.println("-ADICIONANDO ALUNOS EM ORDEM NORMAL-");
        System.out.println("Nome: "  + vetor.imprime(0).getName());
        System.out.println("Idade: " + vetor.imprime(0).getAge());

        System.out.println("Nome: "  + vetor.imprime(1).getName());
        System.out.println("Idade: " + vetor.imprime(1).getAge());

        //testando limpar
        System.out.println("-LIMPEZA DO VETOR1-");
        //confere se os alunos estão na memória
        vetor.conferirRemove(vetor);
        //limpa
        vetor.limpar();
        System.out.println("---------------------------");
        //confere se os alunos sairam da memória
        vetor.conferirRemove(vetor);
        System.out.println("---------------------------");

        //abrindo outro vetor
        Vetor<Aluno> vetor2 = new Vetor<Aluno>(2);

        //Instanciando um aluno
        Aluno aluno3 = new Aluno("JOÃO", 20);
        Aluno aluno4 = new Aluno("FILIPE", 21);

        //teste de adição pelos métodos e trocando a ordem
        vetor2.adicionarInicio(aluno4);
        vetor2.adicionarFim(aluno3);

        System.out.println("-ADICIONANDO ALUNOS EM ORDEM TROCADA-");
        System.out.println("Nome: "  + vetor2.imprime(0).getName());
        System.out.println("Idade: " + vetor2.imprime(0).getAge());

        System.out.println("Nome: "  + vetor2.imprime(1).getName());
        System.out.println("Idade: " + vetor2.imprime(1).getAge());

        //testando remoção
        System.out.println("-LIMPEZA DO VETOR 2-");
        //confere se estão na memória
        vetor2.conferirRemove(vetor2);
        //remove
        vetor2.removerInicio();
        vetor2.removerFim();
        System.out.println("---------------------------");
        //confere se sairam da memória
        vetor2.conferirRemove(vetor2);
        System.out.println("---------------------------");

        //abrindo outro vetor
        Vetor<Aluno> vetor3 = new Vetor<Aluno>(2);

        Aluno alunoR = new Aluno("ANA", 30);
        Aluno alunoR2 = new Aluno("MARIA", 35);
        Aluno alunoR3 = new Aluno("JOÃO", 20);
        Aluno alunoR4 = new Aluno("FILIPE", 21);

        //testando redimencionar
        vetor3.adicionarIterator(alunoR);
        vetor3.adicionarIterator(alunoR2);
        vetor3.adicionarIterator(alunoR3);
        vetor3.adicionarIterator(alunoR4);

        System.out.println("-TESTANDO REDIMENCIONAR-");
        System.out.println("Nome: "  + vetor3.imprime(0).getName());
        System.out.println("Idade: " + vetor3.imprime(0).getAge());

        System.out.println("Nome: "  + vetor3.imprime(1).getName());
        System.out.println("Idade: " + vetor3.imprime(1).getAge());

        System.out.println("Nome: "  + vetor3.imprime(2).getName());
        System.out.println("Idade: " + vetor3.imprime(2).getAge());

        System.out.println("Nome: "  + vetor3.imprime(3).getName());
        System.out.println("Idade: " + vetor3.imprime(3).getAge());

        //aluno especial
        Aluno alunoEspecial = new Aluno("Especial", 35);

        //testando adicionar em posição especifica
        vetor3.adicionar(alunoEspecial, 2);

        System.out.println("-TESTANDO ADICIONAR EM POSIÇÃO ESPECIFICA-");
        System.out.println("Nome: "  + vetor3.imprime(2).getName());
        System.out.println("Idade: " + vetor3.imprime(2).getAge());

        System.out.println("Nome: "  + vetor3.imprime(3).getName());
        System.out.println("Idade: " + vetor3.imprime(3).getAge());

        System.out.println("Nome: "  + vetor3.imprime(4).getName());
        System.out.println("Idade: " + vetor3.imprime(4).getAge());

        //CONFERE SE TEM 5 ALUNOS
        System.out.println("-CONFERE O VETOR 3-");
        vetor3.conferirRemove(vetor3);
        System.out.println("---------------------------");
    }
}