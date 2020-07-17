package entities;

import entities.District;
import entities.Street;
import entities.Ward;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-07-03T09:52:21")
@StaticMetamodel(City.class)
public class City_ { 

    public static volatile ListAttribute<City, District> districtList;
    public static volatile SingularAttribute<City, String> cityName;
    public static volatile ListAttribute<City, Street> streetList;
    public static volatile SingularAttribute<City, Integer> cityId;
    public static volatile ListAttribute<City, Ward> wardList;

}