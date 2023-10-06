import java.util.Date;

public class Gato extends Pet{
    /*SuperClasse de Pets com todos os gets e set e contrutores de Gato*/
    private boolean domesticado;

    public Gato() {
    }

    public Gato(int id_Pet,
                String nome_Pet,
                String apelido_Pet,
                String sexo_Pet,
                Date data_Entrada,
                String idade_Pet,
                String racao_Pet,
                int racao_Quantd_Gramas,
                int peso_Pet,
                boolean domesticado) {
        super(id_Pet,
                nome_Pet,
                apelido_Pet,
                sexo_Pet,
                data_Entrada,
                idade_Pet,
                racao_Pet,
                racao_Quantd_Gramas,
                peso_Pet);
        this.domesticado = domesticado;
    }

    public boolean isDomesticado() {
        return domesticado;
    }

    public void setDomesticado(boolean domesticado) {
        this.domesticado = domesticado;
    }
}
