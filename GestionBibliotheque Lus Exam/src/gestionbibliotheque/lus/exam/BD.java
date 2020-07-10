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
public class BD extends Volume {

    /*Properties*/
    private String nomDessinateur;

    public BD() {
        super();
        this.nomDessinateur = "";
    }

    public BD(int nmr, String ttr, String aut, String nomD) {
        super(nmr, ttr, aut);
        this.nomDessinateur = nomD;
    }

    public String getNomDessinateur() {
        return this.nomDessinateur;
    }

    public void setNomDessinateur(String nomD) {
        this.nomDessinateur = nomD;
    }

    @Override
    public String toString() {
        return "dessinateur : " + this.getNomDessinateur() + " , " + super.toString();
    }
}
