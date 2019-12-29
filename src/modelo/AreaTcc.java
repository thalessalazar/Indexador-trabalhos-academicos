package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "area_tcc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AreaTcc.findAll", query = "SELECT a FROM AreaTcc a")})
public class AreaTcc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_areatcc")
    private Integer idAreatcc;
    @Column(name = "nome_areatcc")
    private String nomeAreatcc;
    @OneToMany(mappedBy = "idAreatcc")
    private Collection<Tcc> tccCollection;

    public AreaTcc() {
    }

    public AreaTcc(Integer idAreatcc) {
        this.idAreatcc = idAreatcc;
    }

    public Integer getIdAreatcc() {
        return idAreatcc;
    }

    public void setIdAreatcc(Integer idAreatcc) {
        this.idAreatcc = idAreatcc;
    }

    public String getNomeAreatcc() {
        return nomeAreatcc;
    }

    public void setNomeAreatcc(String nomeAreatcc) {
        this.nomeAreatcc = nomeAreatcc;
    }

    @XmlTransient
    public Collection<Tcc> getTccCollection() {
        return tccCollection;
    }

    public void setTccCollection(Collection<Tcc> tccCollection) {
        this.tccCollection = tccCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAreatcc != null ? idAreatcc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof AreaTcc)) {
            return false;
        }
        AreaTcc other = (AreaTcc) object;
        if ((this.idAreatcc == null && other.idAreatcc != null) || (this.idAreatcc != null && !this.idAreatcc.equals(other.idAreatcc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.AreaTcc[ idAreatcc=" + idAreatcc + " ]";
    }

}
