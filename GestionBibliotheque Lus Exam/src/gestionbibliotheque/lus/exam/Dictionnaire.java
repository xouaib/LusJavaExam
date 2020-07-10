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
public class Dictionnaire extends Volume {

    public Dictionnaire() {
        super();
    }

    public Dictionnaire(int nmr,String ttr, String aut) {
        super(nmr, ttr, aut);
    }

    @Override
    public String toString() {
        return "dictionnaire => " + super.toString();
    }
}
