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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mateo
 */
@Entity
@Table(name = "pedidodetalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidodetalle.findAll", query = "SELECT p FROM Pedidodetalle p"),
    @NamedQuery(name = "Pedidodetalle.findByIdpedidoDetalle", query = "SELECT p FROM Pedidodetalle p WHERE p.idpedidoDetalle = :idpedidoDetalle")})
public class Pedidodetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpedidoDetalle")
    private Integer idpedidoDetalle;
    @JoinColumn(name = "idPedido", referencedColumnName = "idpedidos")
    @ManyToOne(optional = false)
    private Pedidos idPedido;
    @JoinColumn(name = "idProducto", referencedColumnName = "idproductos")
    @ManyToOne(optional = false)
    private Productos idProducto;

    public Pedidodetalle() {
    }

    public Pedidodetalle(Integer idpedidoDetalle) {
        this.idpedidoDetalle = idpedidoDetalle;
    }

    public Integer getIdpedidoDetalle() {
        return idpedidoDetalle;
    }

    public void setIdpedidoDetalle(Integer idpedidoDetalle) {
        this.idpedidoDetalle = idpedidoDetalle;
    }

    public Pedidos getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedidos idPedido) {
        this.idPedido = idPedido;
    }

    public Productos getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Productos idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpedidoDetalle != null ? idpedidoDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidodetalle)) {
            return false;
        }
        Pedidodetalle other = (Pedidodetalle) object;
        if ((this.idpedidoDetalle == null && other.idpedidoDetalle != null) || (this.idpedidoDetalle != null && !this.idpedidoDetalle.equals(other.idpedidoDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Pedidodetalle[ idpedidoDetalle=" + idpedidoDetalle + " ]";
    }
    
}
