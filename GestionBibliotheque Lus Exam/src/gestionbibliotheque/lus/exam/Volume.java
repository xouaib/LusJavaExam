/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbibliotheque.lus.exam;

/**
 *
 * @author ~Bouchaib
 */
public class Volume extends Document {

    /*Properties*/
    private String auteur;

    public Volume() {
        super();
        this.auteur = "Inconnu";
    }

    public Volume(int nmr, String ttr, String aut) {
        super(nmr, ttr);
        this.auteur = aut;
    }

    public void setAuteur(String aut) {
        this.auteur = aut;
    }

    public String getAuteur() {
        return this.auteur;
    }

    @Override
    public String toString() {
        return "auteur : " + this.getAuteur() + " , " + super.toString();
    }

}
