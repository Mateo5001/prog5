/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mateo
 */
@Entity
@Table(name = "pedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p"),
    @NamedQuery(name = "Pedidos.findByIdpedidos", query = "SELECT p FROM Pedidos p WHERE p.idpedidos = :idpedidos"),
    @NamedQuery(name = "Pedidos.findByMesa", query = "SELECT p FROM Pedidos p WHERE p.mesa = :mesa"),
    @NamedQuery(name = "Pedidos.findByValorTotal", query = "SELECT p FROM Pedidos p WHERE p.valorTotal = :valorTotal")})
public class Pedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpedidos")
    private Integer idpedidos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "mesa")
    private String mesa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorTotal")
    private long valorTotal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPedido")
    private Collection<Pedidodetalle> pedidodetalleCollection;
    @JoinColumn(name = "idChef", referencedColumnName = "idusuarios")
    @ManyToOne(optional = false)
    private Usuarios idChef;

    public Pedidos() {
    }

    public Pedidos(Integer idpedidos) {
        this.idpedidos = idpedidos;
    }

    public Pedidos(Integer idpedidos, String mesa, long valorTotal) {
        this.idpedidos = idpedidos;
        this.mesa = mesa;
        this.valorTotal = valorTotal;
    }

    public Integer getIdpedidos() {
        return idpedidos;
    }

    public void setIdpedidos(Integer idpedidos) {
        this.idpedidos = idpedidos;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public long getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(long valorTotal) {
        this.valorTotal = valorTotal;
    }

    @XmlTransient
    public Collection<Pedidodetalle> getPedidodetalleCollection() {
        return pedidodetalleCollection;
    }

    public void setPedidodetalleCollection(Collection<Pedidodetalle> pedidodetalleCollection) {
        this.pedidodetalleCollection = pedidodetalleCollection;
    }

    public Usuarios getIdChef() {
        return idChef;
    }

    public void setIdChef(Usuarios idChef) {
        this.idChef = idChef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpedidos != null ? idpedidos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.idpedidos == null && other.idpedidos != null) || (this.idpedidos != null && !this.idpedidos.equals(other.idpedidos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Pedidos[ idpedidos=" + idpedidos + " ]";
    }
    
}
