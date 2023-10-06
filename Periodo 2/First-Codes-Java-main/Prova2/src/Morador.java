public class Morador {
    private String nome;
    private String bloco;
    private String apartamento;

    public Morador(String nome, String bloco, String apartamento) {
        this.nome = nome;
        this.bloco = bloco;
        this.apartamento = apartamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }
}
