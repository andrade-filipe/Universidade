import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Menu{
    public void cadastroCliente(){
        System.out.println("- Cadastro -");

        Scanner input = new Scanner(System.in);
        Cliente cliente = new Cliente(0,"","","","",0.0,false,false);

        System.out.println("Digite seu nome:");
        cliente.setNome(input.next());

        System.out.println("Conta Corrente[C] ou Conta Poupança[P]");
        String tipo = input.next();
        if (tipo.equalsIgnoreCase("C")) {
            cliente.setTipoConta(true);
            System.out.println("Corrente");
        } else {
            System.out.println("Poupança");
        }

        System.out.println("Pessoa Física[F] ou Pessoa Júridica[J]");
        String pessoa = input.next();
        if (pessoa.equalsIgnoreCase("F")){
            cliente.setPessoaConta(true);
            System.out.println("""
                                - Pessoa Física -
                                - Digite seu CPF:
                                """);
            cliente.setPessoa(input.next());
        }
        else {
            System.out.println("""
                               - Pessoa Júridica -
                               - Digite seu CNPJ:
                               """);
            cliente.setPessoa(input.next());
        }

        System.out.println("Digite seu Email:");
        cliente.setEmail(input.next());

        System.out.println("Digite sua Senha:");
        cliente.setSenha(input.next());

        /*Gerador de Conta com 7 digitos*/
        Random gerador = new Random();
        int conta = gerador.nextInt();

        if (999_999 < conta && conta < 10_000_000){
            cliente.setConta(conta);
            System.out.println("Esse é o número da sua conta:" + conta);
        }
    }
}