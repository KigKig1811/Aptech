package entities;

import entities.Advertisement;
import entities.Feedbacks;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-07-04T08:39:52")
@StaticMetamodel(PrivateSeller.class)
public class PrivateSeller_ { 

    public static volatile SingularAttribute<PrivateSeller, String> sellAddress;
    public static volatile SingularAttribute<PrivateSeller, String> seLLAcount;
    public static volatile SingularAttribute<PrivateSeller, String> sellFullname;
    public static volatile SingularAttribute<PrivateSeller, String> sellPhone;
    public static volatile SingularAttribute<PrivateSeller, Boolean> sellActive;
    public static volatile SingularAttribute<PrivateSeller, String> sellEmail;
    public static volatile SingularAttribute<PrivateSeller, String> sellPassword;
    public static volatile SingularAttribute<PrivateSeller, Boolean> sellGender;
    public static volatile ListAttribute<PrivateSeller, Advertisement> advertisementList;
    public static volatile SingularAttribute<PrivateSeller, Integer> seLLId;
    public static volatile ListAttribute<PrivateSeller, Feedbacks> feedbacksList;
    public static volatile SingularAttribute<PrivateSeller, Date> sellDob;

}