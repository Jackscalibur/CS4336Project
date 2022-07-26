/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import ejb.MovieAndTheaterEJB;
import entity.MovieEntity;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author jacks
 */
@Named(value = "paymentBean")
@SessionScoped
public class PaymentBean implements Serializable {
    
    @EJB
    private MovieAndTheaterEJB movieAndTheaterEJB;
    private MovieEntity movie;
    private String creditCard;
    private String message;
    
    public PaymentBean() {}

    public MovieAndTheaterEJB getMovieAndTheaterEJB() {
        return movieAndTheaterEJB;
    }

    public void setMovieAndTheaterEJB(MovieAndTheaterEJB movieAndTheaterEJB) {
        this.movieAndTheaterEJB = movieAndTheaterEJB;
    }

    public MovieEntity getMovie() {
        return movie;
    }

    public void setMovie(MovieEntity movie) {
        this.movie = movie;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String payment(MovieEntity movie) {
        this.movie = movie;
        return "Payment";
    }
    
    public void creditValidation() {
        if (creditCard.length() == 16) {
            message = "Purchase was successful!";
        }
        else {
            message = "Try again.";
        }
    }
}
