/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Commande;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author admin
 */
@Stateless
public class CommandeFacade extends AbstractFacade<Commande> implements DAO.CommandeFacadeRemote {
    @PersistenceContext(unitName = "Pastry-EJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @Override
    public void create(Commande commande){
        em.persist(commande);
    }
    
    @Override
    public void remove(Commande commande){
        em.remove(commande);
    }
    
    @Override
    public Commande find(int id){
        return em.find(Commande.class, id);
    }
    
    @Override
    public Collection<Commande> findUserCommandes(int id){
        Query query=em.createNamedQuery("SELECT c FROM Commande c WHERE c.idUser = :idUser");
        query.setParameter("idUser", id);
        return (Collection<Commande>)query.getResultList();
        
    }
    
    public CommandeFacade() {
        super(Commande.class);
    }
    
}
