package entity;

import entity.MovieEntity;
import entity.PaymentEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-26T18:16:08")
@StaticMetamodel(TicketEntity.class)
public class TicketEntity_ { 

    public static volatile SingularAttribute<TicketEntity, Integer> ticketsSold;
    public static volatile SingularAttribute<TicketEntity, Date> salesDate;
    public static volatile SingularAttribute<TicketEntity, MovieEntity> movieID;
    public static volatile SingularAttribute<TicketEntity, PaymentEntity> payID;
    public static volatile SingularAttribute<TicketEntity, Integer> ticketID;

}