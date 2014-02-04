/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.LigneCommande;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author admin
 */
@Stateless
public class LigneCommandeFacade extends AbstractFacade<LigneCommande> implements DAO.LigneCommandeFacadeRemote {
    @PersistenceContext(unitName = "Pastry-EJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LigneCommandeFacade() {
        super(LigneCommande.class);
    }
    @Override
    public void create(LigneCommande ligneCommande){
        em.persist(ligneCommande);
    }
    @Override
    public void edit(LigneCommande ligneCommande){
        
    }
    
    @Override
    public void remove(LigneCommande ligneCommande){
        em.remove(ligneCommande);
    }
}
