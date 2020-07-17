package entities;

import entities.Advertisement;
import entities.Feedbacks;
import entities.Follow;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-07-03T09:52:21")
@StaticMetamodel(Mode.class)
public class Mode_ { 

    public static volatile SingularAttribute<Mode, String> modeName;
    public static volatile SingularAttribute<Mode, Integer> modeId;
    public static volatile ListAttribute<Mode, Follow> followList;
    public static volatile ListAttribute<Mode, Advertisement> advertisementList;
    public static volatile ListAttribute<Mode, Feedbacks> feedbacksList;

}