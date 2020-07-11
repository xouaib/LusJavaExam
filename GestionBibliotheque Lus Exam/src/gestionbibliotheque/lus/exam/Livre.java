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
public class Livre extends Volume {

    public Livre() {
        super();
    }

    public Livre(int nmr, String ttr, String aut) {
        super(nmr, ttr, aut);
    }

    @Override
    public String toString() {
        return "livre => " + super.toString();
    }

    public void emprunter() {
        System.out.println(this);
    }

    void rendre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
