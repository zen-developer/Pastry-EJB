/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Commande;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

    public CommandeFacade() {
        super(Commande.class);
    }
    
}
