package entities;

import entities.Advertisement;
import entities.Follow;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-07-04T08:39:52")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile ListAttribute<Category, Follow> followList;
    public static volatile SingularAttribute<Category, Integer> cateId;
    public static volatile ListAttribute<Category, Advertisement> advertisementList;
    public static volatile SingularAttribute<Category, String> cateName;

}