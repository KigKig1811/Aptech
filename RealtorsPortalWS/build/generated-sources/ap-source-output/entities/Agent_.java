package entities;

import entities.Advertisement;
import entities.Feedbacks;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-07-03T09:52:21")
@StaticMetamodel(Agent.class)
public class Agent_ { 

    public static volatile SingularAttribute<Agent, String> agentAvatar;
    public static volatile SingularAttribute<Agent, Integer> agentId;
    public static volatile SingularAttribute<Agent, String> agentAddress;
    public static volatile SingularAttribute<Agent, String> agentPhone;
    public static volatile SingularAttribute<Agent, String> agentEmail;
    public static volatile SingularAttribute<Agent, Boolean> agentActive;
    public static volatile SingularAttribute<Agent, String> agentAcount;
    public static volatile SingularAttribute<Agent, String> agentName;
    public static volatile SingularAttribute<Agent, String> taxCode;
    public static volatile ListAttribute<Agent, Advertisement> advertisementList;
    public static volatile SingularAttribute<Agent, String> agentPassword;
    public static volatile ListAttribute<Agent, Feedbacks> feedbacksList;

}