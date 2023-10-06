import java.util.Scanner;

public class Exercicio3 {
	
    public static void main(String[] args) {
        int sexo, qtMulheres=0, qtHomens=0;
        double altura, somaH=0, mediaHomens=0, maior=0, menor=99999;
        
        System.out.println("Nome: [SAIR] ");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.next();
		
		while (!nome.equals("SAIR")) {
            
			System.out.print("Escolha o sexo da pessoa (1-Mulher, 2-Homem): ");
            sexo = entrada.nextInt();
            
            System.out.print("Digite a altura: ");
            altura = entrada.nextDouble();
            
            if (sexo == 1) {
                qtMulheres++;
            } else if (sexo == 2) {
                qtHomens++;
                somaH = somaH + altura;
            } else {
                System.out.println("Opção de sexo inválido!");
            }
            
            if (altura > maior) {
                 maior = altura;
            } 
            if (altura < menor){
                menor = altura;
            }
            
            System.out.println("Nome: [SAIR] ");
			entrada = new Scanner(System.in);
			nome = entrada.next();
        }
		
        mediaHomens = somaH / qtHomens;
        System.out.println("A maior altura do grupo de " + maior + " m, e a menor de " + menor + " m");
        System.out.println("A média de altura dos homens " + mediaHomens + " m");
        System.out.println("O número de mulheres " + qtMulheres);
    }
}