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
    ProduitFacadeRemote pfr;
    @EJB
    ProduitFacadeRemote produitRemote;
    @EJB
    CommandeFacadeRemote commandeRemote;
    @EJB
    LigneCommandeFacadeRemote ligneCommandeRemote;
    @EJB
    UserFacadeRemote userRemote;

    @PostConstruct
    public void init() {

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        Commande commande = new Commande();
        commande.setIdUser(userRemote.find(1));
        commande.setEtat("en cours");
        commande.setDate(new Date());
        
        Collection<LigneCommande> lignesCommande = new ArrayList<LigneCommande>();
        LigneCommande lc = new LigneCommande();
        lc.setIdProduit(produitRemote.find(5));
        lc.setQte(1);
        lc.setIdCommade(commande);
        lignesCommande.add(lc);
        
        commande.setLigneCommandeCollection(lignesCommande);
        commandeRemote.create(commande);
        
    }

}
