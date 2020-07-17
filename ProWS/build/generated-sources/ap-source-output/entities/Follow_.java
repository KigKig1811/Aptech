package entities;

import entities.Category;
import entities.Mode;
import entities.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-07-04T08:39:52")
@StaticMetamodel(Follow.class)
public class Follow_ { 

    public static volatile SingularAttribute<Follow, Double> area;
    public static volatile SingularAttribute<Follow, Integer> agentId;
    public static volatile SingularAttribute<Follow, String> address;
    public static volatile SingularAttribute<Follow, String> cityProvince;
    public static volatile SingularAttribute<Follow, Integer> advId;
    public static volatile SingularAttribute<Follow, String> agentAcount;
    public static volatile SingularAttribute<Follow, String> photothumbnail;
    public static volatile SingularAttribute<Follow, String> ward;
    public static volatile SingularAttribute<Follow, User> userId;
    public static volatile SingularAttribute<Follow, String> content;
    public static volatile SingularAttribute<Follow, Date> expDate;
    public static volatile SingularAttribute<Follow, Integer> bedroom;
    public static volatile SingularAttribute<Follow, String> sellAcount;
    public static volatile SingularAttribute<Follow, Integer> followId;
    public static volatile SingularAttribute<Follow, Boolean> approved;
    public static volatile SingularAttribute<Follow, Mode> modeId;
    public static volatile SingularAttribute<Follow, Double> price;
    public static volatile SingularAttribute<Follow, String> street;
    public static volatile SingularAttribute<Follow, Category> cateId;
    public static volatile SingularAttribute<Follow, String> district;
    public static volatile SingularAttribute<Follow, Date> dateUp;
    public static volatile SingularAttribute<Follow, Boolean> paid;
    public static volatile SingularAttribute<Follow, String> header;
    public static volatile SingularAttribute<Follow, Integer> seLLId;

}