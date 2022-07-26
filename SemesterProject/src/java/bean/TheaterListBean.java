/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import ejb.MovieAndTheaterEJB;
import entity.TheaterEntity;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author jacks
 */
@Named(value = "theaterListBean")
@SessionScoped
public class TheaterListBean implements Serializable {
    
    @EJB
    private MovieAndTheaterEJB movieAndTheaterEJB;
    private String zip;
    
    public TheaterListBean() {}

    public MovieAndTheaterEJB getMovieAndTheaterEJB() {
        return movieAndTheaterEJB;
    }

    public void setMovieAndTheaterEJB(MovieAndTheaterEJB movieAndTheaterEJB) {
        this.movieAndTheaterEJB = movieAndTheaterEJB;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
    public String showTheaterList(String zip) {
        this.zip = zip;
        return "TheaterList";
    }
    
    public List<TheaterEntity> TheaterList() {
        return movieAndTheaterEJB.findTheaterByZipCode(zip);
    }
}
