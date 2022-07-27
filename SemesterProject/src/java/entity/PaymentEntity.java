/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jacks
 */
@Entity
@Table(name = "PAYMENT")
@NamedQueries({
    @NamedQuery(name = "PaymentEntity.findAll", query = "SELECT p FROM PaymentEntity p"),
    @NamedQuery(name = "PaymentEntity.findByPayID", query = "SELECT p FROM PaymentEntity p WHERE p.payID = :payID"),
    @NamedQuery(name = "PaymentEntity.findByPrice", query = "SELECT p FROM PaymentEntity p WHERE p.price = :price"),
    @NamedQuery(name = "PaymentEntity.findByPayDate", query = "SELECT p FROM PaymentEntity p WHERE p.payDate = :payDate"),
    @NamedQuery(name = "PaymentEntity.findByCreditCardNumber", query = "SELECT p FROM PaymentEntity p WHERE p.creditCardNumber = :creditCardNumber")})

public class PaymentEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAYID")
    private Integer payID;
    
    @Column(name = "PRICE")
    private Double price;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAYDATE")
    @Temporal(TemporalType.DATE)
    private Date payDate;
    
    @Size(max = 16)
    @Column(name = "CREDITCARDNUMBER")
    private String creditCardNumber;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "payID")
    private Collection<TicketEntity> ticketCollection;

    public PaymentEntity() {}
    
    public PaymentEntity(Integer payID) {
        this.payID = payID;
    }
    
    public PaymentEntity(Integer payID, Date payDate) {
        this.payID = payID;
        this.payDate = payDate;
    }

    public Integer getPayID() {
        return payID;
    }

    public void setPayID(Integer payID) {
        this.payID = payID;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public Collection<TicketEntity> getTicketCollection() {
        return ticketCollection;
    }

    public void setTicketCollection(Collection<TicketEntity> ticketCollection) {
        this.ticketCollection = ticketCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (payID != null ? payID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentEntity)) {
            return false;
        }
        PaymentEntity other = (PaymentEntity) object;
        if ((this.payID == null && other.payID != null) || (this.payID != null && !this.payID.equals(other.payID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PaymentEntity[ payID=" + payID + " ]";
    }
}
