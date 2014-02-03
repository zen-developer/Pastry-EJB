/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import entities.Produit;
import java.util.Collection;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author zen
 */
@Singleton
@Startup
public class TestDAO implements TestDAOLocal {
    @EJB
    ProduitFacadeRemote pfr;
    
   @PostConstruct
   public void init(){
       System.out.println("++++++++++++++++++++++++++++++++++++++");
       Collection<Produit> liste=pfr.findAllProduits();
       for(Produit p:liste){
           System.out.println(p);
       }
   }
    
}
