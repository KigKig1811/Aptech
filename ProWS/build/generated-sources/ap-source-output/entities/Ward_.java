package entities;

import entities.City;
import entities.District;
import entities.Street;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-07-04T08:39:52")
@StaticMetamodel(Ward.class)
public class Ward_ { 

    public static volatile SingularAttribute<Ward, String> wardName;
    public static volatile SingularAttribute<Ward, District> districtId;
    public static volatile ListAttribute<Ward, Street> streetList;
    public static volatile SingularAttribute<Ward, Integer> wardId;
    public static volatile SingularAttribute<Ward, City> cityId;

}