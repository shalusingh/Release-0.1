package com.onlinemarketplace.dataentity.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.onlinemarketplace.dataentity.base.StateFullNaturalEntity;
import com.onlinemarketplace.dataentity.enums.CartStatus;

/**
 * @author jitu
 */
@Entity
@Table(name = "cart")
public class Cart
    extends StateFullNaturalEntity<CartStatus, Long>
    implements Serializable {

    private static final long serialVersionUID = 7624603918358082451L;

    @Column(nullable = false)
    private Long customerId;

    @Column(nullable = false, length = 150)
    private String jSessionId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cart", cascade = CascadeType.ALL)
    private List<CartItem> items;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getjSessionId() {
        return jSessionId;
    }

    public void setjSessionId(String jSessionId) {
        this.jSessionId = jSessionId;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime
            * result
            + ((customerId == null)
                ? 0 : customerId.hashCode());
        result = prime
            * result
            + ((items == null)
                ? 0 : items.hashCode());
        result = prime
            * result
            + ((jSessionId == null)
                ? 0 : jSessionId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cart other = (Cart) obj;
        if (customerId == null) {
            if (other.customerId != null)
                return false;
        } else
            if (!customerId.equals(other.customerId))
                return false;
        if (items == null) {
            if (other.items != null)
                return false;
        } else
            if (!items.equals(other.items))
                return false;
        if (jSessionId == null) {
            if (other.jSessionId != null)
                return false;
        } else
            if (!jSessionId.equals(other.jSessionId))
                return false;
        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.onlinemarketplace.dataentity.base.StateFullNaturalEntity#getStatus()
     */
    @Override
    public CartStatus getStatus() {
        // TODO Auto-generated method stub
        return super.status;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.onlinemarketplace.dataentity.base.StateFullNaturalEntity#setStatus(java.lang.Object)
     */
    @Override
    public void setStatus(CartStatus status) {
        super.status = status;
    }

}
