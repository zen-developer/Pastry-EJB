/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Produit;
import java.util.Collection;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author admin
 */
@Stateless
public class ProduitFacade extends AbstractFacade<Produit> implements DAO.ProduitFacadeRemote {
    @PersistenceContext(unitName = "Pastry-EJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProduitFacade() {
        super(Produit.class);
    }

    @Override
    public Produit find(int id) {
        return em.find(Produit.class, id);
    }

    @Override
    public String sayHello(String name) {
        return "Hello "+name;
                
    }
    
    @Override
    public List<Produit> findAll(){
        TypedQuery<Produit> query=em.createNamedQuery("SELECT p FROM Produit p", Produit.class);
        return query.getResultList();
    }
    
}
