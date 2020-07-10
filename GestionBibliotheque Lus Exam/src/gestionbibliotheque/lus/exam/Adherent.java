/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbibliotheque.lus.exam;

import java.io.Serializable;

/**
 *
 * @author ~Bouchaib
 */
public class Adherent implements Serializable {

    /*Properties*/
    private String prenom;
    private String nom;

    public Adherent() {
        this.prenom = "Inconnu";
        this.nom = "Inconnu";
    }

    public Adherent(String prn, String nm) {
        this.prenom = prn;
        this.nom = nm;
    }

    public void setNom(String nm) {
        this.nom = nm;
    }

    public void setPrenom(String prn) {
        this.prenom = prn;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    @Override
    public String toString() {
        return "nom : " + this.getNom() + " , prenom : " + this.getPrenom();
    }

    public void emprunter(Livre l) {
        l.empruntable();
    }
    
    public void rendre(Livre l) {
        l.rendre();
    }
}
