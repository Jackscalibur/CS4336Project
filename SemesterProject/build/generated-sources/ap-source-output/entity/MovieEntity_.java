package entity;

import entity.TheaterEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-26T16:55:58")
@StaticMetamodel(MovieEntity.class)
public class MovieEntity_ { 

    public static volatile SingularAttribute<MovieEntity, String> movieDescription;
    public static volatile SingularAttribute<MovieEntity, String> movieTime;
    public static volatile SingularAttribute<MovieEntity, TheaterEntity> theaterID;
    public static volatile SingularAttribute<MovieEntity, Integer> movieID;
    public static volatile SingularAttribute<MovieEntity, String> movieTitle;
    public static volatile SingularAttribute<MovieEntity, Integer> movieDuration;

}