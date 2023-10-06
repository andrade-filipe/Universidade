import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Principal {
	
	static ArrayList<Morador> listaMorador = new ArrayList<Morador>();
	static ArrayList<PerguntasPesquisa> listaPerguntasPesquisa = new ArrayList<PerguntasPesquisa>();
	static ArrayList<RegistroPesquisa> listaRegistroPesquisa = new ArrayList<RegistroPesquisa>();
	

	public static void main(String[] args) {
		
		String opcao = "";
		while (!opcao.equals("N")) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("1. Cadastrar morador \n"
					+ "2. Consultar morador \n"
					+ "3. Cadastrar perguntas pesquisa \n" 
					+ "4. Consultar perguntas pesquisa \n"
					+ "5. Registro pesquisa");
			opcao = entrada.next();
			if (opcao.equals("1")) {
				cadastrarMorador();
			} else {
				if (opcao.equals("2")) {
					consultarMorador();
				} else {
					if (opcao.endsWith("3")) {
						cadastrarPerguntasPesquisa();
					} else {
						if (opcao.equals("4")) {
							consultarPerguntaPesquisa();
						}
						else {
							if(opcao.equals("5")) {
								cadastrarPesquisa();
							} else {
								if (opcao.equals("N")) {
									break;
								} else {
									System.out.println("Opção inválida!");
								}
							}
								
						}		
					}
				}
			}
			System.out.println("Deseja continuar? [S/N]");
			opcao = entrada.next();
		}
	}
	
	public static void cadastrarMorador() {
		Morador morador = new Morador();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nome: ");
		String nome = entrada.next();
		morador.setNome(nome);
		entrada = new Scanner(System.in);
		System.out.println("Bloco: ");
		String bloco = entrada.next();
		morador.setBloco(bloco);
		entrada = new Scanner(System.in);
		System.out.println("Apartamento: ");
		int apartamento = entrada.nextInt();
		morador.setApartamento(apartamento);
		listaMorador.add(morador);
	}
	
	public static void consultarMorador() {
		for (Morador morador : listaMorador) {
			System.out.println("Morador: " + morador.getNome());
			System.out.println("Bloco: " + morador.getBloco());
			System.out.println("Apartamento: " + morador.getApartamento());
		}
	}
	
	public static void cadastrarPerguntasPesquisa() {
		PerguntasPesquisa perguntaPesquisa = new PerguntasPesquisa();
		Scanner entrada = new Scanner(System.in);
		System.out.println("ID: ");
		int id = entrada.nextInt();
		perguntaPesquisa.setId(id);
		entrada = new Scanner(System.in);
		System.out.println("Pergunta: ");
		String pergunta = entrada.nextLine();
		perguntaPesquisa.setPergunta(pergunta);
		listaPerguntasPesquisa.add(perguntaPesquisa);
	}
	
	public static void consultarPerguntaPesquisa() {
		for (PerguntasPesquisa perguntaPesquisa : listaPerguntasPesquisa) {
			System.out.println("ID: " + perguntaPesquisa.getId());
			System.out.println("Pergunta: " + perguntaPesquisa.getPergunta());
		}
	}
	
	public static void cadastrarPesquisa() {
		RegistroPesquisa registroPesquisa = new RegistroPesquisa();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bloco: ");
		String bloco = entrada.next();
		registroPesquisa.setBloco(bloco);
		entrada = new Scanner(System.in);
		System.out.println("Apartamento: ");
		int apartamento = entrada.nextInt();
		registroPesquisa.setApartamento(apartamento);
		Date date = new Date(System.currentTimeMillis());
		registroPesquisa.setDataEntrevista(date);
		ArrayList<String> respostas = new ArrayList<String>();
		for (PerguntasPesquisa perguntaPesquisa: listaPerguntasPesquisa) {
			entrada = new Scanner(System.in);
			System.out.println(perguntaPesquisa.getId() + ". " + perguntaPesquisa.getPergunta());
			String resposta = entrada.next();
			respostas.add(resposta);
		}
		registroPesquisa.setListaRespostasPesquisa(respostas);
		listaRegistroPesquisa.add(registroPesquisa);
	}
	

}
