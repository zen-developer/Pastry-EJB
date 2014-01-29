/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Carte;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author admin
 */
@Stateless
public class CarteFacade extends AbstractFacade<Carte> implements CarteFacadeRemote {
    @PersistenceContext(unitName = "Cake_EJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CarteFacade() {
        super(Carte.class);
    }
    
}
