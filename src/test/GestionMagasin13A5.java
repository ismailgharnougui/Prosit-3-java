/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import Entite.Produit;
import Gestion.Magasin;
import java.util.Date;
/**
 *
 * @author sanabenfadhel
 */
public class GestionMagasin13A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Produit p1=new Produit();
        System.out.println("id de p1 :"+p1.getId());
        System.out.println("marque de p1 "+p1.getMarque());
        System.out.println("prix de p1 :"+p1.getPrix());
        Produit p2=new Produit(1021, "Delice", "Lait");
        Produit p3=new Produit(2510, "Vitalait", "yarout");
        
        
        
        Produit p4=new Produit("tomate", "sicam", 3250, 1.2f);
   
        
        p4.afficher();
        p1.afficher();
        
        
        p2.afficher();
        p2.setPrix(0.7F);
        p2.afficher();
        System.out.println("to string");
        p2.toString();
        System.out.println(p2.toString());
        System.out.println(p2);
        System.out.println(p3.toString());
        System.out.println(p3);
        Date date=new Date();
        
        p3.setDate_exp(date);
        System.out.println(p3);
        
        Magasin m1=new Magasin(1, "ariana");
        m1.ajouter(p4);
        m1.ajouter(p3);
        System.out.println("test existe");
        m1.ajouter(p4);
        System.out.println("Affiche m1");
        m1.afficherMarquePro();
        System.out.println("to String");
        System.out.println(m1);
        
        System.out.println("le nombre Total ="+Magasin.nbTotal());
        Magasin m2=new Magasin(2, "tunis");
        m2.ajouter(p2);
        System.out.println("le nombre Total ="+Magasin.nbTotal());
        System.out.println(p1.comparer(p4));
        
        
        System.out.println(Produit.comparer(p2, p3));
        
        
        System.out.println("Plus prod");
        System.out.println(Magasin.PlusProdut(m1, m2));
        
        System.out.println(m1.PlusProdut(m2));
    }
    
}
