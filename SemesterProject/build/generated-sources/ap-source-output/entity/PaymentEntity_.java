package entity;

import entity.TicketEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-26T19:49:29")
@StaticMetamodel(PaymentEntity.class)
public class PaymentEntity_ { 

    public static volatile CollectionAttribute<PaymentEntity, TicketEntity> ticketCollection;
    public static volatile SingularAttribute<PaymentEntity, Double> price;
    public static volatile SingularAttribute<PaymentEntity, String> creditCardNumber;
    public static volatile SingularAttribute<PaymentEntity, Integer> payID;
    public static volatile SingularAttribute<PaymentEntity, Date> payDate;

}