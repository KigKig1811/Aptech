/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.ejb.Stateless;
import entities.*;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author MB
 */
@Stateless
public class FollowSB implements FollowSBLocal {
    @PersistenceContext(unitName = "FollowWSPU")
    private EntityManager em;

    @Override
    public List<Follow> findAll() {
        
        String query="SELECT * FROM Follow";
        Query q=em.createNativeQuery(query,Follow.class);
        return q.getResultList();
        
    }

    

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public boolean Follow(Integer userId, Integer seLLId, Integer modeId, Integer cateId, String header, String content, double price,
            String address, String street, String district, String ward, String cityProvince, double area, String photothumbnail,
            Date dateUp, Date expDate, Integer agentId, String agentAcount, String sellAcount, boolean approved, boolean paid, int bedroom) {
            String query="INSERT Follow VALUES(?,?,?,?,?,?,?,?,?)";
        em.createNativeQuery(query)
                .setParameter(1, userId)
                .setParameter(2, seLLId)
                .setParameter(3, modeId)
                .setParameter(4, cateId)
                .setParameter(5, header)
                .setParameter(6, content)
                .setParameter(7, price)
                .setParameter(8, address)
                .setParameter(9, street)
                .setParameter(10, district)
                .setParameter(11, ward)
                .setParameter(12,cityProvince)
                .setParameter(13, area)
                .setParameter(14, photothumbnail)
                .setParameter(15, dateUp)
                .setParameter(16, expDate)
                .setParameter(17, agentId)
                .setParameter(18, agentAcount)
                .setParameter(19, sellAcount)
                .setParameter(20, approved)
                .setParameter(21, paid)
                .setParameter(22, bedroom)
                
                .executeUpdate();
        return true;
    }

        
                                        
                                       
                                        
                                        
                                        
                                       
                                      
                                      
                                      
                                        
                                       
                                        
                                       
                                      
                                        
            
          
}
