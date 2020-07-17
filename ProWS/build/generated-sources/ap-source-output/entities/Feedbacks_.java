package entities;

import entities.Agent;
import entities.Mode;
import entities.PrivateSeller;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-07-04T08:39:52")
@StaticMetamodel(Feedbacks.class)
public class Feedbacks_ { 

    public static volatile SingularAttribute<Feedbacks, Agent> agentId;
    public static volatile SingularAttribute<Feedbacks, String> feedbackContent;
    public static volatile SingularAttribute<Feedbacks, Mode> modeId;
    public static volatile SingularAttribute<Feedbacks, Integer> feedbackId;
    public static volatile SingularAttribute<Feedbacks, String> feedbackReply;
    public static volatile SingularAttribute<Feedbacks, PrivateSeller> seLLId;

}