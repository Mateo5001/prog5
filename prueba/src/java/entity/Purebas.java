/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mateo
 */
@Entity
@Table(name = "purebas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Purebas.findAll", query = "SELECT p FROM Purebas p"),
    @NamedQuery(name = "Purebas.findByIdpurebas", query = "SELECT p FROM Purebas p WHERE p.idpurebas = :idpurebas"),
    @NamedQuery(name = "Purebas.findByDato", query = "SELECT p FROM Purebas p WHERE p.dato = :dato")})
public class Purebas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpurebas")
    private Integer idpurebas;
    @Size(max = 45)
    @Column(name = "dato")
    private String dato;

    public Purebas() {
    }

    public Purebas(Integer idpurebas) {
        this.idpurebas = idpurebas;
    }

    public Integer getIdpurebas() {
        return idpurebas;
    }

    public void setIdpurebas(Integer idpurebas) {
        this.idpurebas = idpurebas;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpurebas != null ? idpurebas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Purebas)) {
            return false;
        }
        Purebas other = (Purebas) object;
        if ((this.idpurebas == null && other.idpurebas != null) || (this.idpurebas != null && !this.idpurebas.equals(other.idpurebas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Purebas[ idpurebas=" + idpurebas + " ]";
    }
    
}
