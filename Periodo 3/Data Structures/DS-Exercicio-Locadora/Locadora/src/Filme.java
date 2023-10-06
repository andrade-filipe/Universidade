public class Filme extends Item{
    private String nome_Diretor;
    private int duracao_Filme;
    private String genero;

    @Override
    public void listaInformacoes() {
        System.out.println("Título: " + super.getTitulo());
        System.out.println("Ano de lançamento: " + super.getAnoLancamento());
        System.out.println("Comentário: " + super.getComentario());
        System.out.println("Diretor: " + getNome_Diretor());
        System.out.println("Duração: " + getDuracao_Filme() + " min");
        System.out.println("Gênero: " + getGenero());
    }

    public Filme() {
    }

    public Filme(String titulo,
                 int anoLancamento,
                 String comentario,
                 String nome_Diretor,
                 int duracao_Filme,
                 String genero) {
        super(titulo, anoLancamento, comentario);
        this.nome_Diretor = nome_Diretor;
        this.duracao_Filme = duracao_Filme;
        this.genero = genero;
    }

    public String getNome_Diretor() {
        return nome_Diretor;
    }

    public void setNome_Diretor(String nome_Diretor) {
        this.nome_Diretor = nome_Diretor;
    }

    public int getDuracao_Filme() {
        return duracao_Filme;
    }

    public void setDuracao_Filme(int duracao_Filme) {
        this.duracao_Filme = duracao_Filme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
