package Entite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;

/**
 *
 * @author sanabenfadhel
 */
public class Produit {

    private int id;
    private String marque, libelle;
    private float prix;
    private Date date_exp;

    public Produit(int id, String m, String l) {
        this.id = id;
        this.marque = m;
        this.libelle = l;

    }

    public Produit(int id, String m, String l, Date d) {
        this.id = id;
        this.marque = m;
        this.libelle = l;
        date_exp = d;
    }

    public Produit() {
        System.out.println("je suis le constructeur par defaut");
    }

    public Produit(String l, String m, int id, float p) {
        this.id = id;
        libelle = l;
        marque = m;
        prix = p;
    }

    public Produit(String l, String m, int id, float p, Date d) {
        this.id = id;
        libelle = l;
        marque = m;
        prix = p;
        date_exp = d;
    }

    public void afficher() {
        System.out.println("l'id :" + id + "\n marque :" + marque + "\nlibelle :" + libelle + "\nprix :" + prix);
    }

    public String toString() {
        return "l'id :" + id + "marque :" + marque + "libelle :"
                + libelle + "prix :" + prix + "Date_expr=" + date_exp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if (prix > 0) {
            this.prix = prix;
        } else {
            System.out.println("le prix doit être postif");
        }
    }

    public Date getDate_exp() {
        return date_exp;
    }

    public void setDate_exp(Date date_exp) {
        this.date_exp = date_exp;
    }
    
    public boolean comparer(Produit p)
    {
    
    if(this.id==p.id && p.libelle==libelle && p.prix==prix)
        return true;
    return false;
    }
    
    public static boolean comparer(Produit p1,Produit p2)
    {
     if(p1.id==p2.id && p1.libelle==p2.libelle && p1.prix==p2.prix)
        return true;
    return false;
    }

}
