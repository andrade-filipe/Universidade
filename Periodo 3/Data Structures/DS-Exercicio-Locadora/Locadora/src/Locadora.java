public class Locadora {
    private Disco[] discos;
    private Filme[] filmes;
    private int indiceD = 0;
    private int indiceF = 0;

    // Construtor padrão
    public Locadora() {
        this.indiceD = 0;
        this.indiceF = 0;
        discos = new Disco[2];
        filmes = new Filme[2];
    }

    // Método novoDisco
    public void novoDisco(Disco disco) {
        if (indiceD < 2) {
            discos[indiceD++] = disco;
        }
    }

    // Método novoFilme
    public void novoFilme(Filme filme) {
        if (indiceF < 2) {
            filmes[indiceF++] = filme;
        }
    }

    // Método ListarDiscos
    public void ListarDiscos() {
        for (int i = 0; i < indiceD; i++) {
            System.out.println("Informações do Disco " + (i + 1));
            System.out.println("-----------------------------------------");
            discos[i].listaInformacoes();
            System.out.println("");
        }
    }

    // Método ListarFilmes
    public void ListarFilmes() {
        for (int i = 0; i < indiceF; i++) {
            System.out.println("Informações do Filme " + (i + 1));
            System.out.println("-----------------------------------------");
            filmes[i].listaInformacoes();
            System.out.println("");
        }
    }
}
