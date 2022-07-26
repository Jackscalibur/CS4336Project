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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jacks
 */
@Entity
@Table(name= "MOVIE")
@NamedQueries({
    @NamedQuery (name = "Movie.findAll", query="SELECT m FROM Movie m"),
    @NamedQuery (name = "Movie.findByMovieID", query="SELECT m FROM Movie m WHERE m.movieID = :movieID"),
    @NamedQuery (name = "Movie.findByTitle", query = "SELECT m FROM Movie m WHERE m.movieTitle = :movieTitle"),
    @NamedQuery (name = "Movie.findByTimes", query = "SELECT m FROM Movie m WHERE m.movieTime = :movieTime"),
    @NamedQuery (name = "Movie.findByDuration", query = "SELECT m FROM Movie m WHERE m.movieDuration = :movieDuration"),
    @NamedQuery (name = "Movie.findByDescription", query = "SELECT m FROM Movie m WHERE m.movieDescription = :movieDescription"),
    @NamedQuery (name = "Movie.findByTheaterID", query = "SELECT m FROM Movie m WHERE m.theaterID = :theaterID")})

public class MovieEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOVIEID")
    private Integer movieID;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TITLE")
    private String movieTitle;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "MOVIETIME")
    private String movieTime;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOVIEDURATION")
    private int movieDuration;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "MOVIEDESCRIPTION")
    private String movieDescription;
    
    @JoinColumn(name = "THEATERID", referencedColumnName = "THEATERID")
    @ManyToOne(optional = false)
    private TheaterEntity theaterID;
    
    public MovieEntity() {}
    
    public MovieEntity(Integer movieID) {
        this.movieID = movieID;
    }
    
    public MovieEntity(Integer movieID, String movieTitle, String movieTime, int movieDuration, String movieDescription) {
        this.movieID = movieID;
        this.movieTitle = movieTitle;
        this.movieTime = movieTime;
        this.movieDuration = movieDuration;
        this.movieDescription = movieDescription;
    }

    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(Integer movieID) {
        this.movieID = movieID;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public TheaterEntity getTheaterID() {
        return theaterID;
    }

    public void setTheaterID(TheaterEntity theaterID) {
        this.theaterID = theaterID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movieID != null ? movieID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovieEntity)) {
            return false;
        }
        MovieEntity other = (MovieEntity) object;
        if ((this.movieID == null && other.movieID != null) || (this.movieID != null && !this.movieID.equals(other.movieID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MovieEntity[ id=" + movieID + " ]";
    }
    
}
