package ads.dac.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/06/2016, 08:59:54
 */
@Entity
//@Table(name = "Aluno")
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] CopiaDocumentos;

    @Basic(optional = false)
    private String rg;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    public byte[] getCopiaDocumentos() {
        return CopiaDocumentos;
    }

    public void setCopiaDocumentos(byte[] CopiaDocumentos) {
        this.CopiaDocumentos = CopiaDocumentos;
    }

    public Aluno() {
    }

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Aluno(String nome) {

        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

}
