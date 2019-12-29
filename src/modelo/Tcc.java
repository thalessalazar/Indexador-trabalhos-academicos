package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "tcc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tcc.findAll", query = "SELECT t FROM Tcc t")
    , @NamedQuery(name = "Tcc.findByIdTcc", query = "SELECT t FROM Tcc t WHERE t.idTcc = :idTcc")
    , @NamedQuery(name = "Tcc.findByTituloTcc", query = "SELECT t FROM Tcc t WHERE t.tituloTcc = :tituloTcc")
    , @NamedQuery(name = "Tcc.findByAutorTcc", query = "SELECT t FROM Tcc t WHERE t.autorTcc = :autorTcc")
    , @NamedQuery(name = "Tcc.findByOrientadorTcc", query = "SELECT t FROM Tcc t WHERE t.orientadorTcc = :orientadorTcc")
    , @NamedQuery(name = "Tcc.findByAnoTcc", query = "SELECT t FROM Tcc t WHERE t.anoTcc = :anoTcc")
    , @NamedQuery(name = "Tcc.findBySemestreTcc", query = "SELECT t FROM Tcc t WHERE t.semestreTcc = :semestreTcc")
    , @NamedQuery(name = "Tcc.findByObservacoesTcc", query = "SELECT t FROM Tcc t WHERE t.observacoesTcc = :observacoesTcc")
    , @NamedQuery(name = "Tcc.findByPdfTcc", query = "SELECT t FROM Tcc t WHERE t.pdfTcc = :pdfTcc")})
public class Tcc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tcc")
    private Integer idTcc;
    @Basic(optional = false)
    @Column(name = "titulo_tcc")
    private String tituloTcc;
    @Column(name = "autor_tcc")
    private String autorTcc;
    @Column(name = "orientador_tcc")
    private String orientadorTcc;
    @Column(name = "ano_tcc")
    private Integer anoTcc;
    @Column(name = "semestre_tcc")
    private Integer semestreTcc;
    @Column(name = "observacoes_tcc")
    private String observacoesTcc;
    @Column(name = "pdf_tcc")
    private String pdfTcc;
    @JoinColumn(name = "id_areatcc", referencedColumnName = "id_areatcc")
    @ManyToOne
    private AreaTcc idAreatcc;
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
    @ManyToOne
    private Curso idCurso;

    public Tcc() {
    }

    public Tcc(Integer idTcc) {
        this.idTcc = idTcc;
    }

    public Tcc(Integer idTcc, String tituloTcc) {
        this.idTcc = idTcc;
        this.tituloTcc = tituloTcc;
    }

    public Integer getIdTcc() {
        return idTcc;
    }

    public void setIdTcc(Integer idTcc) {
        this.idTcc = idTcc;
    }

    public String getTituloTcc() {
        return tituloTcc;
    }

    public void setTituloTcc(String tituloTcc) {
        this.tituloTcc = tituloTcc;
    }

    public String getAutorTcc() {
        return autorTcc;
    }

    public void setAutorTcc(String autorTcc) {
        this.autorTcc = autorTcc;
    }

    public String getOrientadorTcc() {
        return orientadorTcc;
    }

    public void setOrientadorTcc(String orientadorTcc) {
        this.orientadorTcc = orientadorTcc;
    }

    public Integer getAnoTcc() {
        return anoTcc;
    }

    public void setAnoTcc(Integer anoTcc) {
        this.anoTcc = anoTcc;
    }

    public Integer getSemestreTcc() {
        return semestreTcc;
    }

    public void setSemestreTcc(Integer semestreTcc) {
        this.semestreTcc = semestreTcc;
    }

    public String getObservacoesTcc() {
        return observacoesTcc;
    }

    public void setObservacoesTcc(String observacoesTcc) {
        this.observacoesTcc = observacoesTcc;
    }

    public String getPdfTcc() {
        return pdfTcc;
    }

    public void setPdfTcc(String pdfTcc) {
        this.pdfTcc = pdfTcc;
    }

    public AreaTcc getIdAreatcc() {
        return idAreatcc;
    }

    public void setIdAreatcc(AreaTcc idAreatcc) {
        this.idAreatcc = idAreatcc;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTcc != null ? idTcc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Tcc)) {
            return false;
        }
        Tcc other = (Tcc) object;
        if ((this.idTcc == null && other.idTcc != null) || (this.idTcc != null && !this.idTcc.equals(other.idTcc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Tcc[ idTcc=" + idTcc + " ]";
    }
    
}
