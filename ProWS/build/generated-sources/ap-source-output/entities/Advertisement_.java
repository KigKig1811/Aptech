package entities;

import entities.Agent;
import entities.Category;
import entities.LastedNews;
import entities.Mode;
import entities.PhotoDetail;
import entities.PrivateSeller;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-07-04T08:39:52")
@StaticMetamodel(Advertisement.class)
public class Advertisement_ { 

    public static volatile SingularAttribute<Advertisement, Agent> agentId;
    public static volatile SingularAttribute<Advertisement, String> ward;
    public static volatile SingularAttribute<Advertisement, String> content;
    public static volatile SingularAttribute<Advertisement, Date> expDate;
    public static volatile SingularAttribute<Advertisement, Boolean> approved;
    public static volatile SingularAttribute<Advertisement, Mode> modeId;
    public static volatile SingularAttribute<Advertisement, Double> price;
    public static volatile SingularAttribute<Advertisement, String> street;
    public static volatile SingularAttribute<Advertisement, Date> dateUp;
    public static volatile SingularAttribute<Advertisement, Double> area;
    public static volatile SingularAttribute<Advertisement, String> address;
    public static volatile SingularAttribute<Advertisement, String> cityProvince;
    public static volatile SingularAttribute<Advertisement, Integer> advId;
    public static volatile SingularAttribute<Advertisement, String> agentAcount;
    public static volatile SingularAttribute<Advertisement, String> photothumbnail;
    public static volatile SingularAttribute<Advertisement, Integer> userId;
    public static volatile SingularAttribute<Advertisement, Integer> bedroom;
    public static volatile SingularAttribute<Advertisement, String> sellAcount;
    public static volatile ListAttribute<Advertisement, LastedNews> lastedNewsList;
    public static volatile SingularAttribute<Advertisement, Category> cateId;
    public static volatile SingularAttribute<Advertisement, String> district;
    public static volatile SingularAttribute<Advertisement, Boolean> paid;
    public static volatile SingularAttribute<Advertisement, String> header;
    public static volatile ListAttribute<Advertisement, PhotoDetail> photoDetailList;
    public static volatile SingularAttribute<Advertisement, PrivateSeller> seLLId;

}