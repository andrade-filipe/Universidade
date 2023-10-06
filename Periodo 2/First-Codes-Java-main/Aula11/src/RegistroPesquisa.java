import java.util.ArrayList;
import java.util.Date;

public class RegistroPesquisa {
	private String bloco;
	private int apartamento; 
	static ArrayList<String> listaRespostasPesquisa;
	Date dataEntrevista;
	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	public int getApartamento() {
		return apartamento;
	}
	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}
	public static ArrayList<String> getListaRespostasPesquisa() {
		return listaRespostasPesquisa;
	}
	public static void setListaRespostasPesquisa(ArrayList<String> listaRespostasPesquisa) {
		RegistroPesquisa.listaRespostasPesquisa = listaRespostasPesquisa;
	}
	public Date getDataEntrevista() {
		return dataEntrevista;
	}
	public void setDataEntrevista(Date dataEntrevista) {
		this.dataEntrevista = dataEntrevista;
	}

	
}
