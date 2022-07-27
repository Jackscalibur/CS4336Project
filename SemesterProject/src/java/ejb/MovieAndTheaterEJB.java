/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.MovieEntity;
import entity.TheaterEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jacks
 */
@Stateless
public class MovieAndTheaterEJB {

    @PersistenceContext(unitName = "SemesterProjectPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    public List<TheaterEntity> findTheaterByZipCode(String zip) {
        return em.createNamedQuery("TheaterEntity.findByZipCode", 
                TheaterEntity.class).setParameter("zipCode", zip).getResultList();
    }
    
    public List<MovieEntity> findMovieByTheater(TheaterEntity t) {
        return em.createNamedQuery("MovieEntity.findByTheaterID", 
                MovieEntity.class).setParameter("theaterID", t).getResultList();
    }
}
