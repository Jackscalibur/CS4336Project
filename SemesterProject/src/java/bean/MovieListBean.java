/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import ejb.MovieAndTheaterEJB;
import entity.MovieEntity;
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
@Named(value = "movieListBean")
@SessionScoped
public class MovieListBean implements Serializable {
    
    @EJB
    private MovieAndTheaterEJB movieAndTheaterEJB;
    private String ID;
    private TheaterEntity theater;
    
    public MovieListBean() {}

    public MovieAndTheaterEJB getMovieAndTheaterEJB() {
        return movieAndTheaterEJB;
    }

    public void setMovieAndTheaterEJB(MovieAndTheaterEJB movieAndTheaterEJB) {
        this.movieAndTheaterEJB = movieAndTheaterEJB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public TheaterEntity getTheater() {
        return theater;
    }

    public void setTheater(TheaterEntity theater) {
        this.theater = theater;
    }
    
    public String showMovieList(TheaterEntity theater) {
        this.theater = theater;
        return "MovieList";
    }
    
    public List<MovieEntity> MovieList() {
        return movieAndTheaterEJB.findMovieByTheater(theater);
    }
}
