/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.dac.jpa;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Aluísio
 */
@Entity
@Table(name = "aluno", catalog = "dac-jpa", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Aluno_1.findAll", query = "SELECT a FROM Aluno_1 a"),
    @NamedQuery(name = "Aluno_1.findById", query = "SELECT a FROM Aluno_1 a WHERE a.id = :id"),
    @NamedQuery(name = "Aluno_1.findByNome", query = "SELECT a FROM Aluno_1 a WHERE a.nome = :nome"),
    @NamedQuery(name = "Aluno_1.findByRg", query = "SELECT a FROM Aluno_1 a WHERE a.rg = :rg")})
public class Aluno_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Lob
    @Column(name = "copiadocumentos")
    private byte[] copiadocumentos;
    @Column(name = "nome")
    private String nome;
    @Column(name = "rg")
    private String rg;

    public Aluno_1() {
    }

    public Aluno_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public byte[] getCopiadocumentos() {
        return copiadocumentos;
    }

    public void setCopiadocumentos(byte[] copiadocumentos) {
        byte[] oldCopiadocumentos = this.copiadocumentos;
        this.copiadocumentos = copiadocumentos;
        changeSupport.firePropertyChange("copiadocumentos", oldCopiadocumentos, copiadocumentos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno_1)) {
            return false;
        }
        Aluno_1 other = (Aluno_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ads.dac.jpa.Aluno_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
