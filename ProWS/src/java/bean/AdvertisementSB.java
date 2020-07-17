/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entities.*;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author LENOVO
 */
@Stateless
public class AdvertisementSB implements AdvertisementSBLocal {

    @PersistenceContext(unitName = "RealtorsPortalWSPU")
    private EntityManager em;


    @Override
    public boolean updateRead2(String seller, String agent, int idNotice) {
        String query = "UPDATE Notifications SET Readed='True' where (SellAccount=? or AgentAccount=?) and Readed='False' and DeleteStatus='False' and IdNotice=?";
        Query q = em.createNativeQuery(query);

        q.setParameter(1, seller);
        q.setParameter(2, agent);
        q.setParameter(3, idNotice);

        q.executeUpdate();
        return true;
    }


    @Override
    public boolean updateDeleteSt(String seller, String agent, int idNotice) {
        String query = "UPDATE Notifications SET DeleteStatus='True' where (SellAccount=? or AgentAccount=?) and DeleteStatus='False' and IdNotice=?";
        Query q = em.createNativeQuery(query);

        q.setParameter(1, seller);
        q.setParameter(2, agent);
        q.setParameter(3, idNotice);

        q.executeUpdate();
        return true;
    }

    @Override
    public List<Advertisement> checktinhethan(String seller, String agent) {
        String query ="select * from Advertisement where (SellAcount=? or AgentAcount=?) or and ExpDate < GETDATE()";
          Query q= em.createNativeQuery(query, Advertisement.class);
          q.setParameter(1, seller);
          q.setParameter(2, agent);
          return q.getResultList();
    }

    @Override
    public boolean addToFollow(Follow f) {
        String query = "insert Follow values(?,?,?,?,?,?,?)";
        em.createNativeQuery(query)
                .setParameter(1,f.getAdvId())
                .setParameter(2,f.getSellerAccount())
                .setParameter(3,f.getAgentAccount())
                .setParameter(4,f.getPhoto())
                .setParameter(5,f.getHeader())
                .setParameter(6,f.getContentFL())
                .setParameter(7,f.getNguoiFollow())
                .executeUpdate();
        
        return true;
    }

 
}
