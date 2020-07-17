package entities;

import entities.Advertisement;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-07-04T08:39:52")
@StaticMetamodel(PhotoDetail.class)
public class PhotoDetail_ { 

    public static volatile SingularAttribute<PhotoDetail, String> image;
    public static volatile SingularAttribute<PhotoDetail, String> extension;
    public static volatile SingularAttribute<PhotoDetail, Advertisement> advId;
    public static volatile SingularAttribute<PhotoDetail, Integer> idImage;
    public static volatile SingularAttribute<PhotoDetail, String> guidimage;

}