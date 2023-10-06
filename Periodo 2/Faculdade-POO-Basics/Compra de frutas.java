import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		System.out.println("Quantidade de maçãs: ");
		Scanner entrada = new Scanner(System.in);
		int qtd = entrada.nextInt();
		
		float valor = 0;
		
		if (qtd < 12 & qtd > 0) {
			valor = (float) (qtd * 0.30);
		} else {
			if (qtd > 12) {
				valor = (float) (qtd * 0.25);
			}
		}
		
		System.out.println("Valor pago: R$" + valor);
	}

}
