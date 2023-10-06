import java.util.Date;

public class Cachorro extends Pet{
    /*SuperClasse de Pets com todos os gets e set e contrutores de Cachorro*/
    private String pelo;

    public Cachorro() {
    }

    public Cachorro(int id_Pet,
                    String nome_Pet,
                    String apelido_Pet,
                    String sexo_Pet,
                    Date data_Entrada,
                    String idade_Pet,
                    String racao_Pet,
                    int racao_Quantd_Gramas,
                    int peso_Pet,
                    String pelo) {
        super(id_Pet,
                nome_Pet,
                apelido_Pet,
                sexo_Pet,
                data_Entrada,
                idade_Pet,
                racao_Pet,
                racao_Quantd_Gramas,
                peso_Pet);
        this.pelo = pelo;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
}
