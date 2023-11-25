/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestStatic;

import jdk.jfr.Percentage;

/**
 *
 * @author sanabenfadhel
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personne p1=new Personne();
        System.out.println("le nomnbre :"+Personne.getNbPersonne());
        Personne p2=new Personne(1);
        System.out.println("le nomnbre :"+Personne.getNbPersonne());
        Personne p3=new Personne(2,"nn");
        System.out.println("le nomnbre :"+Personne.getNbPersonne());
         System.out.println("le nomnbre :"+p1.getNbPersonne());

  
         
        
    }
    
}
