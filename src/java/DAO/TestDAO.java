/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Commande;
import entities.LigneCommande;
import entities.Produit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
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
    ProduitFacadeRemote produitRemote;
   

    @PostConstruct
    public void init() {

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        System.out.println( produitRemote.find(5));
        
    }

}
