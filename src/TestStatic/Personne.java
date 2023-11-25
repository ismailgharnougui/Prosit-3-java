/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestStatic;

/**
 *
 * @author sanabenfadhel
 */
public class Personne {
   private int id;
   private String nom;
   private static  int comp;
   
   
   
   public static int getNbPersonne()
   {
   return comp;
   }
    public Personne() {
        comp++;
    }

    public Personne(int id, String nom) {
        this.id = id;
        this.nom = nom;
        comp++;
    }
   public Personne(int id) {
        this.id = id;
        comp++;
    }
   
   
}
