public class Disco extends Item{
    private String artista_Disco;
    private int quantidade_Faixas;
    private String midia;

    @Override
    public void listaInformacoes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista_Disco());
        System.out.println("Comentário: " + getComentario());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.println("Quantidade de faixas: " + getQuantidade_Faixas());
        System.out.println("Mídia: " + getMidia());
    }

    public Disco() {}

    public Disco(String titulo,
                 int anoLancamento,
                 String comentario,
                 String artista_Disco,
                 int quantidade_Faixas,
                 String midia) {
        super(titulo, anoLancamento, comentario);
        this.artista_Disco = artista_Disco;
        this.quantidade_Faixas = quantidade_Faixas;
        this.midia = midia;
    }

    public String getArtista_Disco() {
        return artista_Disco;
    }

    public void setArtista_Disco(String artista_Disco) {
        this.artista_Disco = artista_Disco;
    }

    public int getQuantidade_Faixas() {
        return quantidade_Faixas;
    }

    public void setQuantidade_Faixas(int quantidade_Faixas) {
        this.quantidade_Faixas = quantidade_Faixas;
    }

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }
}
