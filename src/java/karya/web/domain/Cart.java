/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karya.web.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sushil
 */
@Entity
@Table(name = "cart")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cart.findAll", query = "SELECT c FROM Cart c"),
    @NamedQuery(name = "Cart.findById", query = "SELECT c FROM Cart c WHERE c.id = :id"),
    @NamedQuery(name = "Cart.findByUsersId", query = "SELECT c FROM Cart c WHERE c.usersId = :usersId"),
    @NamedQuery(name = "Cart.findByItemsId", query = "SELECT c FROM Cart c WHERE c.itemsId = :itemsId"),
    @NamedQuery(name = "Cart.findByIsOrdered", query = "SELECT c FROM Cart c WHERE c.isOrdered = :isOrdered")})
public class Cart implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "users_id")
    private int usersId;
    @Basic(optional = false)
    @Column(name = "items_id")
    private int itemsId;
    @Basic(optional = false)
    @Column(name = "is_ordered")
    private int isOrdered;

    public Cart() {
    }

    public Cart(Integer id) {
        this.id = id;
    }

    public Cart(Integer id, int usersId, int itemsId, int isOrdered) {
        this.id = id;
        this.usersId = usersId;
        this.itemsId = itemsId;
        this.isOrdered = isOrdered;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    public int getItemsId() {
        return itemsId;
    }

    public void setItemsId(int itemsId) {
        this.itemsId = itemsId;
    }

    public int getIsOrdered() {
        return isOrdered;
    }

    public void setIsOrdered(int isOrdered) {
        this.isOrdered = isOrdered;
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
        if (!(object instanceof Cart)) {
            return false;
        }
        Cart other = (Cart) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "karya.web.domain.Cart[ id=" + id + " ]";
    }
    
}
