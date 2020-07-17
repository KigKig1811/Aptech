package entities;

import entities.City;
import entities.District;
import entities.Ward;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-07-03T09:52:21")
@StaticMetamodel(Street.class)
public class Street_ { 

    public static volatile SingularAttribute<Street, String> streetName;
    public static volatile SingularAttribute<Street, District> districtId;
    public static volatile SingularAttribute<Street, City> cityId;
    public static volatile SingularAttribute<Street, Ward> wardId;
    public static volatile SingularAttribute<Street, Integer> streetId;

}