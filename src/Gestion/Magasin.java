/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Entite.Produit;

/**
 *
 * @author sanabenfadhel
 */
public class Magasin {

    private int identifiant;
    private String adresse;
    private final int CAPACITE = 50;
    private Produit[] tabprod = new Produit[CAPACITE];
    private int compP;
    private static int nbTotalP;

    public Magasin(int id, String ad) {
        identifiant = id;
        adresse = ad;
    }

    public void ajouter(Produit p) {
        if (compP < CAPACITE) {
            if (!chercher(p)) {
                tabprod[compP] = p;
                compP++;
                nbTotalP++;
            } else {
                System.out.println("le produit existe");
            }
        } else {
            System.out.println("Magasin plein");
        }
    }

    public static int nbTotal() {
        return nbTotalP;
    }

    public void afficherMarquePro() {
        for (int i = 0; i < compP; i++) {
            System.out.println(tabprod[i].getMarque());
        }

    }

    public String toString() {
        String str = "l'ensemble des produits :\n";
        for (int i = 0; i < compP; i++) {
            str += tabprod[i] + "\n";
        }

        return "identifiant :" + identifiant
                + "adrese" + adresse + str;
    }

    public boolean chercher(Produit p) {
        for (int i = 0; i < compP; i++) {
            //if(Produit.comparer(p, tabprod[i]))
            if (p.comparer(tabprod[i])) {
                return true;
            }
        }
        return false;
    }
    
    public int chercherP(Produit p)
    {
    int pos=-1;
    
    for(int i=0;i<compP;i++)
    {
    if(tabprod[i].comparer(p))
        pos=i;
    }
    return pos;
    }
    
    public boolean supprimer(Produit p)
    {
    int index=chercherP(p);
    boolean test=false;
    
    if(index==-1)
        test=false;
    else{
    for(int i=index;i<compP-1;i++)
    {
    tabprod[index]=tabprod[i+1];
    }
    test=true;
    compP--;
    nbTotalP--;
    }
    return test;
    }
    
    
    public  Magasin PlusProdut(Magasin m)
    {
    if(this.compP>m.compP)
        return this;
    else
        return m;
    }
    public static Magasin PlusProdut(Magasin m1,Magasin m2)
    {
    if(m1.compP>m2.compP)
        return m1;
    else
        return m2;
    }
}
