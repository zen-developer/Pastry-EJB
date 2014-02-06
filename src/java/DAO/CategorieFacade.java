/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Categorie;
import entities.Produit;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author admin
 */
@Stateless
public class CategorieFacade extends AbstractFacade<Categorie> implements DAO.CategorieFacadeRemote {
    @PersistenceContext(unitName = "Pastry-EJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategorieFacade() {
        super(Categorie.class);
    }

    @Override
    public Categorie find(int id) {
        return em.find(Categorie.class, id);
    }

   
    
}
