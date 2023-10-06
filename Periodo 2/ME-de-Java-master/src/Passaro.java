import java.util.Date;

public class Passaro extends Pet{
    /*SuperClasse de Pets com todos os gets e set e contrutores de Pássaro*/
    private boolean asa_Cortada;

    public Passaro() {
    }

    public Passaro(int id_Pet,
                   String nome_Pet,
                   String apelido_Pet,
                   String sexo_Pet,
                   Date data_Entrada,
                   String idade_Pet,
                   String racao_Pet,
                   int racao_Quantd_Gramas,
                   int peso_Pet,
                   boolean asa_Cortada) {
        super(id_Pet,
                nome_Pet,
                apelido_Pet,
                sexo_Pet,
                data_Entrada,
                idade_Pet,
                racao_Pet,
                racao_Quantd_Gramas,
                peso_Pet);
        this.asa_Cortada = asa_Cortada;
    }

    public boolean isAsa_Cortada() {
        return asa_Cortada;
    }

    public void setAsa_Cortada(boolean asa_Cortada) {
        this.asa_Cortada = asa_Cortada;
    }
}
