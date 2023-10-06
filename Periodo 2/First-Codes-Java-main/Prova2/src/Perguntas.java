public class Perguntas {
    private int id;
    private static String pergunta;

    public Perguntas(int id, String pergunta) {
        this.id = id;
        this.pergunta = pergunta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
}
