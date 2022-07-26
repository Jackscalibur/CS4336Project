/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jacks
 */
@Entity
@Table(name = "THEATER")
@NamedQueries({
    @NamedQuery(name = "Theater.findAll", query = "SELECT t FROM Theater t"),
    @NamedQuery(name = "Theater.findByTheaterID", query = "SELECT t FROM Theater t WHERE t.theaterID = :theaterID"),
    @NamedQuery(name = "Theater.findByTheatername", query = "SELECT t FROM Theater t WHERE t.theaterName = :theaterName"),
    @NamedQuery(name = "Theater.findByZipCode", query = "SELECT t FROM Theater t WHERE t.zipCode = :zipCode")})

public class TheaterEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "THEATERID")
    private Integer theaterID;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "THEATERNAME")
    private String theaterName;
    
    @Size(max = 5)
    @Column(name = "ZIPCODE")
    private String zipCode;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "theaterid")
    private Collection<MovieEntity> movieCollection;
    
    public TheaterEntity() {}
    
    public TheaterEntity(Integer theaterID) {
        this.theaterID = theaterID;
    }
    
    public TheaterEntity(Integer theaterID, String theaterName) {
        this.theaterID = theaterID;
        this.theaterName = theaterName;
    }

    public Integer getTheaterID() {
        return theaterID;
    }

    public void setTheaterID(Integer theaterID) {
        this.theaterID = theaterID;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Collection<MovieEntity> getMovieCollection() {
        return movieCollection;
    }

    public void setMovieCollection(Collection<MovieEntity> movieCollection) {
        this.movieCollection = movieCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (theaterID != null ? theaterID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TheaterEntity)) {
            return false;
        }
        TheaterEntity other = (TheaterEntity) object;
        if ((this.theaterID == null && other.theaterID != null) || (this.theaterID != null && !this.theaterID.equals(other.theaterID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TheaterEntity[ id=" + theaterID + " ]";
    }
    
}
