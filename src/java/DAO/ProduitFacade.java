package DAO;

import entities.Categorie;
import entities.Produit;
import java.util.Collection;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author admin
 */
@Stateless
public class ProduitFacade extends AbstractFacade<Produit> implements DAO.ProduitFacadeRemote {
    @PersistenceContext(name = "Pastry-EJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProduitFacade() {
        super(Produit.class);
    }

    @Override
    public Produit find(Object id) {
        return em.find(  Produit.class, id);
                
    }
    
    @Override
    public void create(Produit produit){
        em.persist(produit);
    }

    
    @Override
    public String sayHello(String name) {
        return "Hello "+name;
                
    }

    @Override
    public Collection<Produit> findAllProduits() {
       Query query=em.createNamedQuery("Produit.findAll");
       return (Collection<Produit>)query.getResultList();
    }

  
    
}
