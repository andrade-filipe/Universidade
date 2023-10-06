import java.util.Date;

public abstract class Item {
    public String titulo;
    public int anoLancamento;
    public String comentario;
    public abstract void listaInformacoes();

    public Item() {}

    public Item(String titulo, int anoLancamento, String comentario) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.comentario = comentario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
