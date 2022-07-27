/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jacks
 */
@Entity
@Table(name = "TICKET")
@NamedQueries({
    @NamedQuery(name = "TicketEntity.findAll", query = "SELECT t FROM TicketEntity t"),
    @NamedQuery(name = "TicketEntity.findByTicketID", query = "SELECT t FROM TicketEntity t WHERE t.ticketID = :ticketID"),
    @NamedQuery(name = "TicketEntity.findBySalesDate", query = "SELECT t FROM TicketEntity t WHERE t.salesDate = :salesDate"),
    @NamedQuery(name = "TicketEntity.findByTicketsSold", query = "SELECT t FROM TicketEntity t WHERE t.ticketsSold = :ticketsSold")})

public class TicketEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TICKETID")
    private Integer ticketID;
    
    @Column(name = "SALESDATE")
    @Temporal(TemporalType.DATE)
    private Date salesDate;
    
    @Column(name = "TICKETSSOLD")
    private Integer ticketsSold;
    
    @JoinColumn(name = "MOVIEID", referencedColumnName = "MOVIEID")
    @ManyToOne(optional = false)
    private MovieEntity movieID;
    
    @JoinColumn(name = "PAYID", referencedColumnName = "PAYID")
    @ManyToOne(optional = false)
    private PaymentEntity payID;
    
    public TicketEntity() {}

    public TicketEntity(Integer ticketID) {
        this.ticketID = ticketID;
    }

    public Integer getTicketID() {
        return ticketID;
    }

    public void setTicketID(Integer ticketID) {
        this.ticketID = ticketID;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public Integer getTicketsSold() {
        return ticketsSold;
    }

    public void setTicketsSold(Integer ticketsSold) {
        this.ticketsSold = ticketsSold;
    }

    public MovieEntity getMovieID() {
        return movieID;
    }

    public void setMovieID(MovieEntity movieID) {
        this.movieID = movieID;
    }

    public PaymentEntity getPayID() {
        return payID;
    }

    public void setPayID(PaymentEntity payID) {
        this.payID = payID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ticketID != null ? ticketID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TicketEntity)) {
            return false;
        }
        TicketEntity other = (TicketEntity) object;
        if ((this.ticketID == null && other.ticketID != null) || (this.ticketID != null && !this.ticketID.equals(other.ticketID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TicketEntity[ id=" + ticketID + " ]";
    }
}
