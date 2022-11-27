package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("T")
public class Tecnico extends Colaborador{

    private String coren;
    private boolean diarista;
    private String sexo;

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public boolean isDiarista() {
        return diarista;
    }

    public void setDiarista(boolean diarista) {
        this.diarista = diarista;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
