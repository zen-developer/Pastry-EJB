/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Categorie;
import entities.Produit;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import org.apache.commons.io.IOUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author zen
 */
@Singleton
@Startup
public class TestDAO implements TestDAOLocal {

    
    @EJB
    ProduitFacadeRemote produitRemote;
    
    @EJB
    CategorieFacadeRemote categorieRemote;
   

    @PostConstruct
    public void init() {
       
        System.out.println("++++++++++++++++++++++++++++++++++++++");
//        Produit p=new Produit();
//        p.setDateExp(new Date());
//        p.setDescription("description");
//        p.setQuantite(25);
//        p.setIdProduit(1);
//        p.setNomProduit("nom du produit");
     
//      
//        FileInputStream fis;
//        try {
//            fis=new FileInputStream("C://Users/ZEN/Desktop/class.jpg");
//            byte[] bytes=IOUtils.toByteArray(fis);
//            p.setImage(bytes);
//            produitRemote.create(p);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(TestDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(TestDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       
        
        
        //p.setIdCat(2);
//        
//        Categorie categorie=categorieRemote.find(2);
//        System.out.println(categorie);
//        Collection<Produit> collection=categorie.getProduitCollection();
//        for(Produit pro : collection){
//            System.out.println(pro);
//        }
      System.out.println( produitRemote.find(5));
        
    }

}
