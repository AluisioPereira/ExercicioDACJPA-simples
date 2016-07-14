/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.dac.jpa;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Convert;
import javax.persistence.ElementCollection;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Aluísio
 */
public class ClasseComAnotacoes {

    @Transient
    private int idade;

    @Temporal(TemporalType.DATE)
    @Convert(converter = LocalDateConverte.class)
    private LocalDate dataDeNacimento;

    @Temporal(TemporalType.DATE)
    private LocalDate horarioDoNacimento;

    @Enumerated
    private TypeSexo sexo = TypeSexo.femino;

    @Lob
    @Basic(fetch = FetchType.EAGER)
    private byte[] arquivoPDF;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String textoGrande;

    @Basic(optional = false)
    private String rg;

    @ElementCollection
    private List<String> emails;

}
