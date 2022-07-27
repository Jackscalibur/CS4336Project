package entity;

import entity.MovieEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-26T19:49:29")
@StaticMetamodel(TheaterEntity.class)
public class TheaterEntity_ { 

    public static volatile SingularAttribute<TheaterEntity, String> zipCode;
    public static volatile CollectionAttribute<TheaterEntity, MovieEntity> movieCollection;
    public static volatile SingularAttribute<TheaterEntity, Integer> theaterID;
    public static volatile SingularAttribute<TheaterEntity, String> theaterName;

}