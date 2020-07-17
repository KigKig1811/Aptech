package entities;

import entities.City;
import entities.Street;
import entities.Ward;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-07-03T09:52:21")
@StaticMetamodel(District.class)
public class District_ { 

    public static volatile SingularAttribute<District, Integer> districtId;
    public static volatile SingularAttribute<District, String> districtName;
    public static volatile ListAttribute<District, Street> streetList;
    public static volatile SingularAttribute<District, City> cityId;
    public static volatile ListAttribute<District, Ward> wardList;

}